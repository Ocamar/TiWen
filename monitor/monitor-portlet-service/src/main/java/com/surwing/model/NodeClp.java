package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.surwing.service.ClpSerializer;
import com.surwing.service.NodeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class NodeClp extends BaseModelImpl<Node> implements Node {
    private long _nodeId;
    private long _companyId;
    private long _groupId;
    private String _nodeNo;
    private long _locationId;
    private int _nodeType;
    private String _ip;
    private Date _lastReceivedTime;
    private Date _lastTransmitTime;
    private int _status;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _nodeRemoteModel;
    private Class<?> _clpSerializerClass = com.surwing.service.ClpSerializer.class;

    public NodeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Node.class;
    }

    @Override
    public String getModelClassName() {
        return Node.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _nodeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setNodeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _nodeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("nodeId", getNodeId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("nodeNo", getNodeNo());
        attributes.put("locationId", getLocationId());
        attributes.put("nodeType", getNodeType());
        attributes.put("ip", getIp());
        attributes.put("lastReceivedTime", getLastReceivedTime());
        attributes.put("lastTransmitTime", getLastTransmitTime());
        attributes.put("status", getStatus());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long nodeId = (Long) attributes.get("nodeId");

        if (nodeId != null) {
            setNodeId(nodeId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String nodeNo = (String) attributes.get("nodeNo");

        if (nodeNo != null) {
            setNodeNo(nodeNo);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        Integer nodeType = (Integer) attributes.get("nodeType");

        if (nodeType != null) {
            setNodeType(nodeType);
        }

        String ip = (String) attributes.get("ip");

        if (ip != null) {
            setIp(ip);
        }

        Date lastReceivedTime = (Date) attributes.get("lastReceivedTime");

        if (lastReceivedTime != null) {
            setLastReceivedTime(lastReceivedTime);
        }

        Date lastTransmitTime = (Date) attributes.get("lastTransmitTime");

        if (lastTransmitTime != null) {
            setLastTransmitTime(lastTransmitTime);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
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
    public long getNodeId() {
        return _nodeId;
    }

    @Override
    public void setNodeId(long nodeId) {
        _nodeId = nodeId;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setNodeId", long.class);

                method.invoke(_nodeRemoteModel, nodeId);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_nodeRemoteModel, companyId);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_nodeRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNodeNo() {
        return _nodeNo;
    }

    @Override
    public void setNodeNo(String nodeNo) {
        _nodeNo = nodeNo;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setNodeNo", String.class);

                method.invoke(_nodeRemoteModel, nodeNo);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_nodeRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNodeType() {
        return _nodeType;
    }

    @Override
    public void setNodeType(int nodeType) {
        _nodeType = nodeType;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setNodeType", int.class);

                method.invoke(_nodeRemoteModel, nodeType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIp() {
        return _ip;
    }

    @Override
    public void setIp(String ip) {
        _ip = ip;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setIp", String.class);

                method.invoke(_nodeRemoteModel, ip);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLastReceivedTime() {
        return _lastReceivedTime;
    }

    @Override
    public void setLastReceivedTime(Date lastReceivedTime) {
        _lastReceivedTime = lastReceivedTime;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setLastReceivedTime",
                        Date.class);

                method.invoke(_nodeRemoteModel, lastReceivedTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLastTransmitTime() {
        return _lastTransmitTime;
    }

    @Override
    public void setLastTransmitTime(Date lastTransmitTime) {
        _lastTransmitTime = lastTransmitTime;

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setLastTransmitTime",
                        Date.class);

                method.invoke(_nodeRemoteModel, lastTransmitTime);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_nodeRemoteModel, status);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_nodeRemoteModel, createDate);
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

        if (_nodeRemoteModel != null) {
            try {
                Class<?> clazz = _nodeRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_nodeRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getNodeRemoteModel() {
        return _nodeRemoteModel;
    }

    public void setNodeRemoteModel(BaseModel<?> nodeRemoteModel) {
        _nodeRemoteModel = nodeRemoteModel;
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

        Class<?> remoteModelClass = _nodeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_nodeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NodeLocalServiceUtil.addNode(this);
        } else {
            NodeLocalServiceUtil.updateNode(this);
        }
    }

    @Override
    public Node toEscapedModel() {
        return (Node) ProxyUtil.newProxyInstance(Node.class.getClassLoader(),
            new Class[] { Node.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NodeClp clone = new NodeClp();

        clone.setNodeId(getNodeId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setNodeNo(getNodeNo());
        clone.setLocationId(getLocationId());
        clone.setNodeType(getNodeType());
        clone.setIp(getIp());
        clone.setLastReceivedTime(getLastReceivedTime());
        clone.setLastTransmitTime(getLastTransmitTime());
        clone.setStatus(getStatus());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Node node) {
        int value = 0;

        if (getNodeId() < node.getNodeId()) {
            value = -1;
        } else if (getNodeId() > node.getNodeId()) {
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

        if (!(obj instanceof NodeClp)) {
            return false;
        }

        NodeClp node = (NodeClp) obj;

        long primaryKey = node.getPrimaryKey();

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
        StringBundler sb = new StringBundler(25);

        sb.append("{nodeId=");
        sb.append(getNodeId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", nodeNo=");
        sb.append(getNodeNo());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", nodeType=");
        sb.append(getNodeType());
        sb.append(", ip=");
        sb.append(getIp());
        sb.append(", lastReceivedTime=");
        sb.append(getLastReceivedTime());
        sb.append(", lastTransmitTime=");
        sb.append(getLastTransmitTime());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.Node");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>nodeId</column-name><column-value><![CDATA[");
        sb.append(getNodeId());
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
            "<column><column-name>nodeNo</column-name><column-value><![CDATA[");
        sb.append(getNodeNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nodeType</column-name><column-value><![CDATA[");
        sb.append(getNodeType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ip</column-name><column-value><![CDATA[");
        sb.append(getIp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastReceivedTime</column-name><column-value><![CDATA[");
        sb.append(getLastReceivedTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastTransmitTime</column-name><column-value><![CDATA[");
        sb.append(getLastTransmitTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
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
