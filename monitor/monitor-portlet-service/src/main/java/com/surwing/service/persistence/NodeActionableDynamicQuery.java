package com.surwing.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Node;

import com.surwing.service.NodeLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class NodeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NodeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NodeLocalServiceUtil.getService());
        setClass(Node.class);

        setClassLoader(com.surwing.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("nodeId");
    }
}
