package com.surwing.portlet.user;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 17-8-16.
 */
public class UserDeleteAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserDeleteAction.class);

    private long uid;

    @Override
    public String execute() throws Exception {
        try {
            UserLocalServiceUtil.updateStatus(uid, WorkflowConstants.STATUS_INACTIVE, getServiceContext());
            UserLocalServiceUtil.deleteUser(uid);
            addActionMessage("删除用户成功");
        } catch (Exception e) {
            addActionError("删除用户失败");
            LOG.error("删除用户失败", e);
        }
        return BACK;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
}
