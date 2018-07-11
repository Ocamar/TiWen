package com.surwing.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author zhaiyz
 * @generated
 */
public class UserInfoSoap implements Serializable {
    private long _userId;
    private long _locationId;

    public UserInfoSoap() {
    }

    public static UserInfoSoap toSoapModel(UserInfo model) {
        UserInfoSoap soapModel = new UserInfoSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setLocationId(model.getLocationId());

        return soapModel;
    }

    public static UserInfoSoap[] toSoapModels(UserInfo[] models) {
        UserInfoSoap[] soapModels = new UserInfoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserInfoSoap[][] toSoapModels(UserInfo[][] models) {
        UserInfoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserInfoSoap[models.length][models[0].length];
        } else {
            soapModels = new UserInfoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserInfoSoap[] toSoapModels(List<UserInfo> models) {
        List<UserInfoSoap> soapModels = new ArrayList<UserInfoSoap>(models.size());

        for (UserInfo model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserInfoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long pk) {
        setUserId(pk);
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }
}
