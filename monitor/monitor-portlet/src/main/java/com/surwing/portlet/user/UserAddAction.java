package com.surwing.portlet.user;

import com.liferay.portal.DuplicateUserScreenNameException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.surwing.model.Location;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

import java.util.List;

/**
 * @author zhaiyz
 */
public class UserAddAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(UserAddAction.class);

    private String screenName;

    private String firstName;

    private String password;

    private String confirmPassword;

    private long locationId;

    @Override
    public String execute() throws Exception {
        try {
            User user = UserInfoLocalServiceUtil.addUser(screenName, firstName, password, confirmPassword, locationId,
                    getServiceContext());

            UserLocalServiceUtil.updatePassword(user.getUserId(), password, confirmPassword, false);
            addActionMessage("添加用户成功");
        } catch (DuplicateUserScreenNameException duse) {
            addActionError("添加用户失败，登录名已存在");
            return ERROR;
        }
        catch (Exception e) {
            LOG.error("添加用户失败", e);
            addActionError("添加用户失败" + e.getMessage());
            return ERROR;
        }
        return BACK;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS,
                QueryUtil.ALL_POS);
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

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
}
