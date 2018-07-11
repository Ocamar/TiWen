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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.surwing.NoSuchBedException;

import com.surwing.model.Bed;
import com.surwing.model.impl.BedImpl;
import com.surwing.model.impl.BedModelImpl;

import com.surwing.service.persistence.BedPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bed service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see BedPersistence
 * @see BedUtil
 * @generated
 */
public class BedPersistenceImpl extends BasePersistenceImpl<Bed>
    implements BedPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BedUtil} to access the bed persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BedImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, BedImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, BedImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID =
        new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, BedImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocationId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID =
        new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, BedImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocationId",
            new String[] { Long.class.getName() },
            BedModelImpl.LOCATIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONID = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocationId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_LOCATIONID_LOCATIONID_2 = "bed.locationId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, BedImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByLocationIdAndBedNo",
            new String[] { Long.class.getName(), String.class.getName() },
            BedModelImpl.LOCATIONID_COLUMN_BITMASK |
            BedModelImpl.BEDNO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO = new FinderPath(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByLocationIdAndBedNo",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_LOCATIONIDANDBEDNO_LOCATIONID_2 = "bed.locationId = ? AND ";
    private static final String _FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_1 = "bed.bedNo IS NULL";
    private static final String _FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_2 = "bed.bedNo = ?";
    private static final String _FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_3 = "(bed.bedNo IS NULL OR bed.bedNo = '')";
    private static final String _SQL_SELECT_BED = "SELECT bed FROM Bed bed";
    private static final String _SQL_SELECT_BED_WHERE = "SELECT bed FROM Bed bed WHERE ";
    private static final String _SQL_COUNT_BED = "SELECT COUNT(bed) FROM Bed bed";
    private static final String _SQL_COUNT_BED_WHERE = "SELECT COUNT(bed) FROM Bed bed WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bed.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bed exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Bed exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BedPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "alias"
            });
    private static Bed _nullBed = new BedImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Bed> toCacheModel() {
                return _nullBedCacheModel;
            }
        };

    private static CacheModel<Bed> _nullBedCacheModel = new CacheModel<Bed>() {
            @Override
            public Bed toEntityModel() {
                return _nullBed;
            }
        };

    public BedPersistenceImpl() {
        setModelClass(Bed.class);
    }

    /**
     * Returns all the beds where locationId = &#63;.
     *
     * @param locationId the location ID
     * @return the matching beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findByLocationId(long locationId)
        throws SystemException {
        return findByLocationId(locationId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the beds where locationId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param locationId the location ID
     * @param start the lower bound of the range of beds
     * @param end the upper bound of the range of beds (not inclusive)
     * @return the range of matching beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findByLocationId(long locationId, int start, int end)
        throws SystemException {
        return findByLocationId(locationId, start, end, null);
    }

    /**
     * Returns an ordered range of all the beds where locationId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param locationId the location ID
     * @param start the lower bound of the range of beds
     * @param end the upper bound of the range of beds (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findByLocationId(long locationId, int start, int end,
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

        List<Bed> list = (List<Bed>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Bed bed : list) {
                if ((locationId != bed.getLocationId())) {
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

            query.append(_SQL_SELECT_BED_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BedModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (!pagination) {
                    list = (List<Bed>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bed>(list);
                } else {
                    list = (List<Bed>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first bed in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bed
     * @throws com.surwing.NoSuchBedException if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed findByLocationId_First(long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchBedException, SystemException {
        Bed bed = fetchByLocationId_First(locationId, orderByComparator);

        if (bed != null) {
            return bed;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("locationId=");
        msg.append(locationId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBedException(msg.toString());
    }

    /**
     * Returns the first bed in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bed, or <code>null</code> if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByLocationId_First(long locationId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Bed> list = findByLocationId(locationId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bed in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bed
     * @throws com.surwing.NoSuchBedException if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed findByLocationId_Last(long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchBedException, SystemException {
        Bed bed = fetchByLocationId_Last(locationId, orderByComparator);

        if (bed != null) {
            return bed;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("locationId=");
        msg.append(locationId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBedException(msg.toString());
    }

    /**
     * Returns the last bed in the ordered set where locationId = &#63;.
     *
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bed, or <code>null</code> if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByLocationId_Last(long locationId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByLocationId(locationId);

        if (count == 0) {
            return null;
        }

        List<Bed> list = findByLocationId(locationId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the beds before and after the current bed in the ordered set where locationId = &#63;.
     *
     * @param bedId the primary key of the current bed
     * @param locationId the location ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bed
     * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed[] findByLocationId_PrevAndNext(long bedId, long locationId,
        OrderByComparator orderByComparator)
        throws NoSuchBedException, SystemException {
        Bed bed = findByPrimaryKey(bedId);

        Session session = null;

        try {
            session = openSession();

            Bed[] array = new BedImpl[3];

            array[0] = getByLocationId_PrevAndNext(session, bed, locationId,
                    orderByComparator, true);

            array[1] = bed;

            array[2] = getByLocationId_PrevAndNext(session, bed, locationId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Bed getByLocationId_PrevAndNext(Session session, Bed bed,
        long locationId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BED_WHERE);

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
            query.append(BedModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(locationId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bed);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Bed> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the beds where locationId = &#63; from the database.
     *
     * @param locationId the location ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByLocationId(long locationId) throws SystemException {
        for (Bed bed : findByLocationId(locationId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(bed);
        }
    }

    /**
     * Returns the number of beds where locationId = &#63;.
     *
     * @param locationId the location ID
     * @return the number of matching beds
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

            query.append(_SQL_COUNT_BED_WHERE);

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
     * Returns the bed where locationId = &#63; and bedNo = &#63; or throws a {@link com.surwing.NoSuchBedException} if it could not be found.
     *
     * @param locationId the location ID
     * @param bedNo the bed no
     * @return the matching bed
     * @throws com.surwing.NoSuchBedException if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed findByLocationIdAndBedNo(long locationId, String bedNo)
        throws NoSuchBedException, SystemException {
        Bed bed = fetchByLocationIdAndBedNo(locationId, bedNo);

        if (bed == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("locationId=");
            msg.append(locationId);

            msg.append(", bedNo=");
            msg.append(bedNo);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchBedException(msg.toString());
        }

        return bed;
    }

    /**
     * Returns the bed where locationId = &#63; and bedNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param locationId the location ID
     * @param bedNo the bed no
     * @return the matching bed, or <code>null</code> if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByLocationIdAndBedNo(long locationId, String bedNo)
        throws SystemException {
        return fetchByLocationIdAndBedNo(locationId, bedNo, true);
    }

    /**
     * Returns the bed where locationId = &#63; and bedNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param locationId the location ID
     * @param bedNo the bed no
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching bed, or <code>null</code> if a matching bed could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByLocationIdAndBedNo(long locationId, String bedNo,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { locationId, bedNo };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                    finderArgs, this);
        }

        if (result instanceof Bed) {
            Bed bed = (Bed) result;

            if ((locationId != bed.getLocationId()) ||
                    !Validator.equals(bedNo, bed.getBedNo())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_BED_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_LOCATIONID_2);

            boolean bindBedNo = false;

            if (bedNo == null) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_1);
            } else if (bedNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_3);
            } else {
                bindBedNo = true;

                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (bindBedNo) {
                    qPos.add(bedNo);
                }

                List<Bed> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "BedPersistenceImpl.fetchByLocationIdAndBedNo(long, String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Bed bed = list.get(0);

                    result = bed;

                    cacheResult(bed);

                    if ((bed.getLocationId() != locationId) ||
                            (bed.getBedNo() == null) ||
                            !bed.getBedNo().equals(bedNo)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                            finderArgs, bed);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Bed) result;
        }
    }

    /**
     * Removes the bed where locationId = &#63; and bedNo = &#63; from the database.
     *
     * @param locationId the location ID
     * @param bedNo the bed no
     * @return the bed that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed removeByLocationIdAndBedNo(long locationId, String bedNo)
        throws NoSuchBedException, SystemException {
        Bed bed = findByLocationIdAndBedNo(locationId, bedNo);

        return remove(bed);
    }

    /**
     * Returns the number of beds where locationId = &#63; and bedNo = &#63;.
     *
     * @param locationId the location ID
     * @param bedNo the bed no
     * @return the number of matching beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByLocationIdAndBedNo(long locationId, String bedNo)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO;

        Object[] finderArgs = new Object[] { locationId, bedNo };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BED_WHERE);

            query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_LOCATIONID_2);

            boolean bindBedNo = false;

            if (bedNo == null) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_1);
            } else if (bedNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_3);
            } else {
                bindBedNo = true;

                query.append(_FINDER_COLUMN_LOCATIONIDANDBEDNO_BEDNO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(locationId);

                if (bindBedNo) {
                    qPos.add(bedNo);
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
     * Caches the bed in the entity cache if it is enabled.
     *
     * @param bed the bed
     */
    @Override
    public void cacheResult(Bed bed) {
        EntityCacheUtil.putResult(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedImpl.class, bed.getPrimaryKey(), bed);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
            new Object[] { bed.getLocationId(), bed.getBedNo() }, bed);

        bed.resetOriginalValues();
    }

    /**
     * Caches the beds in the entity cache if it is enabled.
     *
     * @param beds the beds
     */
    @Override
    public void cacheResult(List<Bed> beds) {
        for (Bed bed : beds) {
            if (EntityCacheUtil.getResult(BedModelImpl.ENTITY_CACHE_ENABLED,
                        BedImpl.class, bed.getPrimaryKey()) == null) {
                cacheResult(bed);
            } else {
                bed.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all beds.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BedImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BedImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bed.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Bed bed) {
        EntityCacheUtil.removeResult(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedImpl.class, bed.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(bed);
    }

    @Override
    public void clearCache(List<Bed> beds) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Bed bed : beds) {
            EntityCacheUtil.removeResult(BedModelImpl.ENTITY_CACHE_ENABLED,
                BedImpl.class, bed.getPrimaryKey());

            clearUniqueFindersCache(bed);
        }
    }

    protected void cacheUniqueFindersCache(Bed bed) {
        if (bed.isNew()) {
            Object[] args = new Object[] { bed.getLocationId(), bed.getBedNo() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                args, bed);
        } else {
            BedModelImpl bedModelImpl = (BedModelImpl) bed;

            if ((bedModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { bed.getLocationId(), bed.getBedNo() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                    args, bed);
            }
        }
    }

    protected void clearUniqueFindersCache(Bed bed) {
        BedModelImpl bedModelImpl = (BedModelImpl) bed;

        Object[] args = new Object[] { bed.getLocationId(), bed.getBedNo() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
            args);

        if ((bedModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO.getColumnBitmask()) != 0) {
            args = new Object[] {
                    bedModelImpl.getOriginalLocationId(),
                    bedModelImpl.getOriginalBedNo()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDBEDNO,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LOCATIONIDANDBEDNO,
                args);
        }
    }

    /**
     * Creates a new bed with the primary key. Does not add the bed to the database.
     *
     * @param bedId the primary key for the new bed
     * @return the new bed
     */
    @Override
    public Bed create(long bedId) {
        Bed bed = new BedImpl();

        bed.setNew(true);
        bed.setPrimaryKey(bedId);

        return bed;
    }

    /**
     * Removes the bed with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bedId the primary key of the bed
     * @return the bed that was removed
     * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed remove(long bedId) throws NoSuchBedException, SystemException {
        return remove((Serializable) bedId);
    }

    /**
     * Removes the bed with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bed
     * @return the bed that was removed
     * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed remove(Serializable primaryKey)
        throws NoSuchBedException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Bed bed = (Bed) session.get(BedImpl.class, primaryKey);

            if (bed == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bed);
        } catch (NoSuchBedException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Bed removeImpl(Bed bed) throws SystemException {
        bed = toUnwrappedModel(bed);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bed)) {
                bed = (Bed) session.get(BedImpl.class, bed.getPrimaryKeyObj());
            }

            if (bed != null) {
                session.delete(bed);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bed != null) {
            clearCache(bed);
        }

        return bed;
    }

    @Override
    public Bed updateImpl(com.surwing.model.Bed bed) throws SystemException {
        bed = toUnwrappedModel(bed);

        boolean isNew = bed.isNew();

        BedModelImpl bedModelImpl = (BedModelImpl) bed;

        Session session = null;

        try {
            session = openSession();

            if (bed.isNew()) {
                session.save(bed);

                bed.setNew(false);
            } else {
                session.merge(bed);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BedModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((bedModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bedModelImpl.getOriginalLocationId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
                    args);

                args = new Object[] { bedModelImpl.getLocationId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(BedModelImpl.ENTITY_CACHE_ENABLED,
            BedImpl.class, bed.getPrimaryKey(), bed);

        clearUniqueFindersCache(bed);
        cacheUniqueFindersCache(bed);

        return bed;
    }

    protected Bed toUnwrappedModel(Bed bed) {
        if (bed instanceof BedImpl) {
            return bed;
        }

        BedImpl bedImpl = new BedImpl();

        bedImpl.setNew(bed.isNew());
        bedImpl.setPrimaryKey(bed.getPrimaryKey());

        bedImpl.setBedId(bed.getBedId());
        bedImpl.setCompanyId(bed.getCompanyId());
        bedImpl.setGroupId(bed.getGroupId());
        bedImpl.setLocationId(bed.getLocationId());
        bedImpl.setBedNo(bed.getBedNo());
        bedImpl.setAlias(bed.getAlias());
        bedImpl.setPatientId(bed.getPatientId());
        bedImpl.setCreateDate(bed.getCreateDate());
        bedImpl.setModifiedDate(bed.getModifiedDate());

        return bedImpl;
    }

    /**
     * Returns the bed with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bed
     * @return the bed
     * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBedException, SystemException {
        Bed bed = fetchByPrimaryKey(primaryKey);

        if (bed == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bed;
    }

    /**
     * Returns the bed with the primary key or throws a {@link com.surwing.NoSuchBedException} if it could not be found.
     *
     * @param bedId the primary key of the bed
     * @return the bed
     * @throws com.surwing.NoSuchBedException if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed findByPrimaryKey(long bedId)
        throws NoSuchBedException, SystemException {
        return findByPrimaryKey((Serializable) bedId);
    }

    /**
     * Returns the bed with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bed
     * @return the bed, or <code>null</code> if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Bed bed = (Bed) EntityCacheUtil.getResult(BedModelImpl.ENTITY_CACHE_ENABLED,
                BedImpl.class, primaryKey);

        if (bed == _nullBed) {
            return null;
        }

        if (bed == null) {
            Session session = null;

            try {
                session = openSession();

                bed = (Bed) session.get(BedImpl.class, primaryKey);

                if (bed != null) {
                    cacheResult(bed);
                } else {
                    EntityCacheUtil.putResult(BedModelImpl.ENTITY_CACHE_ENABLED,
                        BedImpl.class, primaryKey, _nullBed);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BedModelImpl.ENTITY_CACHE_ENABLED,
                    BedImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bed;
    }

    /**
     * Returns the bed with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param bedId the primary key of the bed
     * @return the bed, or <code>null</code> if a bed with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bed fetchByPrimaryKey(long bedId) throws SystemException {
        return fetchByPrimaryKey((Serializable) bedId);
    }

    /**
     * Returns all the beds.
     *
     * @return the beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the beds.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of beds
     * @param end the upper bound of the range of beds (not inclusive)
     * @return the range of beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the beds.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.BedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of beds
     * @param end the upper bound of the range of beds (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of beds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bed> findAll(int start, int end,
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

        List<Bed> list = (List<Bed>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BED);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BED;

                if (pagination) {
                    sql = sql.concat(BedModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Bed>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bed>(list);
                } else {
                    list = (List<Bed>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the beds from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Bed bed : findAll()) {
            remove(bed);
        }
    }

    /**
     * Returns the number of beds.
     *
     * @return the number of beds
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

                Query q = session.createQuery(_SQL_COUNT_BED);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the bed persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.Bed")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Bed>> listenersList = new ArrayList<ModelListener<Bed>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Bed>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BedImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
