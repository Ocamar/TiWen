package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.SystemParameter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SystemParameter in entity cache.
 *
 * @author zhaiyz
 * @see SystemParameter
 * @generated
 */
public class SystemParameterCacheModel implements CacheModel<SystemParameter>,
    Externalizable {
    public long systemParameterId;
    public long locationId;
    public String key;
    public String value;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{systemParameterId=");
        sb.append(systemParameterId);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", key=");
        sb.append(key);
        sb.append(", value=");
        sb.append(value);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SystemParameter toEntityModel() {
        SystemParameterImpl systemParameterImpl = new SystemParameterImpl();

        systemParameterImpl.setSystemParameterId(systemParameterId);
        systemParameterImpl.setLocationId(locationId);

        if (key == null) {
            systemParameterImpl.setKey(StringPool.BLANK);
        } else {
            systemParameterImpl.setKey(key);
        }

        if (value == null) {
            systemParameterImpl.setValue(StringPool.BLANK);
        } else {
            systemParameterImpl.setValue(value);
        }

        systemParameterImpl.resetOriginalValues();

        return systemParameterImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        systemParameterId = objectInput.readLong();
        locationId = objectInput.readLong();
        key = objectInput.readUTF();
        value = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(systemParameterId);
        objectOutput.writeLong(locationId);

        if (key == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(key);
        }

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }
    }
}
