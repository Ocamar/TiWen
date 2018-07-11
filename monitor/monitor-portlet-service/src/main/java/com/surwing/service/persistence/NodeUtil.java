package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Node;

import java.util.List;

/**
 * The persistence utility for the node service. This utility wraps {@link NodePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see NodePersistence
 * @see NodePersistenceImpl
 * @generated
 */
public class NodeUtil {
    private static NodePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Node node) {
        getPersistence().clearCache(node);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Node> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Node> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Node> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Node update(Node node) throws SystemException {
        return getPersistence().update(node);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Node update(Node node, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(node, serviceContext);
    }

    /**
    * Returns the node where nodeNo = &#63; or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
    *
    * @param nodeNo the node no
    * @return the matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node findByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence().findByNodeNo(nodeNo);
    }

    /**
    * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param nodeNo the node no
    * @return the matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node fetchByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNodeNo(nodeNo);
    }

    /**
    * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param nodeNo the node no
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node fetchByNodeNo(
        java.lang.String nodeNo, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNodeNo(nodeNo, retrieveFromCache);
    }

    /**
    * Removes the node where nodeNo = &#63; from the database.
    *
    * @param nodeNo the node no
    * @return the node that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node removeByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence().removeByNodeNo(nodeNo);
    }

    /**
    * Returns the number of nodes where nodeNo = &#63;.
    *
    * @param nodeNo the node no
    * @return the number of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public static int countByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNodeNo(nodeNo);
    }

    /**
    * Returns all the nodes where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the matching nodes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByLocationId(locationId);
    }

    /**
    * Returns a range of all the nodes where locationId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param locationId the location ID
    * @param start the lower bound of the range of nodes
    * @param end the upper bound of the range of nodes (not inclusive)
    * @return the range of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByLocationId(locationId, start, end);
    }

    /**
    * Returns an ordered range of all the nodes where locationId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param locationId the location ID
    * @param start the lower bound of the range of nodes
    * @param end the upper bound of the range of nodes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByLocationId(locationId, start, end, orderByComparator);
    }

    /**
    * Returns the first node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node findByLocationId_First(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence()
                   .findByLocationId_First(locationId, orderByComparator);
    }

    /**
    * Returns the first node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node fetchByLocationId_First(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationId_First(locationId, orderByComparator);
    }

    /**
    * Returns the last node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node findByLocationId_Last(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence()
                   .findByLocationId_Last(locationId, orderByComparator);
    }

    /**
    * Returns the last node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node fetchByLocationId_Last(
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByLocationId_Last(locationId, orderByComparator);
    }

    /**
    * Returns the nodes before and after the current node in the ordered set where locationId = &#63;.
    *
    * @param nodeId the primary key of the current node
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next node
    * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node[] findByLocationId_PrevAndNext(
        long nodeId, long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence()
                   .findByLocationId_PrevAndNext(nodeId, locationId,
            orderByComparator);
    }

    /**
    * Removes all the nodes where locationId = &#63; from the database.
    *
    * @param locationId the location ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByLocationId(locationId);
    }

    /**
    * Returns the number of nodes where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the number of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public static int countByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByLocationId(locationId);
    }

    /**
    * Caches the node in the entity cache if it is enabled.
    *
    * @param node the node
    */
    public static void cacheResult(com.surwing.model.Node node) {
        getPersistence().cacheResult(node);
    }

    /**
    * Caches the nodes in the entity cache if it is enabled.
    *
    * @param nodes the nodes
    */
    public static void cacheResult(java.util.List<com.surwing.model.Node> nodes) {
        getPersistence().cacheResult(nodes);
    }

    /**
    * Creates a new node with the primary key. Does not add the node to the database.
    *
    * @param nodeId the primary key for the new node
    * @return the new node
    */
    public static com.surwing.model.Node create(long nodeId) {
        return getPersistence().create(nodeId);
    }

    /**
    * Removes the node with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param nodeId the primary key of the node
    * @return the node that was removed
    * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node remove(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence().remove(nodeId);
    }

    public static com.surwing.model.Node updateImpl(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(node);
    }

    /**
    * Returns the node with the primary key or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
    *
    * @param nodeId the primary key of the node
    * @return the node
    * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node findByPrimaryKey(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException {
        return getPersistence().findByPrimaryKey(nodeId);
    }

    /**
    * Returns the node with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param nodeId the primary key of the node
    * @return the node, or <code>null</code> if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Node fetchByPrimaryKey(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(nodeId);
    }

    /**
    * Returns all the nodes.
    *
    * @return the nodes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Node> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.surwing.model.Node> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the nodes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.NodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of nodes
    * @param end the upper bound of the range of nodes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of nodes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Node> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the nodes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of nodes.
    *
    * @return the number of nodes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static NodePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (NodePersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    NodePersistence.class.getName());

            ReferenceRegistry.registerReference(NodeUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(NodePersistence persistence) {
    }
}
