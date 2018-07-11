package com.surwing.portlet.patientstatus;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.model.Bed;
import com.surwing.model.Patient;
import com.surwing.model.UserInfo;
import com.surwing.search.PatientStatusDisplayTerms;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.SystemParameterLocalServiceUtil;
import com.surwing.service.TemperatureLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;
import com.surwing.util.MonitorPropsKeys;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;

/**
 * @author zhaiyz
 */
public class PatientStatusSearchAction extends SearchActionSupport<PatientStatusDisplayTerms, Patient> {

    private static final Log LOG = LogFactoryUtil.getLog(PatientStatusSearchAction.class);

    @Override
    public PatientStatusDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        PatientStatusDisplayTerms displayTerms = new PatientStatusDisplayTerms(portletRequest);
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            displayTerms.setLocationId(userInfo.getLocationId());
        } catch (Exception e) {
            LOG.error(e);
        }
        return displayTerms;
    }

    @Override
    protected List<Patient> search(PatientStatusDisplayTerms searchTerms, int startIndex, int endIndex,
                                   OrderByComparator obc) throws SystemException, PortalException {
        return PatientLocalServiceUtil.findPatientStatusByDisplayTerms(searchTerms, obc, startIndex, endIndex,
                getServiceContext());
    }

    @Override
    protected int searchCount(PatientStatusDisplayTerms searchTerms) throws SystemException, PortalException {
        return PatientLocalServiceUtil.countPatientStatusByDisplayTerms(searchTerms, getServiceContext());
    }

    public boolean isPlaySound() throws SystemException, PortalException {
        boolean temperatureAudioAlarm = GetterUtil.getBoolean(SystemParameterLocalServiceUtil.getByLocationIdAndKey(
                getUserDefaultLocationId(), MonitorPropsKeys.TEMPERATURE_AUDIO_ALARM), false);

        boolean hasFebrilePatient = PatientLocalServiceUtil.hasFebrilePatient();

        return temperatureAudioAlarm && hasFebrilePatient;
    }

    public long getUserDefaultLocationId() throws SystemException, PortalException {
        UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
        return userInfo.getLocationId();
    }

    public String getBedNo() throws SystemException, PortalException {
        Patient patient = getCurrentPatient();
        Bed bed = BedLocalServiceUtil.getBed(patient.getBedId());
        return bed.getBedNo();
    }

    public String getLatestTemperature() {
        Patient patient = getCurrentPatient();
        Date latestDate = patient.getLatestDate();
        Date oneHourAgo = DateUtils.addHours(getNow(), -1);
        if (latestDate != null && latestDate.after(oneHourAgo)) {
            return patient.getTemperature().toString();
        } else {
            return "无记录";
        }
    }

    public String getHighestTemperatureIn8h() {
        Patient patient = getCurrentPatient();
        Date highestDate = patient.getHighestDate();
        Date eightHourAgo = DateUtils.addHours(getNow(), -8);
        if (highestDate != null && highestDate.after(eightHourAgo)) {
            return patient.getTemperatureIn8h().toString();
        } else {
            return "无记录";
        }
    }

    public boolean getHasTodayRecords() throws SystemException {
        Patient patient = getCurrentPatient();
        return TemperatureLocalServiceUtil.hasTodayRecords(patient.getPatientId());
    }

    public boolean getFebrile() {
        Patient patient = getCurrentPatient();
        return patient.getFebrile();
    }

    public boolean getTagMessageException() throws SystemException {
        Patient patient = getCurrentPatient();
        if (Validator.isNotNull(patient.getTagNo())) {
            if (patient.getLatestDate() == null) {
                return true;
            }
            Date now = getNow();
            long interval = now.getTime() - patient.getLatestDate().getTime();
            long tagTimeout = GetterUtil.getInteger(
                    SystemParameterLocalServiceUtil.getByLocationIdAndKey(patient.getLocationId(),
                            MonitorPropsKeys.TAG_TIMEOUT), 5);
            if (interval > tagTimeout * 60 * 1000) {
                return true;
            }
        }
        return false;
    }

    private Patient getCurrentPatient() {
        return (Patient) ActionContext.getContext().getValueStack().findValue("top", Patient.class, false);
    }
}
