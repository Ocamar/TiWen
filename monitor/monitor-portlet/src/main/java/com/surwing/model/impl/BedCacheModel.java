package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Bed;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bed in entity cache.
 *
 * @author zhaiyz
 * @see Bed
 * @generated
 */
public class BedCacheModel implements CacheModel<Bed>, Externalizable {
    public long bedId;
    public long companyId;
    public long groupId;
    public long locationId;
    public String bedNo;
    public String alias;
    public long patientId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{bedId=");
        sb.append(bedId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", bedNo=");
        sb.append(bedNo);
        sb.append(", alias=");
        sb.append(alias);
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
    public Bed toEntityModel() {
        BedImpl bedImpl = new BedImpl();

        bedImpl.setBedId(bedId);
        bedImpl.setCompanyId(companyId);
        bedImpl.setGroupId(groupId);
        bedImpl.setLocationId(locationId);

        if (bedNo == null) {
            bedImpl.setBedNo(StringPool.BLANK);
        } else {
            bedImpl.setBedNo(bedNo);
        }

        if (alias == null) {
            bedImpl.setAlias(StringPool.BLANK);
        } else {
            bedImpl.setAlias(alias);
        }

        bedImpl.setPatientId(patientId);

        if (createDate == Long.MIN_VALUE) {
            bedImpl.setCreateDate(null);
        } else {
            bedImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bedImpl.setModifiedDate(null);
        } else {
            bedImpl.setModifiedDate(new Date(modifiedDate));
        }

        bedImpl.resetOriginalValues();

        return bedImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bedId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        locationId = objectInput.readLong();
        bedNo = objectInput.readUTF();
        alias = objectInput.readUTF();
        patientId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bedId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(locationId);

        if (bedNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bedNo);
        }

        if (alias == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(alias);
        }

        objectOutput.writeLong(patientId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
