package com.surwing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Node. This utility wraps
 * {@link com.surwing.service.impl.NodeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author zhaiyz
 * @see NodeLocalService
 * @see com.surwing.service.base.NodeLocalServiceBaseImpl
 * @see com.surwing.service.impl.NodeLocalServiceImpl
 * @generated
 */
public class NodeLocalServiceUtil {
    private static NodeLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.surwing.service.impl.NodeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the node to the database. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node addNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addNode(node);
    }

    /**
    * Creates a new node with the primary key. Does not add the node to the database.
    *
    * @param nodeId the primary key for the new node
    * @return the new node
    */
    public static com.surwing.model.Node createNode(long nodeId) {
        return getService().createNode(nodeId);
    }

    /**
    * Deletes the node with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param nodeId the primary key of the node
    * @return the node that was removed
    * @throws PortalException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node deleteNode(long nodeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNode(nodeId);
    }

    /**
    * Deletes the node from the database. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node deleteNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNode(node);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.surwing.model.Node fetchNode(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchNode(nodeId);
    }

    /**
    * Returns the node with the primary key.
    *
    * @param nodeId the primary key of the node
    * @return the node
    * @throws PortalException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node getNode(long nodeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getNode(nodeId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.surwing.model.Node> getNodes(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNodes(start, end);
    }

    /**
    * Returns the number of nodes.
    *
    * @return the number of nodes
    * @throws SystemException if a system exception occurred
    */
    public static int getNodesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNodesCount();
    }

    /**
    * Updates the node in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param node the node
    * @return the node that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node updateNode(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateNode(node);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.surwing.model.Node addNode(long locationId, int nodeType,
        java.lang.String nodeNo, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.MonitorException {
        return getService()
                   .addNode(locationId, nodeType, nodeNo, companyId, groupId);
    }

    public static int countNodesByDisplayTerms(
        com.surwing.search.NodeDisplayTerms displayTerms, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .countNodesByDisplayTerms(displayTerms, companyId, groupId);
    }

    public static java.util.List<com.surwing.model.Node> findNodesByDisplayTerms(
        com.surwing.search.NodeDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findNodesByDisplayTerms(displayTerms, obc, start, end,
            companyId, groupId);
    }

    public static com.surwing.model.Node updateNodeInfo(
        com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.MonitorException {
        return getService().updateNodeInfo(node);
    }

    public static com.surwing.model.Node fetchByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchByNodeNo(nodeNo);
    }

    public static void updateNodeStatusToTimeout()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().updateNodeStatusToTimeout();
    }

    public static void clearService() {
        _service = null;
    }

    public static NodeLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    NodeLocalService.class.getName());

            if (invokableLocalService instanceof NodeLocalService) {
                _service = (NodeLocalService) invokableLocalService;
            } else {
                _service = new NodeLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(NodeLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(NodeLocalService service) {
    }
}
