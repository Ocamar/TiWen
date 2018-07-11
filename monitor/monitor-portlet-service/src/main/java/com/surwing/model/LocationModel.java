package com.surwing.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Location service. Represents a row in the &quot;M_Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.surwing.model.impl.LocationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.surwing.model.impl.LocationImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see Location
 * @see com.surwing.model.impl.LocationImpl
 * @see com.surwing.model.impl.LocationModelImpl
 * @generated
 */
public interface LocationModel extends BaseModel<Location> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a location model instance should use the {@link Location} interface instead.
     */

    /**
     * Returns the primary key of this location.
     *
     * @return the primary key of this location
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this location.
     *
     * @param primaryKey the primary key of this location
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the location ID of this location.
     *
     * @return the location ID of this location
     */
    public long getLocationId();

    /**
     * Sets the location ID of this location.
     *
     * @param locationId the location ID of this location
     */
    public void setLocationId(long locationId);

    /**
     * Returns the company ID of this location.
     *
     * @return the company ID of this location
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this location.
     *
     * @param companyId the company ID of this location
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this location.
     *
     * @return the group ID of this location
     */
    public long getGroupId();

    /**
     * Sets the group ID of this location.
     *
     * @param groupId the group ID of this location
     */
    public void setGroupId(long groupId);

    /**
     * Returns the location no of this location.
     *
     * @return the location no of this location
     */
    @AutoEscape
    public String getLocationNo();

    /**
     * Sets the location no of this location.
     *
     * @param locationNo the location no of this location
     */
    public void setLocationNo(String locationNo);

    /**
     * Returns the location name of this location.
     *
     * @return the location name of this location
     */
    @AutoEscape
    public String getLocationName();

    /**
     * Sets the location name of this location.
     *
     * @param locationName the location name of this location
     */
    public void setLocationName(String locationName);

    /**
     * Returns the esb enabled of this location.
     *
     * @return the esb enabled of this location
     */
    public boolean getEsbEnabled();

    /**
     * Returns <code>true</code> if this location is esb enabled.
     *
     * @return <code>true</code> if this location is esb enabled; <code>false</code> otherwise
     */
    public boolean isEsbEnabled();

    /**
     * Sets whether this location is esb enabled.
     *
     * @param esbEnabled the esb enabled of this location
     */
    public void setEsbEnabled(boolean esbEnabled);

    /**
     * Returns the create date of this location.
     *
     * @return the create date of this location
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this location.
     *
     * @param createDate the create date of this location
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this location.
     *
     * @return the modified date of this location
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this location.
     *
     * @param modifiedDate the modified date of this location
     */
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.surwing.model.Location location);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.surwing.model.Location> toCacheModel();

    @Override
    public com.surwing.model.Location toEscapedModel();

    @Override
    public com.surwing.model.Location toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}