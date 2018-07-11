package com.surwing.portlet.patient;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.surwing.MonitorException;
import com.surwing.model.Bed;
import com.surwing.model.Location;
import com.surwing.model.Patient;
import com.surwing.model.UserInfo;
import com.surwing.service.*;
import com.surwing.struts2.liferay.LiferayActionSupport;
import com.surwing.util.MonitorPropsKeys;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhaiyz
 */
public class PatientAddAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(PatientAddAction.class);

    private String mrn;

    private String name;

    private long locationId;

    private long bedId;

    private String bedNo;

    private int gender;

    private String birthday;

    private BigDecimal minTemperature;

    private BigDecimal maxTemperature;

    private String tagNo;

    private int actionType; // 1：添加，2：编辑，3：更换标签

    public String addPatientMrn() throws SystemException, PortalException {
        Patient patient = PatientLocalServiceUtil.fetchByMrn(mrn);
        if (patient != null) {
            name = patient.getName();
            locationId = patient.getLocationId();
            bedId = patient.getBedId();
            if (bedId > 0) {
                Bed bed = BedLocalServiceUtil.getBed(bedId);
                bedNo = bed.getBedNo();
            }
            gender = patient.getGender();
            if (patient.getBirthday() != null) {
                birthday = DateFormatUtils.format(patient.getBirthday(), "yyyy-MM-dd");
            }
            minTemperature = patient.getMinTemperature();
            maxTemperature = patient.getMaxTemperature();
            tagNo = patient.getTagNo();

            if (actionType == 1) {
                if (patient.isDischarge()) {
                    addActionMessage("该住院号已经出院，是否进行回院操作");
                } else {
                    addActionMessage("该住院号已经入院，是否对其修改");
                }
            }
        } else {
            minTemperature = GetterUtil.getBigDecimal(
                    SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocation().getLocationId(),
                            MonitorPropsKeys.PATIENT_DEFAULT_MIN_TEMP), new BigDecimal("35"));
            maxTemperature = GetterUtil.getBigDecimal(
                    SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocation().getLocationId(),
                            MonitorPropsKeys.PATIENT_DEFAULT_MAX_TEMP), new BigDecimal("42"));
        }
        return SUCCESS;
    }

    public String addPatient() {
        try {
            if (locationId == 0) {
                addActionError("请管理员为您设置默认病区");
                return ERROR;
            } else {
                PatientLocalServiceUtil.addPatient(mrn, name, locationId, bedId, gender, birthday, minTemperature,
                        maxTemperature, tagNo, getServiceContext());
            }
            switch (actionType) {
                case 1: {
                    addActionMessage("病人注册成功");
                    break;
                }
                case 2: {
                    addActionMessage("病人修改成功");
                    break;
                }
                case 3: {
                    addActionMessage("病人更换标签成功");
                    break;
                }
                default:
                    addActionMessage("病人注册成功");
            }
        } catch (MonitorException me) {
            addActionError(me.getMessage());
            return ERROR;
        } catch (Exception e) {
            LOG.error("病人注册失败", e);
            addActionError("病人注册失败");
            return ERROR;
        }
        return SUCCESS;
    }

    public Location getUserDefaultLocation() throws SystemException, PortalException {
        UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
        long locationId = userInfo.getLocationId();
        if (locationId > 0) {
            return LocationLocalServiceUtil.getLocation(locationId);
        } else {
            return null;
        }
    }

    public List<Bed> getBeds() throws SystemException, PortalException {
        Location userDefaultLocation = getUserDefaultLocation();
        return BedLocalServiceUtil.findUsableBeds(userDefaultLocation.getLocationId());
    }

    private long getDefaultAreaId() {
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            return userInfo.getLocationId();
        } catch (Exception e) {
            return 0L;
        }
    }

    public boolean getEsbEnabled() {
        try {
            long locationId = getDefaultAreaId();
            Location location = LocationLocalServiceUtil.fetchLocation(locationId);
            if (location != null) {
                return location.getEsbEnabled();
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn == null ? null : mrn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public long getBedId() {
        return bedId;
    }

    public void setBedId(long bedId) {
        this.bedId = bedId;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(BigDecimal minTemperature) {
        this.minTemperature = minTemperature;
    }

    public BigDecimal getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(BigDecimal maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo;
    }

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }
}
