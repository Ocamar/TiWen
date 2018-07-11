package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Tag;

import java.util.List;

/**
 * The persistence utility for the tag service. This utility wraps {@link TagPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TagPersistence
 * @see TagPersistenceImpl
 * @generated
 */
public class TagUtil {
    private static TagPersistence _persistence;

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
    public static void clearCache(Tag tag) {
        getPersistence().clearCache(tag);
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
    public static List<Tag> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Tag> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Tag> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Tag update(Tag tag) throws SystemException {
        return getPersistence().update(tag);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Tag update(Tag tag, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(tag, serviceContext);
    }

    /**
    * Returns the tag where tagNo = &#63; or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
    *
    * @param tagNo the tag no
    * @return the matching tag
    * @throws com.surwing.NoSuchTagException if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag findByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return getPersistence().findByTagNo(tagNo);
    }

    /**
    * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param tagNo the tag no
    * @return the matching tag, or <code>null</code> if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByTagNo(tagNo);
    }

    /**
    * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param tagNo the tag no
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching tag, or <code>null</code> if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByTagNo(tagNo, retrieveFromCache);
    }

    /**
    * Removes the tag where tagNo = &#63; from the database.
    *
    * @param tagNo the tag no
    * @return the tag that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag removeByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return getPersistence().removeByTagNo(tagNo);
    }

    /**
    * Returns the number of tags where tagNo = &#63;.
    *
    * @param tagNo the tag no
    * @return the number of matching tags
    * @throws SystemException if a system exception occurred
    */
    public static int countByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByTagNo(tagNo);
    }

    /**
    * Caches the tag in the entity cache if it is enabled.
    *
    * @param tag the tag
    */
    public static void cacheResult(com.surwing.model.Tag tag) {
        getPersistence().cacheResult(tag);
    }

    /**
    * Caches the tags in the entity cache if it is enabled.
    *
    * @param tags the tags
    */
    public static void cacheResult(java.util.List<com.surwing.model.Tag> tags) {
        getPersistence().cacheResult(tags);
    }

    /**
    * Creates a new tag with the primary key. Does not add the tag to the database.
    *
    * @param tagId the primary key for the new tag
    * @return the new tag
    */
    public static com.surwing.model.Tag create(long tagId) {
        return getPersistence().create(tagId);
    }

    /**
    * Removes the tag with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagId the primary key of the tag
    * @return the tag that was removed
    * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag remove(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return getPersistence().remove(tagId);
    }

    public static com.surwing.model.Tag updateImpl(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(tag);
    }

    /**
    * Returns the tag with the primary key or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
    *
    * @param tagId the primary key of the tag
    * @return the tag
    * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag findByPrimaryKey(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return getPersistence().findByPrimaryKey(tagId);
    }

    /**
    * Returns the tag with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tagId the primary key of the tag
    * @return the tag, or <code>null</code> if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag fetchByPrimaryKey(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(tagId);
    }

    /**
    * Returns all the tags.
    *
    * @return the tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Tag> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.surwing.model.Tag> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.surwing.model.Tag> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tags from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tags.
    *
    * @return the number of tags
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TagPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TagPersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    TagPersistence.class.getName());

            ReferenceRegistry.registerReference(TagUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TagPersistence persistence) {
    }
}
