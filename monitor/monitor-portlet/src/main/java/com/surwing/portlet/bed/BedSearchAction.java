package com.surwing.portlet.bed;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.model.Bed;
import com.surwing.model.Location;
import com.surwing.model.UserInfo;
import com.surwing.search.BedDisplayTerms;
import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import java.util.List;

import javax.portlet.PortletRequest;

/**
 * @author zhaiyz
 */
public class BedSearchAction extends SearchActionSupport<BedDisplayTerms, Bed> {

    @Override
    public BedDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        BedDisplayTerms displayTerms = new BedDisplayTerms(portletRequest);
        displayTerms.setLocationId(getUserDefaultLocationId());
        return displayTerms;
    }

    @Override
    protected List<Bed> search(BedDisplayTerms searchTerms, int startIndex, int endIndex, OrderByComparator obc)
            throws SystemException, PortalException {
        return BedLocalServiceUtil.findByDisplayTerms(searchTerms, obc, startIndex, endIndex, getServiceContext());
    }

    @Override
    protected int searchCount(BedDisplayTerms searchTerms) throws SystemException, PortalException {
        return BedLocalServiceUtil.countByDisplayTerms(searchTerms, getServiceContext());
    }

    public String getLocationNo() throws SystemException, PortalException {
        Bed bed = getCurrentNode();
        Location location = LocationLocalServiceUtil.getLocation(bed.getLocationId());
        return location.getLocationNo();
    }

    public String getLocationName() throws SystemException, PortalException {
        Bed bed = getCurrentNode();
        Location location = LocationLocalServiceUtil.getLocation(bed.getLocationId());
        return location.getLocationName();
    }

    private Bed getCurrentNode() {
        return (Bed) ActionContext.getContext().getValueStack().findValue("top", Bed.class, false);
    }

    private long getUserDefaultLocationId() {
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            return userInfo.getLocationId();
        } catch (Exception e) {
            return 0L;
        }
    }
}
