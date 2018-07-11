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

import com.surwing.NoSuchTagException;

import com.surwing.model.Tag;
import com.surwing.model.impl.TagImpl;
import com.surwing.model.impl.TagModelImpl;

import com.surwing.service.persistence.TagPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TagPersistence
 * @see TagUtil
 * @generated
 */
public class TagPersistenceImpl extends BasePersistenceImpl<Tag>
    implements TagPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TagUtil} to access the tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TagImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagModelImpl.FINDER_CACHE_ENABLED, TagImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagModelImpl.FINDER_CACHE_ENABLED, TagImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_TAGNO = new FinderPath(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagModelImpl.FINDER_CACHE_ENABLED, TagImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByTagNo",
            new String[] { String.class.getName() },
            TagModelImpl.TAGNO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_TAGNO = new FinderPath(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTagNo",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_TAGNO_TAGNO_1 = "tag.tagNo IS NULL";
    private static final String _FINDER_COLUMN_TAGNO_TAGNO_2 = "tag.tagNo = ?";
    private static final String _FINDER_COLUMN_TAGNO_TAGNO_3 = "(tag.tagNo IS NULL OR tag.tagNo = '')";
    private static final String _SQL_SELECT_TAG = "SELECT tag FROM Tag tag";
    private static final String _SQL_SELECT_TAG_WHERE = "SELECT tag FROM Tag tag WHERE ";
    private static final String _SQL_COUNT_TAG = "SELECT COUNT(tag) FROM Tag tag";
    private static final String _SQL_COUNT_TAG_WHERE = "SELECT COUNT(tag) FROM Tag tag WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tag.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tag exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tag exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TagPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Tag _nullTag = new TagImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Tag> toCacheModel() {
                return _nullTagCacheModel;
            }
        };

    private static CacheModel<Tag> _nullTagCacheModel = new CacheModel<Tag>() {
            @Override
            public Tag toEntityModel() {
                return _nullTag;
            }
        };

    public TagPersistenceImpl() {
        setModelClass(Tag.class);
    }

    /**
     * Returns the tag where tagNo = &#63; or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
     *
     * @param tagNo the tag no
     * @return the matching tag
     * @throws com.surwing.NoSuchTagException if a matching tag could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag findByTagNo(String tagNo)
        throws NoSuchTagException, SystemException {
        Tag tag = fetchByTagNo(tagNo);

        if (tag == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("tagNo=");
            msg.append(tagNo);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchTagException(msg.toString());
        }

        return tag;
    }

    /**
     * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param tagNo the tag no
     * @return the matching tag, or <code>null</code> if a matching tag could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag fetchByTagNo(String tagNo) throws SystemException {
        return fetchByTagNo(tagNo, true);
    }

    /**
     * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param tagNo the tag no
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching tag, or <code>null</code> if a matching tag could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag fetchByTagNo(String tagNo, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { tagNo };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TAGNO,
                    finderArgs, this);
        }

        if (result instanceof Tag) {
            Tag tag = (Tag) result;

            if (!Validator.equals(tagNo, tag.getTagNo())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_TAG_WHERE);

            boolean bindTagNo = false;

            if (tagNo == null) {
                query.append(_FINDER_COLUMN_TAGNO_TAGNO_1);
            } else if (tagNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_TAGNO_TAGNO_3);
            } else {
                bindTagNo = true;

                query.append(_FINDER_COLUMN_TAGNO_TAGNO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindTagNo) {
                    qPos.add(tagNo);
                }

                List<Tag> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNO,
                        finderArgs, list);
                } else {
                    Tag tag = list.get(0);

                    result = tag;

                    cacheResult(tag);

                    if ((tag.getTagNo() == null) ||
                            !tag.getTagNo().equals(tagNo)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNO,
                            finderArgs, tag);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNO,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Tag) result;
        }
    }

    /**
     * Removes the tag where tagNo = &#63; from the database.
     *
     * @param tagNo the tag no
     * @return the tag that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag removeByTagNo(String tagNo)
        throws NoSuchTagException, SystemException {
        Tag tag = findByTagNo(tagNo);

        return remove(tag);
    }

    /**
     * Returns the number of tags where tagNo = &#63;.
     *
     * @param tagNo the tag no
     * @return the number of matching tags
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByTagNo(String tagNo) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_TAGNO;

        Object[] finderArgs = new Object[] { tagNo };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_TAG_WHERE);

            boolean bindTagNo = false;

            if (tagNo == null) {
                query.append(_FINDER_COLUMN_TAGNO_TAGNO_1);
            } else if (tagNo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_TAGNO_TAGNO_3);
            } else {
                bindTagNo = true;

                query.append(_FINDER_COLUMN_TAGNO_TAGNO_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindTagNo) {
                    qPos.add(tagNo);
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
     * Caches the tag in the entity cache if it is enabled.
     *
     * @param tag the tag
     */
    @Override
    public void cacheResult(Tag tag) {
        EntityCacheUtil.putResult(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagImpl.class, tag.getPrimaryKey(), tag);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNO,
            new Object[] { tag.getTagNo() }, tag);

        tag.resetOriginalValues();
    }

    /**
     * Caches the tags in the entity cache if it is enabled.
     *
     * @param tags the tags
     */
    @Override
    public void cacheResult(List<Tag> tags) {
        for (Tag tag : tags) {
            if (EntityCacheUtil.getResult(TagModelImpl.ENTITY_CACHE_ENABLED,
                        TagImpl.class, tag.getPrimaryKey()) == null) {
                cacheResult(tag);
            } else {
                tag.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tags.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TagImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TagImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tag.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Tag tag) {
        EntityCacheUtil.removeResult(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagImpl.class, tag.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(tag);
    }

    @Override
    public void clearCache(List<Tag> tags) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Tag tag : tags) {
            EntityCacheUtil.removeResult(TagModelImpl.ENTITY_CACHE_ENABLED,
                TagImpl.class, tag.getPrimaryKey());

            clearUniqueFindersCache(tag);
        }
    }

    protected void cacheUniqueFindersCache(Tag tag) {
        if (tag.isNew()) {
            Object[] args = new Object[] { tag.getTagNo() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TAGNO, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNO, args, tag);
        } else {
            TagModelImpl tagModelImpl = (TagModelImpl) tag;

            if ((tagModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_TAGNO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { tag.getTagNo() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TAGNO, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNO, args, tag);
            }
        }
    }

    protected void clearUniqueFindersCache(Tag tag) {
        TagModelImpl tagModelImpl = (TagModelImpl) tag;

        Object[] args = new Object[] { tag.getTagNo() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNO, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNO, args);

        if ((tagModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_TAGNO.getColumnBitmask()) != 0) {
            args = new Object[] { tagModelImpl.getOriginalTagNo() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNO, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNO, args);
        }
    }

    /**
     * Creates a new tag with the primary key. Does not add the tag to the database.
     *
     * @param tagId the primary key for the new tag
     * @return the new tag
     */
    @Override
    public Tag create(long tagId) {
        Tag tag = new TagImpl();

        tag.setNew(true);
        tag.setPrimaryKey(tagId);

        return tag;
    }

    /**
     * Removes the tag with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param tagId the primary key of the tag
     * @return the tag that was removed
     * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag remove(long tagId) throws NoSuchTagException, SystemException {
        return remove((Serializable) tagId);
    }

    /**
     * Removes the tag with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tag
     * @return the tag that was removed
     * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag remove(Serializable primaryKey)
        throws NoSuchTagException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Tag tag = (Tag) session.get(TagImpl.class, primaryKey);

            if (tag == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tag);
        } catch (NoSuchTagException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Tag removeImpl(Tag tag) throws SystemException {
        tag = toUnwrappedModel(tag);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tag)) {
                tag = (Tag) session.get(TagImpl.class, tag.getPrimaryKeyObj());
            }

            if (tag != null) {
                session.delete(tag);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tag != null) {
            clearCache(tag);
        }

        return tag;
    }

    @Override
    public Tag updateImpl(com.surwing.model.Tag tag) throws SystemException {
        tag = toUnwrappedModel(tag);

        boolean isNew = tag.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tag.isNew()) {
                session.save(tag);

                tag.setNew(false);
            } else {
                session.merge(tag);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !TagModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(TagModelImpl.ENTITY_CACHE_ENABLED,
            TagImpl.class, tag.getPrimaryKey(), tag);

        clearUniqueFindersCache(tag);
        cacheUniqueFindersCache(tag);

        return tag;
    }

    protected Tag toUnwrappedModel(Tag tag) {
        if (tag instanceof TagImpl) {
            return tag;
        }

        TagImpl tagImpl = new TagImpl();

        tagImpl.setNew(tag.isNew());
        tagImpl.setPrimaryKey(tag.getPrimaryKey());

        tagImpl.setTagId(tag.getTagId());
        tagImpl.setCompanyId(tag.getCompanyId());
        tagImpl.setGroupId(tag.getGroupId());
        tagImpl.setTagNo(tag.getTagNo());
        tagImpl.setType(tag.getType());
        tagImpl.setNodeId(tag.getNodeId());
        tagImpl.setLocationId(tag.getLocationId());
        tagImpl.setStatus(tag.getStatus());
        tagImpl.setPatientId(tag.getPatientId());
        tagImpl.setCreateDate(tag.getCreateDate());
        tagImpl.setModifiedDate(tag.getModifiedDate());

        return tagImpl;
    }

    /**
     * Returns the tag with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tag
     * @return the tag
     * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTagException, SystemException {
        Tag tag = fetchByPrimaryKey(primaryKey);

        if (tag == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tag;
    }

    /**
     * Returns the tag with the primary key or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
     *
     * @param tagId the primary key of the tag
     * @return the tag
     * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag findByPrimaryKey(long tagId)
        throws NoSuchTagException, SystemException {
        return findByPrimaryKey((Serializable) tagId);
    }

    /**
     * Returns the tag with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tag
     * @return the tag, or <code>null</code> if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Tag tag = (Tag) EntityCacheUtil.getResult(TagModelImpl.ENTITY_CACHE_ENABLED,
                TagImpl.class, primaryKey);

        if (tag == _nullTag) {
            return null;
        }

        if (tag == null) {
            Session session = null;

            try {
                session = openSession();

                tag = (Tag) session.get(TagImpl.class, primaryKey);

                if (tag != null) {
                    cacheResult(tag);
                } else {
                    EntityCacheUtil.putResult(TagModelImpl.ENTITY_CACHE_ENABLED,
                        TagImpl.class, primaryKey, _nullTag);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TagModelImpl.ENTITY_CACHE_ENABLED,
                    TagImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tag;
    }

    /**
     * Returns the tag with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param tagId the primary key of the tag
     * @return the tag, or <code>null</code> if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tag fetchByPrimaryKey(long tagId) throws SystemException {
        return fetchByPrimaryKey((Serializable) tagId);
    }

    /**
     * Returns all the tags.
     *
     * @return the tags
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tag> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tags.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tags
     * @param end the upper bound of the range of tags (not inclusive)
     * @return the range of tags
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tag> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tags.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tags
     * @param end the upper bound of the range of tags (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tags
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tag> findAll(int start, int end,
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

        List<Tag> list = (List<Tag>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TAG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TAG;

                if (pagination) {
                    sql = sql.concat(TagModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Tag>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Tag>(list);
                } else {
                    list = (List<Tag>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the tags from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Tag tag : findAll()) {
            remove(tag);
        }
    }

    /**
     * Returns the number of tags.
     *
     * @return the number of tags
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

                Query q = session.createQuery(_SQL_COUNT_TAG);

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
     * Initializes the tag persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.surwing.model.Tag")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Tag>> listenersList = new ArrayList<ModelListener<Tag>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Tag>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TagImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
