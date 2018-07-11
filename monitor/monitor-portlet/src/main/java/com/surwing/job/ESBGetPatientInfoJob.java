package com.surwing.job;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.service.ServiceContext;
import com.surwing.esb.PatientInfo;
import com.surwing.esb.PatientInfos;
import com.surwing.model.Bed;
import com.surwing.model.Location;
import com.surwing.model.Patient;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.SystemParameterLocalServiceUtil;
import com.surwing.util.ESBHelper;
import com.surwing.util.MonitorPropsKeys;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by zhaiyz on 18-3-15.
 */
public class ESBGetPatientInfoJob extends MonitorBaseMessageListener {

    private static final Log LOG = LogFactoryUtil.getLog(ESBGetPatientInfoJob.class);

    @Override
    protected void doJob(long companyId) throws Exception {
        LOG.info("从ESB同步病人信息开始");

        LOG.info("获取所有启用ESB的病区");
        List<Location> locations = LocationLocalServiceUtil.getEsbEnabledLocations();
        LOG.info("共有" + locations.size() + "个病区启用了ESB");

        ServiceContext serviceContext = new ServiceContext();
        serviceContext.setCompanyId(companyId);
        serviceContext.setScopeGroupId(20182L);

        for (Location location : locations) {
            try {
                LOG.info("开始处理病区：" + location.getLocationName());
                List<Patient> inpatients = PatientLocalServiceUtil.getInpatientByLocation(location.getLocationId());
                Set<String> inpatientMrns = new HashSet<>();
                for (Patient patient : inpatients) {
                    inpatientMrns.add(patient.getMrn());
                }
                LOG.info("病区" + location.getLocationName() + "共有在院病人" + inpatientMrns.size() + "个");

                PatientInfos patientInfos = ESBHelper.getPatientInfos(location.getLocationName());
                Set<String> esbMrns = new HashSet<>();
                Map<String, PatientInfo> esbPatients = new HashMap<>();
                for (PatientInfo patientInfo : patientInfos.getPatientInfos()) {
                    esbMrns.add(patientInfo.getPatientID());
                    esbPatients.put(patientInfo.getPatientID(), patientInfo);
                }

                // 出院
                handleDischarge(inpatients, esbMrns);

                // 更新/换床
                handleUpdate(serviceContext, inpatients, esbMrns, esbPatients);

                // 入院
                handleInpatient(serviceContext, location, inpatientMrns, patientInfos);

                LOG.info("结束处理病区：" + location.getLocationName());
            } catch (Exception e) {
                LOG.error("处理病区出错：" + location.getLocationName(), e);
            }
        }

        LOG.info("从ESB同步病人信息结束");
    }

    // 处理入院病人
    private void handleInpatient(ServiceContext serviceContext,
                                 Location location,
                                 Set<String> inpatientMrns,
                                 PatientInfos patientInfos) throws com.liferay.portal.kernel.exception.SystemException {
        BigDecimal minTemperature = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(location.getLocationId(),
                        MonitorPropsKeys.PATIENT_DEFAULT_MIN_TEMP), new BigDecimal("35"));
        BigDecimal maxTemperature = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(location.getLocationId(),
                        MonitorPropsKeys.PATIENT_DEFAULT_MAX_TEMP), new BigDecimal("42"));
        for (PatientInfo patientInfo : patientInfos.getPatientInfos()) {
            if (!inpatientMrns.contains(patientInfo.getPatientID())) {
                LOG.info("病人入院: " + patientInfo.getPatientID() + "," + patientInfo.getcPatientName());
                Bed bed = BedLocalServiceUtil.getByBedAlias(location.getLocationId(), patientInfo.getBedNo());
                if (bed == null) {
                    LOG.info("床位不存在：" + patientInfo.getBedNo());
                    continue;
                }
                try {
                    PatientLocalServiceUtil.addPatient(patientInfo.getPatientID(),
                            patientInfo.getcPatientName(),
                            location.getLocationId(),
                            bed.getBedId(),
                            0, // 默认性别为男
                            StringUtils.substring(patientInfo.getAdmissionDateTime(), 0, 10),
                            minTemperature,
                            maxTemperature,
                            "",
                            serviceContext
                    );
                } catch (Exception e) {
                    LOG.info("病人入院失败: " + patientInfo.getPatientID() + "," + patientInfo.getcPatientName(), e);
                }
            }
        }
    }

    // 处理更新病人
    private void handleUpdate(ServiceContext serviceContext,
                              List<Patient> inpatients,
                              Set<String> esbMrns,
                              Map<String, PatientInfo> esbPatients)
            throws SystemException {
        for (Patient patient : inpatients) {
            if (esbMrns.contains(patient.getMrn())) {
                LOG.info("病人更新: " + patient.getMrn() + "," + patient.getName());
                PatientInfo esbPatient = esbPatients.get(patient.getMrn());
                Bed bed = BedLocalServiceUtil.getByBedAlias(patient.getLocationId(), esbPatient.getBedNo());
                if (bed == null) {
                    LOG.info("床位不存在：" + esbPatient.getBedNo());
                    continue;
                }

                // 如果病人的名字和床位没有变，那么就不需要更新
                if (StringUtils.equals(patient.getName(), esbPatient.getcPatientName())
                        && bed.getBedId() == patient.getBedId()) {
                    continue;
                }

                try {
                    PatientLocalServiceUtil.addPatient(patient.getMrn(),
                            esbPatient.getcPatientName(),
                            patient.getLocationId(),
                            bed.getBedId(),
                            patient.getGender(),
                            DateFormatUtils.format(patient.getBirthday(), "yyyy-MM-dd"),
                            patient.getMinTemperature(),
                            patient.getMaxTemperature(),
                            patient.getTagNo(),
                            serviceContext
                    );
                } catch (Exception e) {
                    LOG.error("病人更新失败: " + patient.getMrn() + "," + patient.getName(), e);
                }
            }
        }
    }

    // 处理出院病人
    private void handleDischarge(List<Patient> inpatients, Set<String> esbMrns) {
        for (Patient patient : inpatients) {
            if (!esbMrns.contains(patient.getMrn())) {
                LOG.info("病人出院: " + patient.getMrn() + "," + patient.getName());
                try {
                    PatientLocalServiceUtil.discharge(patient.getPatientId());
                } catch (Exception e) {
                    LOG.error("病人出院失败: " + patient.getMrn() + "," + patient.getName(), e);
                }
            }
        }
    }
}
