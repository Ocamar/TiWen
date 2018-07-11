package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NodeLocalService}.
 *
 * @author zhaiyz
 * @see NodeLocalService
 * @generated
 */
public class NodeLocalServiceWrapper implements NodeLocalService,
    ServiceWrapper<NodeLocalService> {
    private NodeLocalService _nodeLocalService;

    public NodeLocalServiceWrapper(NodeLocalService nodeLocalService) {
        _nodeLocalService = nodeLocalService;
    }

    /**
    * Adds the node to the database. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Node addNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.addNode(node);
    }

    /**
    * Creates a new node with the primary key. Does not add the node to the database.
    *
    * @param nodeId the primary key for the new node
    * @return the new node
    */
    @Override
    public com.surwing.model.Node createNode(long nodeId) {
        return _nodeLocalService.createNode(nodeId);
    }

    /**
    * Deletes the node with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param nodeId the primary key of the node
    * @return the node that was removed
    * @throws PortalException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Node deleteNode(long nodeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.deleteNode(nodeId);
    }

    /**
    * Deletes the node from the database. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Node deleteNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.deleteNode(node);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _nodeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.surwing.model.Node fetchNode(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.fetchNode(nodeId);
    }

    /**
    * Returns the node with the primary key.
    *
    * @param nodeId the primary key of the node
    * @return the node
    * @throws PortalException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Node getNode(long nodeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.getNode(nodeId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the nodes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of nodes
    * @param end the upper bound of the range of nodes (not inclusive)
    * @return the range of nodes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.surwing.model.Node> getNodes(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.getNodes(start, end);
    }

    /**
    * Returns the number of nodes.
    *
    * @return the number of nodes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getNodesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.getNodesCount();
    }

    /**
    * Updates the node in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Node updateNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.updateNode(node);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _nodeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _nodeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _nodeLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.surwing.model.Node addNode(long locationId, int nodeType,
        java.lang.String nodeNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.MonitorException {
        return _nodeLocalService.addNode(locationId, nodeType, nodeNo,
            companyId, groupId);
    }

    @Override
    public int countNodesByDisplayTerms(
        com.surwing.search.NodeDisplayTerms displayTerms, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.countNodesByDisplayTerms(displayTerms,
            companyId, groupId);
    }

    @Override
    public java.util.List<com.surwing.model.Node> findNodesByDisplayTerms(
        com.surwing.search.NodeDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.findNodesByDisplayTerms(displayTerms, obc,
            start, end, companyId, groupId);
    }

    @Override
    public com.surwing.model.Node updateNodeInfo(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.MonitorException {
        return _nodeLocalService.updateNodeInfo(node);
    }

    @Override
    public com.surwing.model.Node fetchByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _nodeLocalService.fetchByNodeNo(nodeNo);
    }

    @Override
    public void updateNodeStatusToTimeout()
        throws com.liferay.portal.kernel.exception.SystemException {
        _nodeLocalService.updateNodeStatusToTimeout();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NodeLocalService getWrappedNodeLocalService() {
        return _nodeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNodeLocalService(NodeLocalService nodeLocalService) {
        _nodeLocalService = nodeLocalService;
    }

    @Override
    public NodeLocalService getWrappedService() {
        return _nodeLocalService;
    }

    @Override
    public void setWrappedService(NodeLocalService nodeLocalService) {
        _nodeLocalService = nodeLocalService;
    }
}
