package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Temperature;

import com.surwing.service.TemperatureLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class TemperatureActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TemperatureActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TemperatureLocalServiceUtil.getService());
        setClass(Temperature.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("temperatureId");
    }
}
