package com.surwing.portlet.patient;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.surwing.model.Tag;
import com.surwing.model.UserInfo;
import com.surwing.search.TagDisplayTerms;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import java.util.List;

import javax.portlet.PortletRequest;

/**
 * @author zhaiyz
 */
public class AvailableTagSearchAction extends SearchActionSupport<TagDisplayTerms, Tag> {

    private static final Log LOG = LogFactoryUtil.getLog(AvailableTagSearchAction.class);

    @Override
    public TagDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        TagDisplayTerms displayTerms = new TagDisplayTerms(portletRequest);
        try {
            UserInfo userInfo = UserInfoLocalServiceUtil.getUserInfo(getUserId());
            displayTerms.setLocationId(userInfo.getLocationId());
            displayTerms.setAvaliable(true);
        } catch (Exception e) {
            LOG.error(e);
        }
        return displayTerms;
    }

    @Override
    protected int searchCount(TagDisplayTerms searchTerms) throws SystemException, PortalException {
        return TagLocalServiceUtil.countTagsByDisplayTerms(searchTerms, getCompanyId(), getScopeGroupId());
    }

    @Override
    protected List<Tag> search(TagDisplayTerms searchTerms, int startIndex, int endIndex, OrderByComparator obc)
            throws SystemException, PortalException {
        return TagLocalServiceUtil.findTagsByDisplayTerms(searchTerms, obc, startIndex, endIndex, getCompanyId(),
                getScopeGroupId());
    }
}
