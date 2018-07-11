package com.surwing.portlet.patient;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.model.Bed;
import com.surwing.model.Location;
import com.surwing.model.Patient;
import com.surwing.model.UserInfo;
import com.surwing.search.PatientDisplayTerms;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.PatientLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import javax.portlet.PortletRequest;
import java.util.List;

/**
 * @author zhaiyz
 */
public class PatientSearchAction extends SearchActionSupport<PatientDisplayTerms, Patient> {

    private static final Log LOG = LogFactoryUtil.getLog(PatientSearchAction.class);

    @Override
    public PatientDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        PatientDisplayTerms displayTerms = new PatientDisplayTerms(portletRequest);
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            displayTerms.setLocationId(userInfo.getLocationId());
        } catch (Exception e) {
            LOG.error(e);
        }
        return displayTerms;
    }

    @Override
    protected List<Patient> search(PatientDisplayTerms searchTerms, int startIndex, int endIndex,
                                   OrderByComparator obc) throws SystemException, PortalException {
        return PatientLocalServiceUtil.findByDisplayTerms(searchTerms, obc, startIndex, endIndex, getServiceContext());
    }

    @Override
    protected int searchCount(PatientDisplayTerms searchTerms) throws SystemException, PortalException {
        return PatientLocalServiceUtil.countByDisplayTerms(searchTerms, getServiceContext());
    }

    public String getLocationNo() throws SystemException, PortalException {
        Patient patient = getCurrentPatient();
        Location location = LocationLocalServiceUtil.getLocation(patient.getLocationId());
        return location.getLocationNo();
    }

    public String getLocationName() throws SystemException, PortalException {
        Patient patient = getCurrentPatient();
        Location location = LocationLocalServiceUtil.getLocation(patient.getLocationId());
        return location.getLocationName();
    }

    public String getBedNo() throws SystemException, PortalException {
        Patient patient = getCurrentPatient();
        Bed bed = BedLocalServiceUtil.getBed(patient.getBedId());
        return bed.getBedNo();
    }

    public String getGenderName() {
        Patient patient = getCurrentPatient();
        return patient.getGender() == 0 ? "男" : "女";
    }


    private Patient getCurrentPatient() {
        return (Patient) ActionContext.getContext().getValueStack().findValue("top", Patient.class, false);
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
}
