package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.UserInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserInfo in entity cache.
 *
 * @author zhaiyz
 * @see UserInfo
 * @generated
 */
public class UserInfoCacheModel implements CacheModel<UserInfo>, Externalizable {
    public long userId;
    public long locationId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserInfo toEntityModel() {
        UserInfoImpl userInfoImpl = new UserInfoImpl();

        userInfoImpl.setUserId(userId);
        userInfoImpl.setLocationId(locationId);

        userInfoImpl.resetOriginalValues();

        return userInfoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        locationId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);
        objectOutput.writeLong(locationId);
    }
}
