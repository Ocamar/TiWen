package com.surwing.portlet.tag;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.enums.TagStatus;
import com.surwing.enums.TagType;
import com.surwing.model.Location;
import com.surwing.model.Tag;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by zhaiyz on 18-5-15.
 */
public class TagAddAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(TagAddAction.class);

    private String tagNo;

    private long locationId;

    @Override
    public String execute() throws Exception {
        try {
            if (StringUtils.isBlank(tagNo)) {
                addActionError("请输入标签标号");
                return INPUT;
            }
            Tag tag = TagLocalServiceUtil.fetchByTagNo(tagNo.trim());
            if (tag != null) {
                addActionError("标签已存在");
                return INPUT;
            }

            int type = TagType.THERMO_SENSOR_II.getTagType();
            int status = TagStatus.NORMAL.getTagStatus();
            Tag newTag = TagLocalServiceUtil.addTag(tagNo, type, status, getCompanyId(), getScopeGroupId());
            TagLocalServiceUtil.registerTag(newTag.getTagId(), locationId);
            addActionMessage("添加标签成功");
        } catch (Exception e) {
            addActionError("添加标签失败" + e.getMessage());
            LOG.error("添加标签失败", e);
            return INPUT;
        }
        return BACK;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS,
                QueryUtil.ALL_POS);
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
