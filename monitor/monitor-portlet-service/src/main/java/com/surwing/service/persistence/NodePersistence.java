package com.surwing.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.surwing.model.Node;

/**
 * The persistence interface for the node service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see NodePersistenceImpl
 * @see NodeUtil
 * @generated
 */
public interface NodePersistence extends BasePersistence<Node> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link NodeUtil} to access the node persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the node where nodeNo = &#63; or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
    *
    * @param nodeNo the node no
    * @return the matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node findByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param nodeNo the node no
    * @return the matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node fetchByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param nodeNo the node no
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node fetchByNodeNo(java.lang.String nodeNo,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the node where nodeNo = &#63; from the database.
    *
    * @param nodeNo the node no
    * @return the node that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node removeByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Returns the number of nodes where nodeNo = &#63;.
    *
    * @param nodeNo the node no
    * @return the number of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public int countByNodeNo(java.lang.String nodeNo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the nodes where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the matching nodes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Node> findByLocationId(
        long locationId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node findByLocationId_First(long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Returns the first node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node fetchByLocationId_First(long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching node
    * @throws com.surwing.NoSuchNodeException if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node findByLocationId_Last(long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Returns the last node in the ordered set where locationId = &#63;.
    *
    * @param locationId the location ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching node, or <code>null</code> if a matching node could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node fetchByLocationId_Last(long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.surwing.model.Node[] findByLocationId_PrevAndNext(long nodeId,
        long locationId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Removes all the nodes where locationId = &#63; from the database.
    *
    * @param locationId the location ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of nodes where locationId = &#63;.
    *
    * @param locationId the location ID
    * @return the number of matching nodes
    * @throws SystemException if a system exception occurred
    */
    public int countByLocationId(long locationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the node in the entity cache if it is enabled.
    *
    * @param node the node
    */
    public void cacheResult(com.surwing.model.Node node);

    /**
    * Caches the nodes in the entity cache if it is enabled.
    *
    * @param nodes the nodes
    */
    public void cacheResult(java.util.List<com.surwing.model.Node> nodes);

    /**
    * Creates a new node with the primary key. Does not add the node to the database.
    *
    * @param nodeId the primary key for the new node
    * @return the new node
    */
    public com.surwing.model.Node create(long nodeId);

    /**
    * Removes the node with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param nodeId the primary key of the node
    * @return the node that was removed
    * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node remove(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    public com.surwing.model.Node updateImpl(com.surwing.model.Node node)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the node with the primary key or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
    *
    * @param nodeId the primary key of the node
    * @return the node
    * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node findByPrimaryKey(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchNodeException;

    /**
    * Returns the node with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param nodeId the primary key of the node
    * @return the node, or <code>null</code> if a node with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Node fetchByPrimaryKey(long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the nodes.
    *
    * @return the nodes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Node> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Node> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Node> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the nodes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of nodes.
    *
    * @return the number of nodes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
