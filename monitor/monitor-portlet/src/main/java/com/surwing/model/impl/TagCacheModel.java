package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Tag;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tag in entity cache.
 *
 * @author zhaiyz
 * @see Tag
 * @generated
 */
public class TagCacheModel implements CacheModel<Tag>, Externalizable {
    public long tagId;
    public long companyId;
    public long groupId;
    public String tagNo;
    public int type;
    public long nodeId;
    public long locationId;
    public int status;
    public long patientId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{tagId=");
        sb.append(tagId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", tagNo=");
        sb.append(tagNo);
        sb.append(", type=");
        sb.append(type);
        sb.append(", nodeId=");
        sb.append(nodeId);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", status=");
        sb.append(status);
        sb.append(", patientId=");
        sb.append(patientId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Tag toEntityModel() {
        TagImpl tagImpl = new TagImpl();

        tagImpl.setTagId(tagId);
        tagImpl.setCompanyId(companyId);
        tagImpl.setGroupId(groupId);

        if (tagNo == null) {
            tagImpl.setTagNo(StringPool.BLANK);
        } else {
            tagImpl.setTagNo(tagNo);
        }

        tagImpl.setType(type);
        tagImpl.setNodeId(nodeId);
        tagImpl.setLocationId(locationId);
        tagImpl.setStatus(status);
        tagImpl.setPatientId(patientId);

        if (createDate == Long.MIN_VALUE) {
            tagImpl.setCreateDate(null);
        } else {
            tagImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            tagImpl.setModifiedDate(null);
        } else {
            tagImpl.setModifiedDate(new Date(modifiedDate));
        }

        tagImpl.resetOriginalValues();

        return tagImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tagId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        tagNo = objectInput.readUTF();
        type = objectInput.readInt();
        nodeId = objectInput.readLong();
        locationId = objectInput.readLong();
        status = objectInput.readInt();
        patientId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tagId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);

        if (tagNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tagNo);
        }

        objectOutput.writeInt(type);
        objectOutput.writeLong(nodeId);
        objectOutput.writeLong(locationId);
        objectOutput.writeInt(status);
        objectOutput.writeLong(patientId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
