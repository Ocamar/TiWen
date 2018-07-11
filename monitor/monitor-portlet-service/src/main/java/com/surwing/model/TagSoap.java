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
public class TagSoap implements Serializable {
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

    public TagSoap() {
    }

    public static TagSoap toSoapModel(Tag model) {
        TagSoap soapModel = new TagSoap();

        soapModel.setTagId(model.getTagId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setTagNo(model.getTagNo());
        soapModel.setType(model.getType());
        soapModel.setNodeId(model.getNodeId());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setStatus(model.getStatus());
        soapModel.setPatientId(model.getPatientId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static TagSoap[] toSoapModels(Tag[] models) {
        TagSoap[] soapModels = new TagSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TagSoap[][] toSoapModels(Tag[][] models) {
        TagSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TagSoap[models.length][models[0].length];
        } else {
            soapModels = new TagSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TagSoap[] toSoapModels(List<Tag> models) {
        List<TagSoap> soapModels = new ArrayList<TagSoap>(models.size());

        for (Tag model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TagSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _tagId;
    }

    public void setPrimaryKey(long pk) {
        setTagId(pk);
    }

    public long getTagId() {
        return _tagId;
    }

    public void setTagId(long tagId) {
        _tagId = tagId;
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

    public String getTagNo() {
        return _tagNo;
    }

    public void setTagNo(String tagNo) {
        _tagNo = tagNo;
    }

    public int getType() {
        return _type;
    }

    public void setType(int type) {
        _type = type;
    }

    public long getNodeId() {
        return _nodeId;
    }

    public void setNodeId(long nodeId) {
        _nodeId = nodeId;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
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
