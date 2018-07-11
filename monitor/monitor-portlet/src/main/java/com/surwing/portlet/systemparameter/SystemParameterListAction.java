package com.surwing.portlet.systemparameter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.surwing.model.UserInfo;
import com.surwing.service.SystemParameterLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;
import com.surwing.util.MonitorPropsKeys;

import java.math.BigDecimal;

/**
 * @author zhaiyz
 */
public class SystemParameterListAction extends LiferayActionSupport {

    private boolean temperatureAudioAlarm;

    private int tagTimeOut;

    private BigDecimal patientDefaultMinTemp;

    private BigDecimal patientDefaultMaxTemp;

    private BigDecimal redLevelTempRangeMin;

    private BigDecimal redLevelTempRangeMax;

    private BigDecimal orangeLevelTempRangeMin;

    private BigDecimal orangeLevelTempRangeMax;

    @Override
    public String input() throws Exception {
        temperatureAudioAlarm = GetterUtil.getBoolean(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.TEMPERATURE_AUDIO_ALARM), false);

        tagTimeOut = GetterUtil.getInteger(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.TAG_TIMEOUT), 5);

        patientDefaultMinTemp = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.PATIENT_DEFAULT_MIN_TEMP), new BigDecimal("35"));

        patientDefaultMaxTemp = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.PATIENT_DEFAULT_MAX_TEMP), new BigDecimal("42"));

        redLevelTempRangeMin = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MIN), new BigDecimal("35.5"));

        redLevelTempRangeMax = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MAX), new BigDecimal("39"));

        orangeLevelTempRangeMin = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MIN), new BigDecimal("36.5"));

        orangeLevelTempRangeMax = GetterUtil.getBigDecimal(
                SystemParameterLocalServiceUtil.getByLocationIdAndKey(getUserDefaultLocationId(),
                        MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MAX), new BigDecimal("37.2"));

        return super.input();
    }

    @Override
    public String execute() throws Exception {
        addActionMessage("修改参数成功");
        return BACK;
    }

    public long getUserDefaultLocationId() throws SystemException, PortalException {
        UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
        return userInfo.getLocationId();
    }

    public boolean getTemperatureAudioAlarm() {
        return temperatureAudioAlarm;
    }

    public void setTemperatureAudioAlarm(boolean temperatureAudioAlarm) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.TEMPERATURE_AUDIO_ALARM, String.valueOf(temperatureAudioAlarm));
    }

    public int getTagTimeOut() {
        return tagTimeOut;
    }

    public void setTagTimeOut(int tagTimeOut) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.TAG_TIMEOUT, String.valueOf(tagTimeOut));
    }

    public BigDecimal getPatientDefaultMinTemp() {
        return patientDefaultMinTemp;
    }

    public void setPatientDefaultMinTemp(BigDecimal patientDefaultMinTemp) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.PATIENT_DEFAULT_MIN_TEMP, patientDefaultMinTemp.toString());
    }

    public BigDecimal getPatientDefaultMaxTemp() {
        return patientDefaultMaxTemp;
    }

    public void setPatientDefaultMaxTemp(BigDecimal patientDefaultMaxTemp) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.PATIENT_DEFAULT_MAX_TEMP, patientDefaultMaxTemp.toString());
    }

    public boolean isTemperatureAudioAlarm() {
        return temperatureAudioAlarm;
    }

    public BigDecimal getRedLevelTempRangeMin() {
        return redLevelTempRangeMin;
    }

    public void setRedLevelTempRangeMin(BigDecimal redLevelTempRangeMin) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MIN, redLevelTempRangeMin.toString());
    }

    public BigDecimal getRedLevelTempRangeMax() {
        return redLevelTempRangeMax;
    }

    public void setRedLevelTempRangeMax(BigDecimal redLevelTempRangeMax) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.RED_LEVEL_TEMP_RANGE_MAX, redLevelTempRangeMax.toString());
    }

    public BigDecimal getOrangeLevelTempRangeMin() {
        return orangeLevelTempRangeMin;
    }

    public void setOrangeLevelTempRangeMin(BigDecimal orangeLevelTempRangeMin) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MIN, orangeLevelTempRangeMin.toString());
    }

    public BigDecimal getOrangeLevelTempRangeMax() {
        return orangeLevelTempRangeMax;
    }

    public void setOrangeLevelTempRangeMax(BigDecimal orangeLevelTempRangeMax) throws PortalException, SystemException {
        SystemParameterLocalServiceUtil.addOrUpdateSystemParameter(getUserDefaultLocationId(),
                MonitorPropsKeys.ORANGE_LEVEL_TEMP_RANGE_MAX, orangeLevelTempRangeMax.toString());
    }
}
