package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Tag}.
 * </p>
 *
 * @author zhaiyz
 * @see Tag
 * @generated
 */
public class TagWrapper implements Tag, ModelWrapper<Tag> {
    private Tag _tag;

    public TagWrapper(Tag tag) {
        _tag = tag;
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

    /**
    * Returns the primary key of this tag.
    *
    * @return the primary key of this tag
    */
    @Override
    public long getPrimaryKey() {
        return _tag.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tag.
    *
    * @param primaryKey the primary key of this tag
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _tag.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the tag ID of this tag.
    *
    * @return the tag ID of this tag
    */
    @Override
    public long getTagId() {
        return _tag.getTagId();
    }

    /**
    * Sets the tag ID of this tag.
    *
    * @param tagId the tag ID of this tag
    */
    @Override
    public void setTagId(long tagId) {
        _tag.setTagId(tagId);
    }

    /**
    * Returns the company ID of this tag.
    *
    * @return the company ID of this tag
    */
    @Override
    public long getCompanyId() {
        return _tag.getCompanyId();
    }

    /**
    * Sets the company ID of this tag.
    *
    * @param companyId the company ID of this tag
    */
    @Override
    public void setCompanyId(long companyId) {
        _tag.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this tag.
    *
    * @return the group ID of this tag
    */
    @Override
    public long getGroupId() {
        return _tag.getGroupId();
    }

    /**
    * Sets the group ID of this tag.
    *
    * @param groupId the group ID of this tag
    */
    @Override
    public void setGroupId(long groupId) {
        _tag.setGroupId(groupId);
    }

    /**
    * Returns the tag no of this tag.
    *
    * @return the tag no of this tag
    */
    @Override
    public java.lang.String getTagNo() {
        return _tag.getTagNo();
    }

    /**
    * Sets the tag no of this tag.
    *
    * @param tagNo the tag no of this tag
    */
    @Override
    public void setTagNo(java.lang.String tagNo) {
        _tag.setTagNo(tagNo);
    }

    /**
    * Returns the type of this tag.
    *
    * @return the type of this tag
    */
    @Override
    public int getType() {
        return _tag.getType();
    }

    /**
    * Sets the type of this tag.
    *
    * @param type the type of this tag
    */
    @Override
    public void setType(int type) {
        _tag.setType(type);
    }

    /**
    * Returns the node ID of this tag.
    *
    * @return the node ID of this tag
    */
    @Override
    public long getNodeId() {
        return _tag.getNodeId();
    }

    /**
    * Sets the node ID of this tag.
    *
    * @param nodeId the node ID of this tag
    */
    @Override
    public void setNodeId(long nodeId) {
        _tag.setNodeId(nodeId);
    }

    /**
    * Returns the location ID of this tag.
    *
    * @return the location ID of this tag
    */
    @Override
    public long getLocationId() {
        return _tag.getLocationId();
    }

    /**
    * Sets the location ID of this tag.
    *
    * @param locationId the location ID of this tag
    */
    @Override
    public void setLocationId(long locationId) {
        _tag.setLocationId(locationId);
    }

    /**
    * Returns the status of this tag.
    *
    * @return the status of this tag
    */
    @Override
    public int getStatus() {
        return _tag.getStatus();
    }

    /**
    * Sets the status of this tag.
    *
    * @param status the status of this tag
    */
    @Override
    public void setStatus(int status) {
        _tag.setStatus(status);
    }

    /**
    * Returns the patient ID of this tag.
    *
    * @return the patient ID of this tag
    */
    @Override
    public long getPatientId() {
        return _tag.getPatientId();
    }

    /**
    * Sets the patient ID of this tag.
    *
    * @param patientId the patient ID of this tag
    */
    @Override
    public void setPatientId(long patientId) {
        _tag.setPatientId(patientId);
    }

    /**
    * Returns the create date of this tag.
    *
    * @return the create date of this tag
    */
    @Override
    public java.util.Date getCreateDate() {
        return _tag.getCreateDate();
    }

    /**
    * Sets the create date of this tag.
    *
    * @param createDate the create date of this tag
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _tag.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this tag.
    *
    * @return the modified date of this tag
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _tag.getModifiedDate();
    }

    /**
    * Sets the modified date of this tag.
    *
    * @param modifiedDate the modified date of this tag
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _tag.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _tag.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tag.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tag.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tag.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tag.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tag.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tag.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tag.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tag.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tag.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tag.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TagWrapper((Tag) _tag.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Tag tag) {
        return _tag.compareTo(tag);
    }

    @Override
    public int hashCode() {
        return _tag.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Tag> toCacheModel() {
        return _tag.toCacheModel();
    }

    @Override
    public com.surwing.model.Tag toEscapedModel() {
        return new TagWrapper(_tag.toEscapedModel());
    }

    @Override
    public com.surwing.model.Tag toUnescapedModel() {
        return new TagWrapper(_tag.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tag.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tag.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tag.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TagWrapper)) {
            return false;
        }

        TagWrapper tagWrapper = (TagWrapper) obj;

        if (Validator.equals(_tag, tagWrapper._tag)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Tag getWrappedTag() {
        return _tag;
    }

    @Override
    public Tag getWrappedModel() {
        return _tag;
    }

    @Override
    public void resetOriginalValues() {
        _tag.resetOriginalValues();
    }
}
