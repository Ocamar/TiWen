package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.LocationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LocationClp extends BaseModelImpl<Location> implements Location {
    private long _locationId;
    private long _companyId;
    private long _groupId;
    private String _locationNo;
    private String _locationName;
    private boolean _esbEnabled;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _locationRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public LocationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Location.class;
    }

    @Override
    public String getModelClassName() {
        return Location.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _locationId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLocationId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _locationId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("locationId", getLocationId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("locationNo", getLocationNo());
        attributes.put("locationName", getLocationName());
        attributes.put("esbEnabled", getEsbEnabled());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String locationNo = (String) attributes.get("locationNo");

        if (locationNo != null) {
            setLocationNo(locationNo);
        }

        String locationName = (String) attributes.get("locationName");

        if (locationName != null) {
            setLocationName(locationName);
        }

        Boolean esbEnabled = (Boolean) attributes.get("esbEnabled");

        if (esbEnabled != null) {
            setEsbEnabled(esbEnabled);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_locationRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_locationRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_locationRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLocationNo() {
        return _locationNo;
    }

    @Override
    public void setLocationNo(String locationNo) {
        _locationNo = locationNo;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationNo", String.class);

                method.invoke(_locationRemoteModel, locationNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLocationName() {
        return _locationName;
    }

    @Override
    public void setLocationName(String locationName) {
        _locationName = locationName;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationName", String.class);

                method.invoke(_locationRemoteModel, locationName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getEsbEnabled() {
        return _esbEnabled;
    }

    @Override
    public boolean isEsbEnabled() {
        return _esbEnabled;
    }

    @Override
    public void setEsbEnabled(boolean esbEnabled) {
        _esbEnabled = esbEnabled;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setEsbEnabled", boolean.class);

                method.invoke(_locationRemoteModel, esbEnabled);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_locationRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_locationRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLocationRemoteModel() {
        return _locationRemoteModel;
    }

    public void setLocationRemoteModel(BaseModel<?> locationRemoteModel) {
        _locationRemoteModel = locationRemoteModel;
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

        Class<?> remoteModelClass = _locationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_locationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LocationLocalServiceUtil.addLocation(this);
        } else {
            LocationLocalServiceUtil.updateLocation(this);
        }
    }

    @Override
    public Location toEscapedModel() {
        return (Location) ProxyUtil.newProxyInstance(Location.class.getClassLoader(),
            new Class[] { Location.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LocationClp clone = new LocationClp();

        clone.setLocationId(getLocationId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setLocationNo(getLocationNo());
        clone.setLocationName(getLocationName());
        clone.setEsbEnabled(getEsbEnabled());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Location location) {
        int value = 0;

        if (getLocationId() < location.getLocationId()) {
            value = -1;
        } else if (getLocationId() > location.getLocationId()) {
            value = 1;
        } else {
            value = 0;
        }

        value = value * -1;

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LocationClp)) {
            return false;
        }

        LocationClp location = (LocationClp) obj;

        long primaryKey = location.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{locationId=");
        sb.append(getLocationId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", locationNo=");
        sb.append(getLocationNo());
        sb.append(", locationName=");
        sb.append(getLocationName());
        sb.append(", esbEnabled=");
        sb.append(getEsbEnabled());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Location");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationNo</column-name><column-value><![CDATA[");
        sb.append(getLocationNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationName</column-name><column-value><![CDATA[");
        sb.append(getLocationName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>esbEnabled</column-name><column-value><![CDATA[");
        sb.append(getEsbEnabled());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
