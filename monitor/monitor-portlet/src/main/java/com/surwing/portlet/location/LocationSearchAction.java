package com.surwing.portlet.location;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.surwing.model.Location;
import com.surwing.search.LocationDisplayTerms;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import java.util.List;

import javax.portlet.PortletRequest;

/**
 * Created by zhaiyz on 16-1-4.
 */
public class LocationSearchAction extends SearchActionSupport<LocationDisplayTerms, Location> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public LocationDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        return new LocationDisplayTerms(portletRequest);
    }

    @Override
    protected int searchCount(LocationDisplayTerms searchTerms) throws SystemException, PortalException {
        return LocationLocalServiceUtil.countByDisplayTerms(searchTerms);
    }

    @Override
    protected List<Location> search(LocationDisplayTerms searchTerms, int startIndex, int endIndex,
                                    OrderByComparator obc) throws SystemException,
            PortalException {
        return LocationLocalServiceUtil.findByDisplayTerms(searchTerms, obc, startIndex, endIndex);
    }
}
