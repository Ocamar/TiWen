package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bed}.
 * </p>
 *
 * @author zhaiyz
 * @see Bed
 * @generated
 */
public class BedWrapper implements Bed, ModelWrapper<Bed> {
    private Bed _bed;

    public BedWrapper(Bed bed) {
        _bed = bed;
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

    /**
    * Returns the primary key of this bed.
    *
    * @return the primary key of this bed
    */
    @Override
    public long getPrimaryKey() {
        return _bed.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bed.
    *
    * @param primaryKey the primary key of this bed
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bed.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bed ID of this bed.
    *
    * @return the bed ID of this bed
    */
    @Override
    public long getBedId() {
        return _bed.getBedId();
    }

    /**
    * Sets the bed ID of this bed.
    *
    * @param bedId the bed ID of this bed
    */
    @Override
    public void setBedId(long bedId) {
        _bed.setBedId(bedId);
    }

    /**
    * Returns the company ID of this bed.
    *
    * @return the company ID of this bed
    */
    @Override
    public long getCompanyId() {
        return _bed.getCompanyId();
    }

    /**
    * Sets the company ID of this bed.
    *
    * @param companyId the company ID of this bed
    */
    @Override
    public void setCompanyId(long companyId) {
        _bed.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this bed.
    *
    * @return the group ID of this bed
    */
    @Override
    public long getGroupId() {
        return _bed.getGroupId();
    }

    /**
    * Sets the group ID of this bed.
    *
    * @param groupId the group ID of this bed
    */
    @Override
    public void setGroupId(long groupId) {
        _bed.setGroupId(groupId);
    }

    /**
    * Returns the location ID of this bed.
    *
    * @return the location ID of this bed
    */
    @Override
    public long getLocationId() {
        return _bed.getLocationId();
    }

    /**
    * Sets the location ID of this bed.
    *
    * @param locationId the location ID of this bed
    */
    @Override
    public void setLocationId(long locationId) {
        _bed.setLocationId(locationId);
    }

    /**
    * Returns the bed no of this bed.
    *
    * @return the bed no of this bed
    */
    @Override
    public java.lang.String getBedNo() {
        return _bed.getBedNo();
    }

    /**
    * Sets the bed no of this bed.
    *
    * @param bedNo the bed no of this bed
    */
    @Override
    public void setBedNo(java.lang.String bedNo) {
        _bed.setBedNo(bedNo);
    }

    /**
    * Returns the alias of this bed.
    *
    * @return the alias of this bed
    */
    @Override
    public java.lang.String getAlias() {
        return _bed.getAlias();
    }

    /**
    * Sets the alias of this bed.
    *
    * @param alias the alias of this bed
    */
    @Override
    public void setAlias(java.lang.String alias) {
        _bed.setAlias(alias);
    }

    /**
    * Returns the patient ID of this bed.
    *
    * @return the patient ID of this bed
    */
    @Override
    public long getPatientId() {
        return _bed.getPatientId();
    }

    /**
    * Sets the patient ID of this bed.
    *
    * @param patientId the patient ID of this bed
    */
    @Override
    public void setPatientId(long patientId) {
        _bed.setPatientId(patientId);
    }

    /**
    * Returns the create date of this bed.
    *
    * @return the create date of this bed
    */
    @Override
    public java.util.Date getCreateDate() {
        return _bed.getCreateDate();
    }

    /**
    * Sets the create date of this bed.
    *
    * @param createDate the create date of this bed
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _bed.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this bed.
    *
    * @return the modified date of this bed
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _bed.getModifiedDate();
    }

    /**
    * Sets the modified date of this bed.
    *
    * @param modifiedDate the modified date of this bed
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _bed.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _bed.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bed.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bed.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bed.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bed.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bed.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bed.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bed.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bed.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bed.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bed.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BedWrapper((Bed) _bed.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Bed bed) {
        return _bed.compareTo(bed);
    }

    @Override
    public int hashCode() {
        return _bed.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Bed> toCacheModel() {
        return _bed.toCacheModel();
    }

    @Override
    public com.surwing.model.Bed toEscapedModel() {
        return new BedWrapper(_bed.toEscapedModel());
    }

    @Override
    public com.surwing.model.Bed toUnescapedModel() {
        return new BedWrapper(_bed.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bed.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bed.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bed.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BedWrapper)) {
            return false;
        }

        BedWrapper bedWrapper = (BedWrapper) obj;

        if (Validator.equals(_bed, bedWrapper._bed)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bed getWrappedBed() {
        return _bed;
    }

    @Override
    public Bed getWrappedModel() {
        return _bed;
    }

    @Override
    public void resetOriginalValues() {
        _bed.resetOriginalValues();
    }
}
