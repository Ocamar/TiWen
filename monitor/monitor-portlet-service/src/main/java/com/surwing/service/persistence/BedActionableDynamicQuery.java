package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Bed;

import com.surwing.service.BedLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class BedActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BedActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BedLocalServiceUtil.getService());
        setClass(Bed.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bedId");
    }
}
