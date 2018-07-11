package com.surwing.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.surwing.model.Tag;

/**
 * The persistence interface for the tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TagPersistenceImpl
 * @see TagUtil
 * @generated
 */
public interface TagPersistence extends BasePersistence<Tag> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TagUtil} to access the tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the tag where tagNo = &#63; or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
    *
    * @param tagNo the tag no
    * @return the matching tag
    * @throws com.surwing.NoSuchTagException if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag findByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException;

    /**
    * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param tagNo the tag no
    * @return the matching tag, or <code>null</code> if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tag where tagNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param tagNo the tag no
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching tag, or <code>null</code> if a matching tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the tag where tagNo = &#63; from the database.
    *
    * @param tagNo the tag no
    * @return the tag that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag removeByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException;

    /**
    * Returns the number of tags where tagNo = &#63;.
    *
    * @param tagNo the tag no
    * @return the number of matching tags
    * @throws SystemException if a system exception occurred
    */
    public int countByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the tag in the entity cache if it is enabled.
    *
    * @param tag the tag
    */
    public void cacheResult(com.surwing.model.Tag tag);

    /**
    * Caches the tags in the entity cache if it is enabled.
    *
    * @param tags the tags
    */
    public void cacheResult(java.util.List<com.surwing.model.Tag> tags);

    /**
    * Creates a new tag with the primary key. Does not add the tag to the database.
    *
    * @param tagId the primary key for the new tag
    * @return the new tag
    */
    public com.surwing.model.Tag create(long tagId);

    /**
    * Removes the tag with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagId the primary key of the tag
    * @return the tag that was removed
    * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag remove(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException;

    public com.surwing.model.Tag updateImpl(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tag with the primary key or throws a {@link com.surwing.NoSuchTagException} if it could not be found.
    *
    * @param tagId the primary key of the tag
    * @return the tag
    * @throws com.surwing.NoSuchTagException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag findByPrimaryKey(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException;

    /**
    * Returns the tag with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tagId the primary key of the tag
    * @return the tag, or <code>null</code> if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Tag fetchByPrimaryKey(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tags.
    *
    * @return the tags
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Tag> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Tag> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Tag> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tags from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tags.
    *
    * @return the number of tags
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
