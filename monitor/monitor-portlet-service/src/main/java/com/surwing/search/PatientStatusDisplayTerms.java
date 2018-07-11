package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;

/**
 * @author zhaiyz
 */
public class PatientStatusDisplayTerms extends DisplayTerms {

    private long locationId;

    private int febrile;

    private String mrn;

    private String name;

    public PatientStatusDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public int getFebrile() {
        return febrile;
    }

    public void setFebrile(int febrile) {
        this.febrile = febrile;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
