package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TagLocalService}.
 *
 * @author zhaiyz
 * @see TagLocalService
 * @generated
 */
public class TagLocalServiceWrapper implements TagLocalService,
    ServiceWrapper<TagLocalService> {
    private TagLocalService _tagLocalService;

    public TagLocalServiceWrapper(TagLocalService tagLocalService) {
        _tagLocalService = tagLocalService;
    }

    /**
    * Adds the tag to the database. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Tag addTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.addTag(tag);
    }

    /**
    * Creates a new tag with the primary key. Does not add the tag to the database.
    *
    * @param tagId the primary key for the new tag
    * @return the new tag
    */
    @Override
    public com.surwing.model.Tag createTag(long tagId) {
        return _tagLocalService.createTag(tagId);
    }

    /**
    * Deletes the tag with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagId the primary key of the tag
    * @return the tag that was removed
    * @throws PortalException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Tag deleteTag(long tagId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.deleteTag(tagId);
    }

    /**
    * Deletes the tag from the database. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Tag deleteTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.deleteTag(tag);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tagLocalService.dynamicQuery();
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
        return _tagLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tagLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _tagLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _tagLocalService.dynamicQueryCount(dynamicQuery);
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
        return _tagLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.surwing.model.Tag fetchTag(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.fetchTag(tagId);
    }

    /**
    * Returns the tag with the primary key.
    *
    * @param tagId the primary key of the tag
    * @return the tag
    * @throws PortalException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Tag getTag(long tagId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.getTag(tagId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.surwing.model.Tag> getTags(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.getTags(start, end);
    }

    /**
    * Returns the number of tags.
    *
    * @return the number of tags
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTagsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.getTagsCount();
    }

    /**
    * Updates the tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.Tag updateTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.updateTag(tag);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tagLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tagLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tagLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.surwing.model.Tag addTag(java.lang.String tagNo, int type,
        int status, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.addTag(tagNo, type, status, companyId, groupId);
    }

    @Override
    public com.surwing.model.Tag updateTag(java.lang.String tagNo, long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return _tagLocalService.updateTag(tagNo, nodeId);
    }

    @Override
    public com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.fetchByTagNo(tagNo);
    }

    @Override
    public int countTagsByDisplayTerms(
        com.surwing.search.TagDisplayTerms displayTerms, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.countTagsByDisplayTerms(displayTerms,
            companyId, groupId);
    }

    @Override
    public java.util.List<com.surwing.model.Tag> findTagsByDisplayTerms(
        com.surwing.search.TagDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.findTagsByDisplayTerms(displayTerms, obc,
            start, end, companyId, groupId);
    }

    @Override
    public boolean isUsable(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tagLocalService.isUsable(tagNo);
    }

    @Override
    public void registerTag(long tagId, long locationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _tagLocalService.registerTag(tagId, locationId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TagLocalService getWrappedTagLocalService() {
        return _tagLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTagLocalService(TagLocalService tagLocalService) {
        _tagLocalService = tagLocalService;
    }

    @Override
    public TagLocalService getWrappedService() {
        return _tagLocalService;
    }

    @Override
    public void setWrappedService(TagLocalService tagLocalService) {
        _tagLocalService = tagLocalService;
    }
}
