package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Location;

import com.surwing.service.LocationLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class LocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LocationLocalServiceUtil.getService());
        setClass(Location.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("locationId");
    }
}
