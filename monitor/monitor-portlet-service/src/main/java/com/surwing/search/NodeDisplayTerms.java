package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaiyz on 16-1-7.
 */
public class NodeDisplayTerms extends DisplayTerms {

    private int nodeType;

    private long locationId;

    private int status;

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public NodeDisplayTerms(HttpServletRequest request) {
        super(request);
    }

    public NodeDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }
}
