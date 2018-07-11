package com.surwing.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaiyz
 */
public class SystemParameterDisplayTerms extends DisplayTerms {

    public SystemParameterDisplayTerms(HttpServletRequest request) {
        super(request);
    }

    public SystemParameterDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
    }
}
