package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.SystemParameterLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SystemParameterClp extends BaseModelImpl<SystemParameter>
    implements SystemParameter {
    private long _systemParameterId;
    private long _locationId;
    private String _key;
    private String _value;
    private BaseModel<?> _systemParameterRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public SystemParameterClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SystemParameter.class;
    }

    @Override
    public String getModelClassName() {
        return SystemParameter.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _systemParameterId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setSystemParameterId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _systemParameterId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("systemParameterId", getSystemParameterId());
        attributes.put("locationId", getLocationId());
        attributes.put("key", getKey());
        attributes.put("value", getValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long systemParameterId = (Long) attributes.get("systemParameterId");

        if (systemParameterId != null) {
            setSystemParameterId(systemParameterId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        String key = (String) attributes.get("key");

        if (key != null) {
            setKey(key);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }
    }

    @Override
    public long getSystemParameterId() {
        return _systemParameterId;
    }

    @Override
    public void setSystemParameterId(long systemParameterId) {
        _systemParameterId = systemParameterId;

        if (_systemParameterRemoteModel != null) {
            try {
                Class<?> clazz = _systemParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setSystemParameterId",
                        long.class);

                method.invoke(_systemParameterRemoteModel, systemParameterId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;

        if (_systemParameterRemoteModel != null) {
            try {
                Class<?> clazz = _systemParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_systemParameterRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKey() {
        return _key;
    }

    @Override
    public void setKey(String key) {
        _key = key;

        if (_systemParameterRemoteModel != null) {
            try {
                Class<?> clazz = _systemParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setKey", String.class);

                method.invoke(_systemParameterRemoteModel, key);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getValue() {
        return _value;
    }

    @Override
    public void setValue(String value) {
        _value = value;

        if (_systemParameterRemoteModel != null) {
            try {
                Class<?> clazz = _systemParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setValue", String.class);

                method.invoke(_systemParameterRemoteModel, value);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSystemParameterRemoteModel() {
        return _systemParameterRemoteModel;
    }

    public void setSystemParameterRemoteModel(
        BaseModel<?> systemParameterRemoteModel) {
        _systemParameterRemoteModel = systemParameterRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _systemParameterRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_systemParameterRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SystemParameterLocalServiceUtil.addSystemParameter(this);
        } else {
            SystemParameterLocalServiceUtil.updateSystemParameter(this);
        }
    }

    @Override
    public SystemParameter toEscapedModel() {
        return (SystemParameter) ProxyUtil.newProxyInstance(SystemParameter.class.getClassLoader(),
            new Class[] { SystemParameter.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SystemParameterClp clone = new SystemParameterClp();

        clone.setSystemParameterId(getSystemParameterId());
        clone.setLocationId(getLocationId());
        clone.setKey(getKey());
        clone.setValue(getValue());

        return clone;
    }

    @Override
    public int compareTo(SystemParameter systemParameter) {
        long primaryKey = systemParameter.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SystemParameterClp)) {
            return false;
        }

        SystemParameterClp systemParameter = (SystemParameterClp) obj;

        long primaryKey = systemParameter.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{systemParameterId=");
        sb.append(getSystemParameterId());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", key=");
        sb.append(getKey());
        sb.append(", value=");
        sb.append(getValue());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.SystemParameter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>systemParameterId</column-name><column-value><![CDATA[");
        sb.append(getSystemParameterId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>key</column-name><column-value><![CDATA[");
        sb.append(getKey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
