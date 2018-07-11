package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaiyz on 16-1-6.
 */
public class LocationDisplayTerms extends DisplayTerms {

    private String locationNo;

    private String locationName;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    public LocationDisplayTerms(HttpServletRequest request) {
        super(request);
    }

    public LocationDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }
}
