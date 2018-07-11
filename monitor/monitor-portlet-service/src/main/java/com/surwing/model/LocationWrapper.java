package com.surwing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Location}.
 * </p>
 *
 * @author zhaiyz
 * @see Location
 * @generated
 */
public class LocationWrapper implements Location, ModelWrapper<Location> {
    private Location _location;

    public LocationWrapper(Location location) {
        _location = location;
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

    /**
    * Returns the primary key of this location.
    *
    * @return the primary key of this location
    */
    @Override
    public long getPrimaryKey() {
        return _location.getPrimaryKey();
    }

    /**
    * Sets the primary key of this location.
    *
    * @param primaryKey the primary key of this location
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _location.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the location ID of this location.
    *
    * @return the location ID of this location
    */
    @Override
    public long getLocationId() {
        return _location.getLocationId();
    }

    /**
    * Sets the location ID of this location.
    *
    * @param locationId the location ID of this location
    */
    @Override
    public void setLocationId(long locationId) {
        _location.setLocationId(locationId);
    }

    /**
    * Returns the company ID of this location.
    *
    * @return the company ID of this location
    */
    @Override
    public long getCompanyId() {
        return _location.getCompanyId();
    }

    /**
    * Sets the company ID of this location.
    *
    * @param companyId the company ID of this location
    */
    @Override
    public void setCompanyId(long companyId) {
        _location.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this location.
    *
    * @return the group ID of this location
    */
    @Override
    public long getGroupId() {
        return _location.getGroupId();
    }

    /**
    * Sets the group ID of this location.
    *
    * @param groupId the group ID of this location
    */
    @Override
    public void setGroupId(long groupId) {
        _location.setGroupId(groupId);
    }

    /**
    * Returns the location no of this location.
    *
    * @return the location no of this location
    */
    @Override
    public java.lang.String getLocationNo() {
        return _location.getLocationNo();
    }

    /**
    * Sets the location no of this location.
    *
    * @param locationNo the location no of this location
    */
    @Override
    public void setLocationNo(java.lang.String locationNo) {
        _location.setLocationNo(locationNo);
    }

    /**
    * Returns the location name of this location.
    *
    * @return the location name of this location
    */
    @Override
    public java.lang.String getLocationName() {
        return _location.getLocationName();
    }

    /**
    * Sets the location name of this location.
    *
    * @param locationName the location name of this location
    */
    @Override
    public void setLocationName(java.lang.String locationName) {
        _location.setLocationName(locationName);
    }

    /**
    * Returns the esb enabled of this location.
    *
    * @return the esb enabled of this location
    */
    @Override
    public boolean getEsbEnabled() {
        return _location.getEsbEnabled();
    }

    /**
    * Returns <code>true</code> if this location is esb enabled.
    *
    * @return <code>true</code> if this location is esb enabled; <code>false</code> otherwise
    */
    @Override
    public boolean isEsbEnabled() {
        return _location.isEsbEnabled();
    }

    /**
    * Sets whether this location is esb enabled.
    *
    * @param esbEnabled the esb enabled of this location
    */
    @Override
    public void setEsbEnabled(boolean esbEnabled) {
        _location.setEsbEnabled(esbEnabled);
    }

    /**
    * Returns the create date of this location.
    *
    * @return the create date of this location
    */
    @Override
    public java.util.Date getCreateDate() {
        return _location.getCreateDate();
    }

    /**
    * Sets the create date of this location.
    *
    * @param createDate the create date of this location
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _location.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this location.
    *
    * @return the modified date of this location
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _location.getModifiedDate();
    }

    /**
    * Sets the modified date of this location.
    *
    * @param modifiedDate the modified date of this location
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _location.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _location.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _location.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _location.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _location.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _location.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _location.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _location.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _location.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _location.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _location.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _location.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LocationWrapper((Location) _location.clone());
    }

    @Override
    public int compareTo(com.surwing.model.Location location) {
        return _location.compareTo(location);
    }

    @Override
    public int hashCode() {
        return _location.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.surwing.model.Location> toCacheModel() {
        return _location.toCacheModel();
    }

    @Override
    public com.surwing.model.Location toEscapedModel() {
        return new LocationWrapper(_location.toEscapedModel());
    }

    @Override
    public com.surwing.model.Location toUnescapedModel() {
        return new LocationWrapper(_location.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _location.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _location.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _location.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LocationWrapper)) {
            return false;
        }

        LocationWrapper locationWrapper = (LocationWrapper) obj;

        if (Validator.equals(_location, locationWrapper._location)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Location getWrappedLocation() {
        return _location;
    }

    @Override
    public Location getWrappedModel() {
        return _location;
    }

    @Override
    public void resetOriginalValues() {
        _location.resetOriginalValues();
    }
}
