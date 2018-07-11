package com.surwing.portlet.tag;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.enums.TagStatus;
import com.surwing.enums.TagType;
import com.surwing.model.Location;
import com.surwing.model.Node;
import com.surwing.model.Tag;
import com.surwing.search.TagDisplayTerms;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;

/**
 * Created by zhaiyz on 16-1-14.
 */
public class TagSearchAction extends SearchActionSupport<TagDisplayTerms, Tag> {

    @Override
    public TagDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        return new TagDisplayTerms(portletRequest);
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

    public String getStatusName() {
        Tag tag = getCurrentTag();
        return TagStatus.getNameByStatus(tag.getStatus());
    }

    public String getNodeNo() throws SystemException, PortalException {
        Tag tag = getCurrentTag();
        Node node = NodeLocalServiceUtil.fetchNode(tag.getNodeId());
        return node == null ? StringPool.BLANK : node.getNodeNo();
    }

    public Location getLocation() throws SystemException, PortalException {
        Tag tag = getCurrentTag();
        return LocationLocalServiceUtil.fetchLocation(tag.getLocationId());
    }

    public List<TagType> getTagTypes() {
        List<TagType> tagTypes = new ArrayList<>();
        for (TagType tt : TagType.values()) {
            tagTypes.add(tt);
        }
        return tagTypes;
    }

    public List<TagStatus> getTagStatuses() {
        List<TagStatus> tagStatuses = new ArrayList<>();
        for (TagStatus ts : TagStatus.values()) {
            tagStatuses.add(ts);
        }
        return tagStatuses;
    }

    private Tag getCurrentTag() {
        return (Tag) ActionContext.getContext().getValueStack().findValue("top", Tag.class, false);
    }
}
