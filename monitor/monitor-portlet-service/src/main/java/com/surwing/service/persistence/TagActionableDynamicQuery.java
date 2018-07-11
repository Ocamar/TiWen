package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Tag;

import com.surwing.service.TagLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class TagActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TagActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TagLocalServiceUtil.getService());
        setClass(Tag.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("tagId");
    }
}
