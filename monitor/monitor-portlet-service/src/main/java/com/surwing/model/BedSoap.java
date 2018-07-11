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
public class BedSoap implements Serializable {
    private long _bedId;
    private long _companyId;
    private long _groupId;
    private long _locationId;
    private String _bedNo;
    private String _alias;
    private long _patientId;
    private Date _createDate;
    private Date _modifiedDate;

    public BedSoap() {
    }

    public static BedSoap toSoapModel(Bed model) {
        BedSoap soapModel = new BedSoap();

        soapModel.setBedId(model.getBedId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setBedNo(model.getBedNo());
        soapModel.setAlias(model.getAlias());
        soapModel.setPatientId(model.getPatientId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static BedSoap[] toSoapModels(Bed[] models) {
        BedSoap[] soapModels = new BedSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BedSoap[][] toSoapModels(Bed[][] models) {
        BedSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BedSoap[models.length][models[0].length];
        } else {
            soapModels = new BedSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BedSoap[] toSoapModels(List<Bed> models) {
        List<BedSoap> soapModels = new ArrayList<BedSoap>(models.size());

        for (Bed model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BedSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bedId;
    }

    public void setPrimaryKey(long pk) {
        setBedId(pk);
    }

    public long getBedId() {
        return _bedId;
    }

    public void setBedId(long bedId) {
        _bedId = bedId;
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

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public String getBedNo() {
        return _bedNo;
    }

    public void setBedNo(String bedNo) {
        _bedNo = bedNo;
    }

    public String getAlias() {
        return _alias;
    }

    public void setAlias(String alias) {
        _alias = alias;
    }

    public long getPatientId() {
        return _patientId;
    }

    public void setPatientId(long patientId) {
        _patientId = patientId;
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
