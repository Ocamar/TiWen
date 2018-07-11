package com.surwing.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author zhaiyz
 * @generated
 */
public class LocationSoap implements Serializable {
    private long _locationId;
    private long _companyId;
    private long _groupId;
    private String _locationNo;
    private String _locationName;
    private boolean _esbEnabled;
    private Date _createDate;
    private Date _modifiedDate;

    public LocationSoap() {
    }

    public static LocationSoap toSoapModel(Location model) {
        LocationSoap soapModel = new LocationSoap();

        soapModel.setLocationId(model.getLocationId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setLocationNo(model.getLocationNo());
        soapModel.setLocationName(model.getLocationName());
        soapModel.setEsbEnabled(model.getEsbEnabled());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static LocationSoap[] toSoapModels(Location[] models) {
        LocationSoap[] soapModels = new LocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[][] toSoapModels(Location[][] models) {
        LocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LocationSoap[models.length][models[0].length];
        } else {
            soapModels = new LocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[] toSoapModels(List<Location> models) {
        List<LocationSoap> soapModels = new ArrayList<LocationSoap>(models.size());

        for (Location model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LocationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _locationId;
    }

    public void setPrimaryKey(long pk) {
        setLocationId(pk);
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getLocationNo() {
        return _locationNo;
    }

    public void setLocationNo(String locationNo) {
        _locationNo = locationNo;
    }

    public String getLocationName() {
        return _locationName;
    }

    public void setLocationName(String locationName) {
        _locationName = locationName;
    }

    public boolean getEsbEnabled() {
        return _esbEnabled;
    }

    public boolean isEsbEnabled() {
        return _esbEnabled;
    }

    public void setEsbEnabled(boolean esbEnabled) {
        _esbEnabled = esbEnabled;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }
}
