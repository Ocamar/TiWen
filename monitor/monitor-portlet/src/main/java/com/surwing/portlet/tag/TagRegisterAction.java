package com.surwing.portlet.tag;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.model.Location;
import com.surwing.model.Tag;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import java.util.List;

/**
 * @author zhaiyz
 */
public class TagRegisterAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(TagRegisterAction.class);

    private long tagId;

    private String tagNo;

    private long locationId;

    @Override
    public String input() throws Exception {
        Tag tag = TagLocalServiceUtil.getTag(tagId);
        tagNo = tag.getTagNo();
        locationId = tag.getLocationId();
        return super.input();
    }

    @Override
    public String execute() throws Exception {
        try {
            TagLocalServiceUtil.registerTag(tagId, locationId);
            addActionMessage("标签注册成功");
        } catch (Exception e) {
            addActionError("标签注册失败");
            return ERROR;
        }

        return BACK;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS,
                QueryUtil.ALL_POS);
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
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
}
