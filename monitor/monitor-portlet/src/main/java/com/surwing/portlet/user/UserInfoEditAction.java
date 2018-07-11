package com.surwing.portlet.user;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.surwing.model.Location;
import com.surwing.model.UserInfo;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;
import com.surwing.util.UserRoleHelper;

import java.util.List;

/**
 * @author zhaiyz
 */
public class UserInfoEditAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserInfoEditAction.class);

    private long uid;

    private String screenName;

    private String firstName;

    private long locationId;

    private boolean isAdmin;

    @Override
    public String input() throws Exception {
        User user = UserLocalServiceUtil.getUser(uid);
        screenName = user.getScreenName();
        firstName = user.getFirstName();
        UserInfo userInfo = UserInfoLocalServiceUtil.fetchUserInfo(uid);
        if (userInfo == null) {
            locationId = 0L;
        } else {
            locationId = userInfo.getLocationId();
        }
        isAdmin = UserRoleHelper.hasAdminRole(uid, getScopeGroupId());
        return super.input();
    }

    @Override
    public String execute() throws Exception {
        try {
            UserInfoLocalServiceUtil.editUser(uid, firstName, locationId);
            addActionMessage("编辑用户信息成功");
        } catch (Exception e) {
            LOG.error("编辑用户信息失败", e);
            addActionError("编辑用户信息失败");
            return ERROR;
        }
        return BACK;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS,
                QueryUtil.ALL_POS);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
