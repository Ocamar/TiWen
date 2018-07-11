package com.surwing.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.surwing.NoSuchNodeException;

import com.surwing.model.Node;
import com.surwing.model.impl.NodeImpl;
import com.surwing.model.impl.NodeModelImpl;

import com.surwing.service.persistence.NodePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the node service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see NodePersistence
 * @see NodeUtil
 * @generated
 */
public class NodePersistenceImpl extends BasePersistenceImpl<Node>
    implements NodePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NodeUtil} to access the node persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NodeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, NodeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, NodeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_NODENO = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, NodeImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByNodeNo",
            new String[] { String.class.getName() },
            NodeModelImpl.NODENO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NODENO = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNodeNo",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NODENO_NODENO_1 = "node.nodeNo IS NULL";
    private static final String _FINDER_COLUMN_NODENO_NODENO_2 = "node.nodeNo = ?";
    private static final String _FINDER_COLUMN_NODENO_NODENO_3 = "(node.nodeNo IS NULL OR node.nodeNo = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID =
        new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, NodeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocationId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID =
        new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, NodeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocationId",
            new String[] { Long.class.getName() },
            NodeModelImpl.LOCATIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONID = new FinderPath(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocationId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_LOCATIONID_LOCATIONID_2 = "node.locationId = ?";
    private static final String _SQL_SELECT_NODE = "SELECT node FROM Node node";
    private static final String _SQL_SELECT_NODE_WHERE = "SELECT node FROM Node node WHERE ";
    private static final String _SQL_COUNT_NODE = "SELECT COUNT(node) FROM Node node";
    private static final String _SQL_COUNT_NODE_WHERE = "SELECT COUNT(node) FROM Node node WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "node.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Node exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Node exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NodePersistenceImpl.class);
    private static Node _nullNode = new NodeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Node> toCacheModel() {
                return _nullNodeCacheModel;
            }
        };

    private static CacheModel<Node> _nullNodeCacheModel = new CacheModel<Node>() {
            @Override
            public Node toEntityModel() {
                return _nullNode;
            }
        };

    public NodePersistenceImpl() {
        setModelClass(Node.class);
    }

    /**
     * Returns the node where nodeNo = &#63; or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
     *
     * @param nodeNo the node no
     * @return the matching node
     * @throws com.surwing.NoSuchNodeException if a matching node could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node findByNodeNo(String nodeNo)
        throws NoSuchNodeException, SystemException {
        Node node = fetchByNodeNo(nodeNo);

        if (node == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("nodeNo=");
            msg.append(nodeNo);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchNodeException(msg.toString());
        }

        return node;
    }

    /**
     * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param nodeNo the node no
     * @return the matching node, or <code>null</code> if a matching node could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByNodeNo(String nodeNo) throws SystemException {
        return fetchByNodeNo(nodeNo, true);
    }

    /**
     * Returns the node where nodeNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param nodeNo the node no
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching node, or <code>null</code> if a matching node could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByNodeNo(String nodeNo, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { nodeNo };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_NODENO,
                    finderArgs, this);
        }

        if (result instanceof Node) {
            Node node = (Node) result;

            if (!Validator.equals(nodeNo, node.getNodeNo())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_NODE_WHERE);

            boolean bindNodeNo = false;

            if (nodeNo == null) {
                query.append(_FINDER_COLUMN_NODENO_NODENO_1);
            } else if (nodeNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NODENO_NODENO_3);
            } else {
                bindNodeNo = true;

                query.append(_FINDER_COLUMN_NODENO_NODENO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNodeNo) {
                    qPos.add(nodeNo);
                }

                List<Node> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NODENO,
                        finderArgs, list);
                } else {
                    Node node = list.get(0);

                    result = node;

                    cacheResult(node);

                    if ((node.getNodeNo() == null) ||
                            !node.getNodeNo().equals(nodeNo)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NODENO,
                            finderArgs, node);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NODENO,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Node) result;
        }
    }

    /**
     * Removes the node where nodeNo = &#63; from the database.
     *
     * @param nodeNo the node no
     * @return the node that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node removeByNodeNo(String nodeNo)
        throws NoSuchNodeException, SystemException {
        Node node = findByNodeNo(nodeNo);

        return remove(node);
    }

    /**
     * Returns the number of nodes where nodeNo = &#63;.
     *
     * @param nodeNo the node no
     * @return the number of matching nodes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNodeNo(String nodeNo) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NODENO;

        Object[] finderArgs = new Object[] { nodeNo };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NODE_WHERE);

            boolean bindNodeNo = false;

            if (nodeNo == null) {
                query.append(_FINDER_COLUMN_NODENO_NODENO_1);
            } else if (nodeNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NODENO_NODENO_3);
            } else {
                bindNodeNo = true;

                query.append(_FINDER_COLUMN_NODENO_NODENO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNodeNo) {
                    qPos.add(nodeNo);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the nodes where locationId = &#63;.
     *
     * @param locationId the location ID
     * @return the matching nodes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Node> findByLocationId(long locationId)
        throws SystemException {
        return findByLocationId(locationId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Node> findByLocationId(long locationId, int start, int end)
        throws SystemException {
        return findByLocationId(locationId, start, end, null);
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
    @Override
    public List<Node> findByLocationId(long locationId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID;
            finderArgs = new Object[] { locationId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID;
            finderArgs = new Object[] { locationId, start, end, orderByComparator };
        }

        List<Node> list = (List<Node>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Node node : list) {
                if ((locationId != node.getLocationId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_NODE_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NodeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (!pagination) {
                    list = (List<Node>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Node>(list);
                } else {
                    list = (List<Node>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Node findByLocationId_First(long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchNodeException, SystemException {
        Node node = fetchByLocationId_First(locationId, orderByComparator);

        if (node != null) {
            return node;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("locationId=");
        msg.append(locationId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNodeException(msg.toString());
    }

    /**
     * Returns the first node in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching node, or <code>null</code> if a matching node could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByLocationId_First(long locationId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Node> list = findByLocationId(locationId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Node findByLocationId_Last(long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchNodeException, SystemException {
        Node node = fetchByLocationId_Last(locationId, orderByComparator);

        if (node != null) {
            return node;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("locationId=");
        msg.append(locationId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNodeException(msg.toString());
    }

    /**
     * Returns the last node in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching node, or <code>null</code> if a matching node could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByLocationId_Last(long locationId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByLocationId(locationId);

        if (count == 0) {
            return null;
        }

        List<Node> list = findByLocationId(locationId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Node[] findByLocationId_PrevAndNext(long nodeId, long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchNodeException, SystemException {
        Node node = findByPrimaryKey(nodeId);

        Session session = null;

        try {
            session = openSession();

            Node[] array = new NodeImpl[3];

            array[0] = getByLocationId_PrevAndNext(session, node, locationId,
                    orderByComparator, true);

            array[1] = node;

            array[2] = getByLocationId_PrevAndNext(session, node, locationId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Node getByLocationId_PrevAndNext(Session session, Node node,
        long locationId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NODE_WHERE);

        query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(NodeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(locationId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(node);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Node> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the nodes where locationId = &#63; from the database.
     *
     * @param locationId the location ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByLocationId(long locationId) throws SystemException {
        for (Node node : findByLocationId(locationId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(node);
        }
    }

    /**
     * Returns the number of nodes where locationId = &#63;.
     *
     * @param locationId the location ID
     * @return the number of matching nodes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByLocationId(long locationId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONID;

        Object[] finderArgs = new Object[] { locationId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NODE_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the node in the entity cache if it is enabled.
     *
     * @param node the node
     */
    @Override
    public void cacheResult(Node node) {
        EntityCacheUtil.putResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeImpl.class, node.getPrimaryKey(), node);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NODENO,
            new Object[] { node.getNodeNo() }, node);

        node.resetOriginalValues();
    }

    /**
     * Caches the nodes in the entity cache if it is enabled.
     *
     * @param nodes the nodes
     */
    @Override
    public void cacheResult(List<Node> nodes) {
        for (Node node : nodes) {
            if (EntityCacheUtil.getResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
                        NodeImpl.class, node.getPrimaryKey()) == null) {
                cacheResult(node);
            } else {
                node.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all nodes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NodeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NodeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the node.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Node node) {
        EntityCacheUtil.removeResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeImpl.class, node.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(node);
    }

    @Override
    public void clearCache(List<Node> nodes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Node node : nodes) {
            EntityCacheUtil.removeResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
                NodeImpl.class, node.getPrimaryKey());

            clearUniqueFindersCache(node);
        }
    }

    protected void cacheUniqueFindersCache(Node node) {
        if (node.isNew()) {
            Object[] args = new Object[] { node.getNodeNo() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NODENO, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NODENO, args, node);
        } else {
            NodeModelImpl nodeModelImpl = (NodeModelImpl) node;

            if ((nodeModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_NODENO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { node.getNodeNo() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NODENO, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NODENO, args,
                    node);
            }
        }
    }

    protected void clearUniqueFindersCache(Node node) {
        NodeModelImpl nodeModelImpl = (NodeModelImpl) node;

        Object[] args = new Object[] { node.getNodeNo() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NODENO, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NODENO, args);

        if ((nodeModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_NODENO.getColumnBitmask()) != 0) {
            args = new Object[] { nodeModelImpl.getOriginalNodeNo() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NODENO, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NODENO, args);
        }
    }

    /**
     * Creates a new node with the primary key. Does not add the node to the database.
     *
     * @param nodeId the primary key for the new node
     * @return the new node
     */
    @Override
    public Node create(long nodeId) {
        Node node = new NodeImpl();

        node.setNew(true);
        node.setPrimaryKey(nodeId);

        return node;
    }

    /**
     * Removes the node with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param nodeId the primary key of the node
     * @return the node that was removed
     * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node remove(long nodeId) throws NoSuchNodeException, SystemException {
        return remove((Serializable) nodeId);
    }

    /**
     * Removes the node with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the node
     * @return the node that was removed
     * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node remove(Serializable primaryKey)
        throws NoSuchNodeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Node node = (Node) session.get(NodeImpl.class, primaryKey);

            if (node == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNodeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(node);
        } catch (NoSuchNodeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Node removeImpl(Node node) throws SystemException {
        node = toUnwrappedModel(node);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(node)) {
                node = (Node) session.get(NodeImpl.class,
                        node.getPrimaryKeyObj());
            }

            if (node != null) {
                session.delete(node);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (node != null) {
            clearCache(node);
        }

        return node;
    }

    @Override
    public Node updateImpl(com.surwing.model.Node node)
        throws SystemException {
        node = toUnwrappedModel(node);

        boolean isNew = node.isNew();

        NodeModelImpl nodeModelImpl = (NodeModelImpl) node;

        Session session = null;

        try {
            session = openSession();

            if (node.isNew()) {
                session.save(node);

                node.setNew(false);
            } else {
                session.merge(node);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !NodeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((nodeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        nodeModelImpl.getOriginalLocationId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
                    args);

                args = new Object[] { nodeModelImpl.getLocationId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
            NodeImpl.class, node.getPrimaryKey(), node);

        clearUniqueFindersCache(node);
        cacheUniqueFindersCache(node);

        return node;
    }

    protected Node toUnwrappedModel(Node node) {
        if (node instanceof NodeImpl) {
            return node;
        }

        NodeImpl nodeImpl = new NodeImpl();

        nodeImpl.setNew(node.isNew());
        nodeImpl.setPrimaryKey(node.getPrimaryKey());

        nodeImpl.setNodeId(node.getNodeId());
        nodeImpl.setCompanyId(node.getCompanyId());
        nodeImpl.setGroupId(node.getGroupId());
        nodeImpl.setNodeNo(node.getNodeNo());
        nodeImpl.setLocationId(node.getLocationId());
        nodeImpl.setNodeType(node.getNodeType());
        nodeImpl.setIp(node.getIp());
        nodeImpl.setLastReceivedTime(node.getLastReceivedTime());
        nodeImpl.setLastTransmitTime(node.getLastTransmitTime());
        nodeImpl.setStatus(node.getStatus());
        nodeImpl.setCreateDate(node.getCreateDate());
        nodeImpl.setModifiedDate(node.getModifiedDate());

        return nodeImpl;
    }

    /**
     * Returns the node with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the node
     * @return the node
     * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNodeException, SystemException {
        Node node = fetchByPrimaryKey(primaryKey);

        if (node == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNodeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return node;
    }

    /**
     * Returns the node with the primary key or throws a {@link com.surwing.NoSuchNodeException} if it could not be found.
     *
     * @param nodeId the primary key of the node
     * @return the node
     * @throws com.surwing.NoSuchNodeException if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node findByPrimaryKey(long nodeId)
        throws NoSuchNodeException, SystemException {
        return findByPrimaryKey((Serializable) nodeId);
    }

    /**
     * Returns the node with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the node
     * @return the node, or <code>null</code> if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Node node = (Node) EntityCacheUtil.getResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
                NodeImpl.class, primaryKey);

        if (node == _nullNode) {
            return null;
        }

        if (node == null) {
            Session session = null;

            try {
                session = openSession();

                node = (Node) session.get(NodeImpl.class, primaryKey);

                if (node != null) {
                    cacheResult(node);
                } else {
                    EntityCacheUtil.putResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
                        NodeImpl.class, primaryKey, _nullNode);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NodeModelImpl.ENTITY_CACHE_ENABLED,
                    NodeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return node;
    }

    /**
     * Returns the node with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param nodeId the primary key of the node
     * @return the node, or <code>null</code> if a node with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Node fetchByPrimaryKey(long nodeId) throws SystemException {
        return fetchByPrimaryKey((Serializable) nodeId);
    }

    /**
     * Returns all the nodes.
     *
     * @return the nodes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Node> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Node> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Node> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Node> list = (List<Node>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NODE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NODE;

                if (pagination) {
                    sql = sql.concat(NodeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Node>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Node>(list);
                } else {
                    list = (List<Node>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the nodes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Node node : findAll()) {
            remove(node);
        }
    }

    /**
     * Returns the number of nodes.
     *
     * @return the number of nodes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_NODE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the node persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.Node")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Node>> listenersList = new ArrayList<ModelListener<Node>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Node>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NodeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
