package com.surwing.portlet.tag;

import com.surwing.MonitorException;
import com.surwing.service.TagLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * @author zhaiyz
 */
public class TagDeleteAction extends LiferayActionSupport {

    private long tagId;

    @Override
    public String execute() throws Exception {
        try {
            TagLocalServiceUtil.deleteTag(tagId);
            addActionMessage("删除标签成功");
        } catch (MonitorException me) {
            addActionError(me.getMessage());
        }
        return BACK;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }
}
