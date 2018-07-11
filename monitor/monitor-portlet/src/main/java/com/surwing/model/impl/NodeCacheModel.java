package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Node in entity cache.
 *
 * @author zhaiyz
 * @see Node
 * @generated
 */
public class NodeCacheModel implements CacheModel<Node>, Externalizable {
    public long nodeId;
    public long companyId;
    public long groupId;
    public String nodeNo;
    public long locationId;
    public int nodeType;
    public String ip;
    public long lastReceivedTime;
    public long lastTransmitTime;
    public int status;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{nodeId=");
        sb.append(nodeId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", nodeNo=");
        sb.append(nodeNo);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", nodeType=");
        sb.append(nodeType);
        sb.append(", ip=");
        sb.append(ip);
        sb.append(", lastReceivedTime=");
        sb.append(lastReceivedTime);
        sb.append(", lastTransmitTime=");
        sb.append(lastTransmitTime);
        sb.append(", status=");
        sb.append(status);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Node toEntityModel() {
        NodeImpl nodeImpl = new NodeImpl();

        nodeImpl.setNodeId(nodeId);
        nodeImpl.setCompanyId(companyId);
        nodeImpl.setGroupId(groupId);

        if (nodeNo == null) {
            nodeImpl.setNodeNo(StringPool.BLANK);
        } else {
            nodeImpl.setNodeNo(nodeNo);
        }

        nodeImpl.setLocationId(locationId);
        nodeImpl.setNodeType(nodeType);

        if (ip == null) {
            nodeImpl.setIp(StringPool.BLANK);
        } else {
            nodeImpl.setIp(ip);
        }

        if (lastReceivedTime == Long.MIN_VALUE) {
            nodeImpl.setLastReceivedTime(null);
        } else {
            nodeImpl.setLastReceivedTime(new Date(lastReceivedTime));
        }

        if (lastTransmitTime == Long.MIN_VALUE) {
            nodeImpl.setLastTransmitTime(null);
        } else {
            nodeImpl.setLastTransmitTime(new Date(lastTransmitTime));
        }

        nodeImpl.setStatus(status);

        if (createDate == Long.MIN_VALUE) {
            nodeImpl.setCreateDate(null);
        } else {
            nodeImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            nodeImpl.setModifiedDate(null);
        } else {
            nodeImpl.setModifiedDate(new Date(modifiedDate));
        }

        nodeImpl.resetOriginalValues();

        return nodeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        nodeId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        nodeNo = objectInput.readUTF();
        locationId = objectInput.readLong();
        nodeType = objectInput.readInt();
        ip = objectInput.readUTF();
        lastReceivedTime = objectInput.readLong();
        lastTransmitTime = objectInput.readLong();
        status = objectInput.readInt();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(nodeId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);

        if (nodeNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nodeNo);
        }

        objectOutput.writeLong(locationId);
        objectOutput.writeInt(nodeType);

        if (ip == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ip);
        }

        objectOutput.writeLong(lastReceivedTime);
        objectOutput.writeLong(lastTransmitTime);
        objectOutput.writeInt(status);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
