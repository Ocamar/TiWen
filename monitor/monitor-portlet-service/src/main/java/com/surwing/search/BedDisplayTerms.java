package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaiyz
 */
public class BedDisplayTerms extends DisplayTerms {

    private long locationId;

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public BedDisplayTerms(HttpServletRequest request) {
        super(request);
    }

    public BedDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }
}
