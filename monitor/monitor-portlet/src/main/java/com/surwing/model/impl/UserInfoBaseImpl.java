package com.surwing.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.UserInfo;

import com.surwing.service.UserInfoLocalServiceUtil;

/**
 * The extended model base implementation for the UserInfo service. Represents a row in the &quot;M_UserInfo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserInfoImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see UserInfoImpl
 * @see com.surwing.model.UserInfo
 * @generated
 */
public abstract class UserInfoBaseImpl extends UserInfoModelImpl
    implements UserInfo {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user info model instance should use the {@link UserInfo} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserInfoLocalServiceUtil.addUserInfo(this);
        } else {
            UserInfoLocalServiceUtil.updateUserInfo(this);
        }
    }
}
