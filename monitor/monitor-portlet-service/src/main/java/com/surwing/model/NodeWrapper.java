package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Node}.
 * </p>
 *
 * @author zhaiyz
 * @see Node
 * @generated
 */
public class NodeWrapper implements Node, ModelWrapper<Node> {
    private Node _node;

    public NodeWrapper(Node node) {
        _node = node;
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

    /**
    * Returns the primary key of this node.
    *
    * @return the primary key of this node
    */
    @Override
    public long getPrimaryKey() {
        return _node.getPrimaryKey();
    }

    /**
    * Sets the primary key of this node.
    *
    * @param primaryKey the primary key of this node
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _node.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the node ID of this node.
    *
    * @return the node ID of this node
    */
    @Override
    public long getNodeId() {
        return _node.getNodeId();
    }

    /**
    * Sets the node ID of this node.
    *
    * @param nodeId the node ID of this node
    */
    @Override
    public void setNodeId(long nodeId) {
        _node.setNodeId(nodeId);
    }

    /**
    * Returns the company ID of this node.
    *
    * @return the company ID of this node
    */
    @Override
    public long getCompanyId() {
        return _node.getCompanyId();
    }

    /**
    * Sets the company ID of this node.
    *
    * @param companyId the company ID of this node
    */
    @Override
    public void setCompanyId(long companyId) {
        _node.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this node.
    *
    * @return the group ID of this node
    */
    @Override
    public long getGroupId() {
        return _node.getGroupId();
    }

    /**
    * Sets the group ID of this node.
    *
    * @param groupId the group ID of this node
    */
    @Override
    public void setGroupId(long groupId) {
        _node.setGroupId(groupId);
    }

    /**
    * Returns the node no of this node.
    *
    * @return the node no of this node
    */
    @Override
    public java.lang.String getNodeNo() {
        return _node.getNodeNo();
    }

    /**
    * Sets the node no of this node.
    *
    * @param nodeNo the node no of this node
    */
    @Override
    public void setNodeNo(java.lang.String nodeNo) {
        _node.setNodeNo(nodeNo);
    }

    /**
    * Returns the location ID of this node.
    *
    * @return the location ID of this node
    */
    @Override
    public long getLocationId() {
        return _node.getLocationId();
    }

    /**
    * Sets the location ID of this node.
    *
    * @param locationId the location ID of this node
    */
    @Override
    public void setLocationId(long locationId) {
        _node.setLocationId(locationId);
    }

    /**
    * Returns the node type of this node.
    *
    * @return the node type of this node
    */
    @Override
    public int getNodeType() {
        return _node.getNodeType();
    }

    /**
    * Sets the node type of this node.
    *
    * @param nodeType the node type of this node
    */
    @Override
    public void setNodeType(int nodeType) {
        _node.setNodeType(nodeType);
    }

    /**
    * Returns the ip of this node.
    *
    * @return the ip of this node
    */
    @Override
    public java.lang.String getIp() {
        return _node.getIp();
    }

    /**
    * Sets the ip of this node.
    *
    * @param ip the ip of this node
    */
    @Override
    public void setIp(java.lang.String ip) {
        _node.setIp(ip);
    }

    /**
    * Returns the last received time of this node.
    *
    * @return the last received time of this node
    */
    @Override
    public java.util.Date getLastReceivedTime() {
        return _node.getLastReceivedTime();
    }

    /**
    * Sets the last received time of this node.
    *
    * @param lastReceivedTime the last received time of this node
    */
    @Override
    public void setLastReceivedTime(java.util.Date lastReceivedTime) {
        _node.setLastReceivedTime(lastReceivedTime);
    }

    /**
    * Returns the last transmit time of this node.
    *
    * @return the last transmit time of this node
    */
    @Override
    public java.util.Date getLastTransmitTime() {
        return _node.getLastTransmitTime();
    }

    /**
    * Sets the last transmit time of this node.
    *
    * @param lastTransmitTime the last transmit time of this node
    */
    @Override
    public void setLastTransmitTime(java.util.Date lastTransmitTime) {
        _node.setLastTransmitTime(lastTransmitTime);
    }

    /**
    * Returns the status of this node.
    *
    * @return the status of this node
    */
    @Override
    public int getStatus() {
        return _node.getStatus();
    }

    /**
    * Sets the status of this node.
    *
    * @param status the status of this node
    */
    @Override
    public void setStatus(int status) {
        _node.setStatus(status);
    }

    /**
    * Returns the create date of this node.
    *
    * @return the create date of this node
    */
    @Override
    public java.util.Date getCreateDate() {
        return _node.getCreateDate();
    }

    /**
    * Sets the create date of this node.
    *
    * @param createDate the create date of this node
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _node.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this node.
    *
    * @return the modified date of this node
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _node.getModifiedDate();
    }

    /**
    * Sets the modified date of this node.
    *
    * @param modifiedDate the modified date of this node
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _node.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _node.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _node.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _node.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _node.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _node.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _node.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _node.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _node.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _node.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _node.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _node.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NodeWrapper((Node) _node.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Node node) {
        return _node.compareTo(node);
    }

    @Override
    public int hashCode() {
        return _node.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Node> toCacheModel() {
        return _node.toCacheModel();
    }

    @Override
    public com.surwing.model.Node toEscapedModel() {
        return new NodeWrapper(_node.toEscapedModel());
    }

    @Override
    public com.surwing.model.Node toUnescapedModel() {
        return new NodeWrapper(_node.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _node.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _node.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _node.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NodeWrapper)) {
            return false;
        }

        NodeWrapper nodeWrapper = (NodeWrapper) obj;

        if (Validator.equals(_node, nodeWrapper._node)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Node getWrappedNode() {
        return _node;
    }

    @Override
    public Node getWrappedModel() {
        return _node;
    }

    @Override
    public void resetOriginalValues() {
        _node.resetOriginalValues();
    }
}
