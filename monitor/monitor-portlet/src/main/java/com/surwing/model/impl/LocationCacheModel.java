package com.surwing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.surwing.model.Location;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Location in entity cache.
 *
 * @author zhaiyz
 * @see Location
 * @generated
 */
public class LocationCacheModel implements CacheModel<Location>, Externalizable {
    public long locationId;
    public long companyId;
    public long groupId;
    public String locationNo;
    public String locationName;
    public boolean esbEnabled;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{locationId=");
        sb.append(locationId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", locationNo=");
        sb.append(locationNo);
        sb.append(", locationName=");
        sb.append(locationName);
        sb.append(", esbEnabled=");
        sb.append(esbEnabled);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Location toEntityModel() {
        LocationImpl locationImpl = new LocationImpl();

        locationImpl.setLocationId(locationId);
        locationImpl.setCompanyId(companyId);
        locationImpl.setGroupId(groupId);

        if (locationNo == null) {
            locationImpl.setLocationNo(StringPool.BLANK);
        } else {
            locationImpl.setLocationNo(locationNo);
        }

        if (locationName == null) {
            locationImpl.setLocationName(StringPool.BLANK);
        } else {
            locationImpl.setLocationName(locationName);
        }

        locationImpl.setEsbEnabled(esbEnabled);

        if (createDate == Long.MIN_VALUE) {
            locationImpl.setCreateDate(null);
        } else {
            locationImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            locationImpl.setModifiedDate(null);
        } else {
            locationImpl.setModifiedDate(new Date(modifiedDate));
        }

        locationImpl.resetOriginalValues();

        return locationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        locationId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        locationNo = objectInput.readUTF();
        locationName = objectInput.readUTF();
        esbEnabled = objectInput.readBoolean();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(locationId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);

        if (locationNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(locationNo);
        }

        if (locationName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(locationName);
        }

        objectOutput.writeBoolean(esbEnabled);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
