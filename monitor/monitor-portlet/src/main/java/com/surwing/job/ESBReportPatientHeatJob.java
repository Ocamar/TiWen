package com.surwing.job;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.model.Location;
import com.surwing.model.Patient;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.util.ESBHelper;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zhaiyz on 18-3-15.
 */
public class ESBReportPatientHeatJob extends MonitorBaseMessageListener {

    private static final Log LOG = LogFactoryUtil.getLog(ESBReportPatientHeatJob.class);


    @Override
    protected void doJob(long companyId) throws Exception {
        LOG.info("上报病人体温任务开始");

        LOG.info("获取所有启用ESB的病区");
        List<Location> locations = LocationLocalServiceUtil.getEsbEnabledLocations();
        LOG.info("共有" + locations.size() + "个病区启用了ESB");

        for (Location location : locations) {
            try {
                LOG.info("开始处理病区：" + location.getLocationName());
                List<Patient> inpatients = PatientLocalServiceUtil.getInpatientByLocation(location.getLocationId());

                for (Patient patient : inpatients) {
                    try {
                        if (StringUtils.isBlank(patient.getTagNo())) {
                            // 未绑定标签不上报
                            continue;
                        }
                        if (patient.getTemperature().compareTo(BigDecimal.valueOf(30)) == -1) {
                            // 小于30度不上报
                            continue;
                        }
                        ESBHelper.reportPatientHeat(patient.getMrn(), patient.getName(), patient.getTemperature());
                    } catch (Exception e) {
                        LOG.error("上报病人体温出错：" + patient.getMrn() + "," + patient.getName() + "," + patient.getTemperature().toString(), e);
                    }
                }

            } catch (Exception e) {
                LOG.error("处理病区出错：" + location.getLocationName(), e);
            }
        }

        LOG.info("上报病人体温任务结束");
    }
}
