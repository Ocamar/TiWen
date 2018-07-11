package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaiyz
 */
public class PatientDisplayTerms extends DisplayTerms {

    private long locationId;

    private String mrn;

    private String tagNo;

    private int dischargeStatus;

    public PatientDisplayTerms(HttpServletRequest request) {
        super(request);
    }

    public PatientDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo;
    }

    public int getDischargeStatus() {
        return dischargeStatus;
    }

    public void setDischargeStatus(int dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
    }
}
