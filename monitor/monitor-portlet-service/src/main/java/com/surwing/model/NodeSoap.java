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
public class NodeSoap implements Serializable {
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

    public NodeSoap() {
    }

    public static NodeSoap toSoapModel(Node model) {
        NodeSoap soapModel = new NodeSoap();

        soapModel.setNodeId(model.getNodeId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setNodeNo(model.getNodeNo());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setNodeType(model.getNodeType());
        soapModel.setIp(model.getIp());
        soapModel.setLastReceivedTime(model.getLastReceivedTime());
        soapModel.setLastTransmitTime(model.getLastTransmitTime());
        soapModel.setStatus(model.getStatus());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static NodeSoap[] toSoapModels(Node[] models) {
        NodeSoap[] soapModels = new NodeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NodeSoap[][] toSoapModels(Node[][] models) {
        NodeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NodeSoap[models.length][models[0].length];
        } else {
            soapModels = new NodeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NodeSoap[] toSoapModels(List<Node> models) {
        List<NodeSoap> soapModels = new ArrayList<NodeSoap>(models.size());

        for (Node model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NodeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _nodeId;
    }

    public void setPrimaryKey(long pk) {
        setNodeId(pk);
    }

    public long getNodeId() {
        return _nodeId;
    }

    public void setNodeId(long nodeId) {
        _nodeId = nodeId;
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

    public String getNodeNo() {
        return _nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        _nodeNo = nodeNo;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public int getNodeType() {
        return _nodeType;
    }

    public void setNodeType(int nodeType) {
        _nodeType = nodeType;
    }

    public String getIp() {
        return _ip;
    }

    public void setIp(String ip) {
        _ip = ip;
    }

    public Date getLastReceivedTime() {
        return _lastReceivedTime;
    }

    public void setLastReceivedTime(Date lastReceivedTime) {
        _lastReceivedTime = lastReceivedTime;
    }

    public Date getLastTransmitTime() {
        return _lastTransmitTime;
    }

    public void setLastTransmitTime(Date lastTransmitTime) {
        _lastTransmitTime = lastTransmitTime;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
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
