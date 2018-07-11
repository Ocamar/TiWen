package com.surwing.portlet.user;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import org.apache.commons.lang.xwork.StringUtils;

/**
 * @author zhaiyz
 */
public class UserPasswordChangeAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserPasswordChangeAction.class);

    private long uid;

    private String screenName;

    private String password;

    private String confirmPassword;

    @Override
    public String input() throws Exception {
        User user = UserLocalServiceUtil.getUser(uid);
        screenName = user.getScreenName();
        return super.input();
    }

    @Override
    public String execute() throws Exception {
        try {
            if (!StringUtils.equals(password, confirmPassword)) {
                addActionError("两次输入的密码不一致");
                return ERROR;
            }
            UserLocalServiceUtil.updatePassword(uid, password, confirmPassword, false);
            addActionMessage("修改用户密码成功");
        } catch (Exception e) {
            LOG.error("修改用户密码失败", e);
            addActionError("修改用户密码失败");
            return ERROR;
        }
        return BACK;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
