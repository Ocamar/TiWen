package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.SystemParameter;

import com.surwing.service.SystemParameterLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class SystemParameterActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SystemParameterActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SystemParameterLocalServiceUtil.getService());
        setClass(SystemParameter.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("systemParameterId");
    }
}
