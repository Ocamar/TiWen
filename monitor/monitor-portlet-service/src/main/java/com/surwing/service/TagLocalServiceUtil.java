package com.surwing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Tag. This utility wraps
 * {@link com.surwing.service.impl.TagLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author zhaiyz
 * @see TagLocalService
 * @see com.surwing.service.base.TagLocalServiceBaseImpl
 * @see com.surwing.service.impl.TagLocalServiceImpl
 * @generated
 */
public class TagLocalServiceUtil {
    private static TagLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.surwing.service.impl.TagLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the tag to the database. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag addTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTag(tag);
    }

    /**
    * Creates a new tag with the primary key. Does not add the tag to the database.
    *
    * @param tagId the primary key for the new tag
    * @return the new tag
    */
    public static com.surwing.model.Tag createTag(long tagId) {
        return getService().createTag(tagId);
    }

    /**
    * Deletes the tag with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagId the primary key of the tag
    * @return the tag that was removed
    * @throws PortalException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag deleteTag(long tagId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTag(tagId);
    }

    /**
    * Deletes the tag from the database. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag deleteTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTag(tag);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.surwing.model.Tag fetchTag(long tagId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTag(tagId);
    }

    /**
    * Returns the tag with the primary key.
    *
    * @param tagId the primary key of the tag
    * @return the tag
    * @throws PortalException if a tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag getTag(long tagId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTag(tagId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.surwing.model.Tag> getTags(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTags(start, end);
    }

    /**
    * Returns the number of tags.
    *
    * @return the number of tags
    * @throws SystemException if a system exception occurred
    */
    public static int getTagsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTagsCount();
    }

    /**
    * Updates the tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tag the tag
    * @return the tag that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Tag updateTag(com.surwing.model.Tag tag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTag(tag);
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

    public static com.surwing.model.Tag addTag(java.lang.String tagNo,
        int type, int status, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTag(tagNo, type, status, companyId, groupId);
    }

    public static com.surwing.model.Tag updateTag(java.lang.String tagNo,
        long nodeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTagException {
        return getService().updateTag(tagNo, nodeId);
    }

    public static com.surwing.model.Tag fetchByTagNo(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchByTagNo(tagNo);
    }

    public static int countTagsByDisplayTerms(
        com.surwing.search.TagDisplayTerms displayTerms, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .countTagsByDisplayTerms(displayTerms, companyId, groupId);
    }

    public static java.util.List<com.surwing.model.Tag> findTagsByDisplayTerms(
        com.surwing.search.TagDisplayTerms displayTerms,
        com.liferay.portal.kernel.util.OrderByComparator obc, int start,
        int end, long companyId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findTagsByDisplayTerms(displayTerms, obc, start, end,
            companyId, groupId);
    }

    public static boolean isUsable(java.lang.String tagNo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isUsable(tagNo);
    }

    public static void registerTag(long tagId, long locationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().registerTag(tagId, locationId);
    }

    public static void clearService() {
        _service = null;
    }

    public static TagLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TagLocalService.class.getName());

            if (invokableLocalService instanceof TagLocalService) {
                _service = (TagLocalService) invokableLocalService;
            } else {
                _service = new TagLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TagLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TagLocalService service) {
    }
}
