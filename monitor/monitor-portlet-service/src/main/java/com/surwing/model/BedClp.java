package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.BedLocalServiceUtil;
import com.surwing.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BedClp extends BaseModelImpl<Bed> implements Bed {
    private long _bedId;
    private long _companyId;
    private long _groupId;
    private long _locationId;
    private String _bedNo;
    private String _alias;
    private long _patientId;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _bedRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public BedClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Bed.class;
    }

    @Override
    public String getModelClassName() {
        return Bed.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _bedId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBedId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bedId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bedId", getBedId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("locationId", getLocationId());
        attributes.put("bedNo", getBedNo());
        attributes.put("alias", getAlias());
        attributes.put("patientId", getPatientId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bedId = (Long) attributes.get("bedId");

        if (bedId != null) {
            setBedId(bedId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        String bedNo = (String) attributes.get("bedNo");

        if (bedNo != null) {
            setBedNo(bedNo);
        }

        String alias = (String) attributes.get("alias");

        if (alias != null) {
            setAlias(alias);
        }

        Long patientId = (Long) attributes.get("patientId");

        if (patientId != null) {
            setPatientId(patientId);
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
    public long getBedId() {
        return _bedId;
    }

    @Override
    public void setBedId(long bedId) {
        _bedId = bedId;

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setBedId", long.class);

                method.invoke(_bedRemoteModel, bedId);
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

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_bedRemoteModel, companyId);
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

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_bedRemoteModel, groupId);
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

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_bedRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBedNo() {
        return _bedNo;
    }

    @Override
    public void setBedNo(String bedNo) {
        _bedNo = bedNo;

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setBedNo", String.class);

                method.invoke(_bedRemoteModel, bedNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAlias() {
        return _alias;
    }

    @Override
    public void setAlias(String alias) {
        _alias = alias;

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setAlias", String.class);

                method.invoke(_bedRemoteModel, alias);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPatientId() {
        return _patientId;
    }

    @Override
    public void setPatientId(long patientId) {
        _patientId = patientId;

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setPatientId", long.class);

                method.invoke(_bedRemoteModel, patientId);
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

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_bedRemoteModel, createDate);
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

        if (_bedRemoteModel != null) {
            try {
                Class<?> clazz = _bedRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_bedRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBedRemoteModel() {
        return _bedRemoteModel;
    }

    public void setBedRemoteModel(BaseModel<?> bedRemoteModel) {
        _bedRemoteModel = bedRemoteModel;
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

        Class<?> remoteModelClass = _bedRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bedRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BedLocalServiceUtil.addBed(this);
        } else {
            BedLocalServiceUtil.updateBed(this);
        }
    }

    @Override
    public Bed toEscapedModel() {
        return (Bed) ProxyUtil.newProxyInstance(Bed.class.getClassLoader(),
            new Class[] { Bed.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BedClp clone = new BedClp();

        clone.setBedId(getBedId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setLocationId(getLocationId());
        clone.setBedNo(getBedNo());
        clone.setAlias(getAlias());
        clone.setPatientId(getPatientId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Bed bed) {
        long primaryKey = bed.getPrimaryKey();

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

        if (!(obj instanceof BedClp)) {
            return false;
        }

        BedClp bed = (BedClp) obj;

        long primaryKey = bed.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{bedId=");
        sb.append(getBedId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", bedNo=");
        sb.append(getBedNo());
        sb.append(", alias=");
        sb.append(getAlias());
        sb.append(", patientId=");
        sb.append(getPatientId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Bed");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bedId</column-name><column-value><![CDATA[");
        sb.append(getBedId());
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
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bedNo</column-name><column-value><![CDATA[");
        sb.append(getBedNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alias</column-name><column-value><![CDATA[");
        sb.append(getAlias());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patientId</column-name><column-value><![CDATA[");
        sb.append(getPatientId());
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
