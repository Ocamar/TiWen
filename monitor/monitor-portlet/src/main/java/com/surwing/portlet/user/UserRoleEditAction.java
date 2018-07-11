package com.surwing.portlet.user;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;
import com.surwing.util.UserRoleHelper;

/**
 * Created by zhaiyz on 16-1-16.
 */
public class UserRoleEditAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserRoleEditAction.class);

    private long uid;

    public String addAdminRole() {
        try {
            UserRoleHelper.addAdminRole(uid, getScopeGroupId());
            addActionMessage("设置为管理员成功");
        } catch (Exception e) {
            LOG.error("设置为管理员失败", e);
            addActionError("设置为管理员失败");
        }
        return BACK;
    }

    public String addNurseRole() {
        try {
            UserRoleHelper.addNurseRole(uid, getScopeGroupId());
            addActionMessage("设置为护士成功");
        } catch (Exception e) {
            LOG.error("设置为护士失败", e);
            addActionError("设置为护士失败");
        }
        return BACK;
    }

    public String addHeadNurseRole() {
        try {
            UserRoleHelper.addHeadNurseRole(uid, getScopeGroupId());
            addActionMessage("设置为护士长成功");
        } catch (Exception e) {
            LOG.error("设置为护士长失败", e);
            addActionError("设置为护士长失败");
        }
        return BACK;
    }

    public String deleteAdminRole() {
        try {
            UserRoleHelper.deleteAdminRole(uid, getScopeGroupId());
            addActionMessage("取消管理员角色成功");
        } catch (Exception e) {
            LOG.error("取消管理员角色失败", e);
            addActionError("取消管理员角色失败");
        }
        return BACK;
    }

    public String deleteNurseRole() {
        try {
            UserRoleHelper.deleteNurseRole(uid, getScopeGroupId());
            addActionMessage("取消护士角色成功");
        } catch (Exception e) {
            LOG.error("取消护士角色失败", e);
            addActionError("取消护士角色失败");
        }
        return BACK;
    }

    public String deleteHeadNurseRole() {
        try {
            UserRoleHelper.deleteHeadNurseRole(uid, getScopeGroupId());
            addActionMessage("取消护士长角色成功");
        } catch (Exception e) {
            LOG.error("取消护士长角色失败", e);
            addActionError("取消护士长角色失败");
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
