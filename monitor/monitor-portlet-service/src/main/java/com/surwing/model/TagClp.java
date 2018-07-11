package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.TagLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class TagClp extends BaseModelImpl<Tag> implements Tag {
    private long _tagId;
    private long _companyId;
    private long _groupId;
    private String _tagNo;
    private int _type;
    private long _nodeId;
    private long _locationId;
    private int _status;
    private long _patientId;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _tagRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public TagClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Tag.class;
    }

    @Override
    public String getModelClassName() {
        return Tag.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _tagId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTagId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _tagId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tagId", getTagId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("tagNo", getTagNo());
        attributes.put("type", getType());
        attributes.put("nodeId", getNodeId());
        attributes.put("locationId", getLocationId());
        attributes.put("status", getStatus());
        attributes.put("patientId", getPatientId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tagId = (Long) attributes.get("tagId");

        if (tagId != null) {
            setTagId(tagId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String tagNo = (String) attributes.get("tagNo");

        if (tagNo != null) {
            setTagNo(tagNo);
        }

        Integer type = (Integer) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        Long nodeId = (Long) attributes.get("nodeId");

        if (nodeId != null) {
            setNodeId(nodeId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
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
    public long getTagId() {
        return _tagId;
    }

    @Override
    public void setTagId(long tagId) {
        _tagId = tagId;

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setTagId", long.class);

                method.invoke(_tagRemoteModel, tagId);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_tagRemoteModel, companyId);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_tagRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTagNo() {
        return _tagNo;
    }

    @Override
    public void setTagNo(String tagNo) {
        _tagNo = tagNo;

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setTagNo", String.class);

                method.invoke(_tagRemoteModel, tagNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getType() {
        return _type;
    }

    @Override
    public void setType(int type) {
        _type = type;

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setType", int.class);

                method.invoke(_tagRemoteModel, type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getNodeId() {
        return _nodeId;
    }

    @Override
    public void setNodeId(long nodeId) {
        _nodeId = nodeId;

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setNodeId", long.class);

                method.invoke(_tagRemoteModel, nodeId);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_tagRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_tagRemoteModel, status);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setPatientId", long.class);

                method.invoke(_tagRemoteModel, patientId);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_tagRemoteModel, createDate);
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

        if (_tagRemoteModel != null) {
            try {
                Class<?> clazz = _tagRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_tagRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTagRemoteModel() {
        return _tagRemoteModel;
    }

    public void setTagRemoteModel(BaseModel<?> tagRemoteModel) {
        _tagRemoteModel = tagRemoteModel;
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

        Class<?> remoteModelClass = _tagRemoteModel.getClass();

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

        Object returnValue = method.invoke(_tagRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TagLocalServiceUtil.addTag(this);
        } else {
            TagLocalServiceUtil.updateTag(this);
        }
    }

    @Override
    public Tag toEscapedModel() {
        return (Tag) ProxyUtil.newProxyInstance(Tag.class.getClassLoader(),
            new Class[] { Tag.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TagClp clone = new TagClp();

        clone.setTagId(getTagId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setTagNo(getTagNo());
        clone.setType(getType());
        clone.setNodeId(getNodeId());
        clone.setLocationId(getLocationId());
        clone.setStatus(getStatus());
        clone.setPatientId(getPatientId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Tag tag) {
        long primaryKey = tag.getPrimaryKey();

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

        if (!(obj instanceof TagClp)) {
            return false;
        }

        TagClp tag = (TagClp) obj;

        long primaryKey = tag.getPrimaryKey();

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
        StringBundler sb = new StringBundler(23);

        sb.append("{tagId=");
        sb.append(getTagId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", tagNo=");
        sb.append(getTagNo());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", nodeId=");
        sb.append(getNodeId());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", status=");
        sb.append(getStatus());
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
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Tag");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>tagId</column-name><column-value><![CDATA[");
        sb.append(getTagId());
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
            "<column><column-name>tagNo</column-name><column-value><![CDATA[");
        sb.append(getTagNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nodeId</column-name><column-value><![CDATA[");
        sb.append(getNodeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
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
