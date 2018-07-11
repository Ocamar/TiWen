package com.surwing.portlet.user;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.model.Location;
import com.surwing.model.UserInfo;
import com.surwing.search.UserDisplayTerms;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.UserInfoLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;
import com.surwing.util.UserRoleHelper;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

import javax.portlet.PortletRequest;

/**
 * Created by zhaiyz on 16-1-16.
 */
public class UserSearchAction extends SearchActionSupport<UserDisplayTerms, User> {

    @Override
    public UserDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        return new UserDisplayTerms(portletRequest);
    }

    @Override
    protected int searchCount(UserDisplayTerms searchTerms) throws SystemException, PortalException {
        return UserInfoLocalServiceUtil.countByUserDisplayTerms(searchTerms, getCompanyId(), getScopeGroupId());
    }

    @Override
    protected List<User> search(UserDisplayTerms searchTerms, int startIndex, int endIndex, OrderByComparator obc)
            throws SystemException,
            PortalException {
        return UserInfoLocalServiceUtil.findByUserDisplayTerms(searchTerms, startIndex, endIndex, obc, getCompanyId(),
                getScopeGroupId());
    }

    public String getRoleNames() {
        User user = getCurrentUser();
        String roleNames = "";
        if (UserRoleHelper.hasAdminRole(user.getUserId(), getScopeGroupId())) {
            roleNames += "管理员";
        }
        if (UserRoleHelper.hasNurseRole(user.getUserId(), getScopeGroupId())) {
            if (roleNames.length() > 0) {
                roleNames += "，";
            }
            roleNames += "护士";
        }
        if (UserRoleHelper.hasHeadNurseRole(user.getUserId(), getScopeGroupId())) {
            if (roleNames.length() > 0) {
                roleNames += "，";
            }
            roleNames += "护士长";
        }

        return roleNames;
    }

    public String getLocationName() throws SystemException, PortalException {
        User user = getCurrentUser();
        UserInfo userInfo = UserInfoLocalServiceUtil.fetchUserInfo(user.getUserId());
        if (userInfo == null || userInfo.getLocationId() == 0) {
            return StringPool.BLANK;
        }
        Location location = LocationLocalServiceUtil.getLocation(userInfo.getLocationId());
        return location.getLocationName();
    }

    public boolean isNotDefaultAdmin() {
        User user = getCurrentUser();
        return !StringUtils.equals(user.getScreenName(), "admin");
    }

    public boolean isAdmin() {
        User user = getCurrentUser();
        return UserRoleHelper.hasAdminRole(user.getUserId(), getScopeGroupId());
    }

    public boolean isNurse() {
        User user = getCurrentUser();
        return UserRoleHelper.hasNurseRole(user.getUserId(), getScopeGroupId());
    }

    public boolean isHeadNurse() {
        User user = getCurrentUser();
        return UserRoleHelper.hasHeadNurseRole(user.getUserId(), getScopeGroupId());
    }

    private User getCurrentUser() {
        return (User) ActionContext.getContext().getValueStack().findValue("top", User.class, false);
    }
}
