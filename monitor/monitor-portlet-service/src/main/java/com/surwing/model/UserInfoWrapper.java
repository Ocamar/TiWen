package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserInfo}.
 * </p>
 *
 * @author zhaiyz
 * @see UserInfo
 * @generated
 */
public class UserInfoWrapper implements UserInfo, ModelWrapper<UserInfo> {
    private UserInfo _userInfo;

    public UserInfoWrapper(UserInfo userInfo) {
        _userInfo = userInfo;
    }

    @Override
    public Class<?> getModelClass() {
        return UserInfo.class;
    }

    @Override
    public String getModelClassName() {
        return UserInfo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("locationId", getLocationId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }
    }

    /**
    * Returns the primary key of this user info.
    *
    * @return the primary key of this user info
    */
    @Override
    public long getPrimaryKey() {
        return _userInfo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user info.
    *
    * @param primaryKey the primary key of this user info
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _userInfo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this user info.
    *
    * @return the user ID of this user info
    */
    @Override
    public long getUserId() {
        return _userInfo.getUserId();
    }

    /**
    * Sets the user ID of this user info.
    *
    * @param userId the user ID of this user info
    */
    @Override
    public void setUserId(long userId) {
        _userInfo.setUserId(userId);
    }

    /**
    * Returns the user uuid of this user info.
    *
    * @return the user uuid of this user info
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfo.getUserUuid();
    }

    /**
    * Sets the user uuid of this user info.
    *
    * @param userUuid the user uuid of this user info
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _userInfo.setUserUuid(userUuid);
    }

    /**
    * Returns the location ID of this user info.
    *
    * @return the location ID of this user info
    */
    @Override
    public long getLocationId() {
        return _userInfo.getLocationId();
    }

    /**
    * Sets the location ID of this user info.
    *
    * @param locationId the location ID of this user info
    */
    @Override
    public void setLocationId(long locationId) {
        _userInfo.setLocationId(locationId);
    }

    @Override
    public boolean isNew() {
        return _userInfo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _userInfo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _userInfo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _userInfo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _userInfo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _userInfo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userInfo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userInfo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _userInfo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _userInfo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userInfo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserInfoWrapper((UserInfo) _userInfo.clone());
    }

    @Override
    public int compareTo(com.surwing.model.UserInfo userInfo) {
        return _userInfo.compareTo(userInfo);
    }

    @Override
    public int hashCode() {
        return _userInfo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.UserInfo> toCacheModel() {
        return _userInfo.toCacheModel();
    }

    @Override
    public com.surwing.model.UserInfo toEscapedModel() {
        return new UserInfoWrapper(_userInfo.toEscapedModel());
    }

    @Override
    public com.surwing.model.UserInfo toUnescapedModel() {
        return new UserInfoWrapper(_userInfo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userInfo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _userInfo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userInfo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserInfoWrapper)) {
            return false;
        }

        UserInfoWrapper userInfoWrapper = (UserInfoWrapper) obj;

        if (Validator.equals(_userInfo, userInfoWrapper._userInfo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UserInfo getWrappedUserInfo() {
        return _userInfo;
    }

    @Override
    public UserInfo getWrappedModel() {
        return _userInfo;
    }

    @Override
    public void resetOriginalValues() {
        _userInfo.resetOriginalValues();
    }
}
