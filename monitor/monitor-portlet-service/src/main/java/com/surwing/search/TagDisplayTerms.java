package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaiyz on 16-1-14.
 */
public class TagDisplayTerms extends DisplayTerms {

    private int tagType;

    private int status;

    private int registered;

    private String tagNo;

    private long locationId;

    private boolean avaliable;

    public TagDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }

    public int getTagType() {
        return tagType;
    }

    public void setTagType(int tagType) {
        this.tagType = tagType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRegistered() {
        return registered;
    }

    public void setRegistered(int registered) {
        this.registered = registered;
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}
