package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.UserInfo;

import com.surwing.service.UserInfoLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class UserInfoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserInfoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserInfoLocalServiceUtil.getService());
        setClass(UserInfo.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}
