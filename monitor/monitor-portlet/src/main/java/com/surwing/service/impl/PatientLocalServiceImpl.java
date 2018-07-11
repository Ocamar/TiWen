package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.surwing.MonitorException;
import com.surwing.model.*;
import com.surwing.search.PatientDisplayTerms;
import com.surwing.search.PatientStatusDisplayTerms;
import com.surwing.service.base.PatientLocalServiceBaseImpl;
import com.surwing.util.MonitorPropsKeys;
import com.surwing.util.OrderByTermHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the patient local service.
 * <p>
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.PatientLocalService} interface.
 * <p>
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.PatientLocalServiceBaseImpl
 * @see com.surwing.service.PatientLocalServiceUtil
 */
public class PatientLocalServiceImpl extends PatientLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.PatientLocalServiceUtil} to
     * access the patient local service.
     */

    public Patient addPatient(String mrn, String name, long locationId, long bedId, int gender, String birthday,
                              BigDecimal minTemperature, BigDecimal maxTemperature, String tagNo,
                              ServiceContext serviceContext) throws SystemException, PortalException, ParseException {
        Patient patient = patientPersistence.fetchByMrn(mrn);
        Date now = new Date();
        boolean isNew = false;
        if (patient == null) {
            isNew = true;
            long patientId = counterLocalService.increment(Patient.class.getName());
            patient = patientPersistence.create(patientId);
            patient.setTemperature(BigDecimal.ZERO);
            patient.setLatestDate(now);
            patient.setTemperatureIn8h(BigDecimal.ZERO);
            patient.setHighestDate(now);
            patient.setAlarmLevel(BigDecimal.valueOf(3L));
            patient.setCreateDate(now);
        } else {
            if (patient.getBedId() > 0) {
                bedLocalService.unbindPatient(patient.getBedId());
            }
            if (StringUtils.isNotBlank(patient.getTagNo())) {
                Tag tag = tagLocalService.fetchByTagNo(patient.getTagNo());
                if (tag != null) {
                    tag.setPatientId(0L);
                    tag.setModifiedDate(now);
                    tagLocalService.updateTag(tag);
                }
            }
        }
        patient.setMrn(mrn);
        patient.setName(name);
        patient.setLocationId(locationId);
        patient.setBedId(bedId);
        Location location = locationLocalService.getLocation(locationId);
        if (location.getEsbEnabled()) {
            bedLocalService.unbindPatient(bedId);
        }
        bedLocalService.bindPatient(bedId, patient.getPatientId());
        patient.setGender(gender);
        if (StringUtils.isNotBlank(birthday)) {
            try {
                Date birthdayDate = DateUtils.parseDate(birthday, "yyyy-MM-dd");
                patient.setBirthday(birthdayDate);
            } catch (ParseException pe) {
                throw new MonitorException("日期格式错误，应该为yyyy-MM-dd");
            }
        }
        patient.setMinTemperature(minTemperature);
        patient.setMaxTemperature(maxTemperature);
        if (Validator.isNotNull(tagNo)) {
            Tag tag = tagPersistence.fetchByTagNo(tagNo);
            if (tag == null || tag.getLocationId() != patient.getLocationId() ||
                    (tag.getPatientId() > 0 && tag.getPatientId() != patient.getPatientId())) {
                throw new MonitorException("标签不存在或已绑定病人");
            }
            patient.setTagNo(tagNo);
            tag.setPatientId(patient.getPatientId());
            tagLocalService.updateTag(tag);
        } else {
            patient.setTagNo(StringPool.BLANK);
        }

        patient.setCompanyId(serviceContext.getCompanyId());
        patient.setGroupId(serviceContext.getScopeGroupId());
        patient.setModifiedDate(now);
        patient.setDischarge(false);
        patient.setDeleted(false);

        if (isNew) {
            return super.addPatient(patient);
        } else {
            return super.updatePatient(patient);
        }
    }

    public Patient fetchByMrn(String mrn) throws SystemException {
        return patientPersistence.fetchByMrn(mrn);
    }

    public List<Patient> findByDisplayTerms(PatientDisplayTerms displayTerms, OrderByComparator obc, int start,
                                            int end, ServiceContext serviceContext) throws SystemException {
        DynamicQuery dynamicQuery = getPatientDynamicQuery(displayTerms, serviceContext);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        dynamicQuery.addOrder(OrderFactoryUtil.asc("discharge"));
        dynamicQuery.addOrder(OrderFactoryUtil.desc("patientId"));
        return dynamicQuery(dynamicQuery, start, end);
    }

    public int countByDisplayTerms(PatientDisplayTerms displayTerms, ServiceContext serviceContext) throws
            SystemException {
        DynamicQuery dynamicQuery = getPatientDynamicQuery(displayTerms, serviceContext);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    private DynamicQuery getPatientDynamicQuery(PatientDisplayTerms displayTerms, ServiceContext serviceContext) {
        long locationId = displayTerms.getLocationId();
        String mrn = displayTerms.getMrn();
        String tagNo = displayTerms.getTagNo();
        int dischargeStatus = displayTerms.getDischargeStatus();
        long companyId = serviceContext.getCompanyId();
        long groupId = serviceContext.getScopeGroupId();

        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        dynamicQuery.add(PropertyFactoryUtil.forName("deleted").eq(Boolean.FALSE));
        if (Validator.isNotNull(mrn)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("mrn").eq(mrn));
        }
        if (Validator.isNotNull(tagNo)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("tagNo").eq(tagNo));
        }
        if (dischargeStatus == 1) {
            dynamicQuery.add(PropertyFactoryUtil.forName("discharge").eq(false));
        } else if (dischargeStatus == 2) {
            dynamicQuery.add(PropertyFactoryUtil.forName("discharge").eq(true));
        }

        return dynamicQuery;
    }

    public void updatePatientStatus(long patientId, BigDecimal temperature) throws SystemException, PortalException {
        Patient patient = getPatient(patientId);
        patient.setTemperature(temperature);
        Date now = new Date();
        patient.setLatestDate(now);
        Temperature maxIn8h = temperatureLocalService.getPatientTemperatureIn8h(patientId);
        if (maxIn8h == null || temperature.compareTo(maxIn8h.getTemperature()) == 1) {
            patient.setTemperatureIn8h(temperature);
            patient.setHighestDate(now);
        }
        patient.setFebrile(isFebrile(patient, temperature));
        patient.setAlarmLevel(getAlarmLevel(patient.getLocationId(), temperature));
        patient.setModifiedDate(now);
        super.updatePatient(patient);
    }

    private boolean isFebrile(Patient patient, BigDecimal temperature) {
        if (temperature.compareTo(patient.getMinTemperature()) == -1) {
            return true;
        }

        if (temperature.compareTo(patient.getMaxTemperature()) == 1) {
            return true;
        }

        return false;
    }

    private BigDecimal getAlarmLevel(long locationId, BigDecimal temperature) throws SystemException {
        BigDecimal redLevelTempRangeMin = GetterUtil.getBigDecimal(
                systemParameterLocalService.getByLocationIdAndKey(locationId,
                        MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MIN), new BigDecimal("35.5"));

        BigDecimal redLevelTempRangeMax = GetterUtil.getBigDecimal(
                systemParameterLocalService.getByLocationIdAndKey(locationId,
                        MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MAX), new BigDecimal("39"));

        BigDecimal orangeLevelTempRangeMin = GetterUtil.getBigDecimal(
                systemParameterLocalService.getByLocationIdAndKey(locationId,
                        MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MIN), new BigDecimal("36.5"));

        BigDecimal orangeLevelTempRangeMax = GetterUtil.getBigDecimal(
                systemParameterLocalService.getByLocationIdAndKey(locationId,
                        MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MAX), new BigDecimal("37.2"));

        if (temperature.compareTo(redLevelTempRangeMin) != 1 || temperature.compareTo(redLevelTempRangeMax) != -1) {
            return BigDecimal.ONE;
        } else if (temperature.compareTo(orangeLevelTempRangeMin) != 1 ||
                temperature.compareTo(orangeLevelTempRangeMax) != -1) {
            return BigDecimal.valueOf(2L);
        } else {
            return BigDecimal.valueOf(3L);
        }
    }

    public List<Patient> findPatientStatusByDisplayTerms(PatientStatusDisplayTerms displayTerms, OrderByComparator
            obc, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
        DynamicQuery dynamicQuery = getPatientStatusByDisplayTerms(displayTerms, serviceContext);
        OrderByTermHelper.addOrderByTerm(obc, dynamicQuery);
        dynamicQuery.addOrder(OrderFactoryUtil.asc("alarmLevel"));
        dynamicQuery.addOrder(OrderFactoryUtil.desc("patientId"));
        return dynamicQuery(dynamicQuery, start, end);
    }

    public int countPatientStatusByDisplayTerms(PatientStatusDisplayTerms displayTerms, ServiceContext serviceContext)
            throws SystemException, PortalException {
        DynamicQuery dynamicQuery = getPatientStatusByDisplayTerms(displayTerms, serviceContext);
        return Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
    }

    private DynamicQuery getPatientStatusByDisplayTerms(PatientStatusDisplayTerms displayTerms, ServiceContext
            serviceContext) throws SystemException, PortalException {
        long companyId = serviceContext.getCompanyId();
        long groupId = serviceContext.getScopeGroupId();
        long locationId = displayTerms.getLocationId();
        int febrile = displayTerms.getFebrile();
        String mrn = displayTerms.getMrn();
        String name = displayTerms.getName();

        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        dynamicQuery.add(PropertyFactoryUtil.forName("deleted").eq(Boolean.FALSE));
        if (febrile == 1) {
            dynamicQuery.add(PropertyFactoryUtil.forName("febrile").eq(true));
        } else if (febrile == 2) {
            dynamicQuery.add(PropertyFactoryUtil.forName("febrile").eq(false));
        }
        if (Validator.isNotNull(mrn)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("mrn").eq(mrn));
        }
        if (Validator.isNotNull(name)) {
            dynamicQuery.add(PropertyFactoryUtil.forName("name").eq(name));
        }
        dynamicQuery.add(PropertyFactoryUtil.forName("discharge").eq(false));

        return dynamicQuery;
    }

    public List<Patient> findMajorPatients(long locationId, ServiceContext serviceContext) throws SystemException {
        long companyId = serviceContext.getCompanyId();
        long groupId = serviceContext.getScopeGroupId();

        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
        dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
        dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        dynamicQuery.add(PropertyFactoryUtil.forName("discharge").eq(false));
        dynamicQuery.add(PropertyFactoryUtil.forName("deleted").eq(Boolean.FALSE));
        dynamicQuery.add(PropertyFactoryUtil.forName("temperature").gt(BigDecimal.ZERO));

        dynamicQuery.addOrder(OrderFactoryUtil.asc("alarmLevel"));

        return dynamicQuery(dynamicQuery, 0, 12);
    }

    public void discharge(long patientId) throws SystemException, PortalException {
        Patient patient = getPatient(patientId);
        Date now = new Date();

        Bed bed = bedLocalService.fetchBed(patient.getBedId());
        if (bed != null) {
            bed.setPatientId(0L);
            bed.setModifiedDate(now);
            bedLocalService.updateBed(bed);
        }

        Tag tag = tagLocalService.fetchByTagNo(patient.getTagNo());
        if (tag != null) {
            tag.setPatientId(0L);
            tag.setModifiedDate(now);
            tagLocalService.updateTag(tag);
        }

        if (!patient.getDischarge()) {
            patient.setTagNo(StringPool.BLANK);
            patient.setDischarge(true);
            patient.setBedId(0L);
            patient.setModifiedDate(now);
            super.updatePatient(patient);
        }
    }

    public boolean hasFebrilePatient() throws SystemException {
        int febrilePatientCount = patientPersistence.countByFebrile(true, false, Boolean.FALSE);
        return febrilePatientCount > 0;
    }

    public void unRegisterTag(long patientId) throws SystemException, PortalException {
        Patient patient = getPatient(patientId);
        Date now = new Date();

        Tag tag = tagLocalService.fetchByTagNo(patient.getTagNo());
        if (tag != null) {
            tag.setPatientId(0L);
            tag.setModifiedDate(now);
            tagLocalService.updateTag(tag);
        }

        patient.setTagNo(StringPool.BLANK);
        patient.setModifiedDate(now);
        super.updatePatient(patient);
    }

    @Override
    public Patient deletePatient(long patientId) throws PortalException, SystemException {
        discharge(patientId);

        Patient patient = getPatient(patientId);
        patient.setDeleted(Boolean.TRUE);
        patient.setModifiedDate(new Date());
        return super.updatePatient(patient);
    }

    public List<Patient> getInpatientByLocation(long locationId) throws SystemException {
        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("locationId").eq(locationId));
        dynamicQuery.add(PropertyFactoryUtil.forName("discharge").eq(false));
        dynamicQuery.add(PropertyFactoryUtil.forName("deleted").eq(false));
        return dynamicQuery(dynamicQuery);
    }
}
