package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaiyz on 16-1-16.
 */
public class UserDisplayTerms extends DisplayTerms {

    private String screenName;

    private String firstName;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }
}
