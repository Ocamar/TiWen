package com.surwing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserInfoLocalService}.
 *
 * @author zhaiyz
 * @see UserInfoLocalService
 * @generated
 */
public class UserInfoLocalServiceWrapper implements UserInfoLocalService,
    ServiceWrapper<UserInfoLocalService> {
    private UserInfoLocalService _userInfoLocalService;

    public UserInfoLocalServiceWrapper(
        UserInfoLocalService userInfoLocalService) {
        _userInfoLocalService = userInfoLocalService;
    }

    /**
    * Adds the user info to the database. Also notifies the appropriate model listeners.
    *
    * @param userInfo the user info
    * @return the user info that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.UserInfo addUserInfo(
        com.surwing.model.UserInfo userInfo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.addUserInfo(userInfo);
    }

    /**
    * Creates a new user info with the primary key. Does not add the user info to the database.
    *
    * @param userId the primary key for the new user info
    * @return the new user info
    */
    @Override
    public com.surwing.model.UserInfo createUserInfo(long userId) {
        return _userInfoLocalService.createUserInfo(userId);
    }

    /**
    * Deletes the user info with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the user info
    * @return the user info that was removed
    * @throws PortalException if a user info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.UserInfo deleteUserInfo(long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.deleteUserInfo(userId);
    }

    /**
    * Deletes the user info from the database. Also notifies the appropriate model listeners.
    *
    * @param userInfo the user info
    * @return the user info that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.UserInfo deleteUserInfo(
        com.surwing.model.UserInfo userInfo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.deleteUserInfo(userInfo);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _userInfoLocalService.dynamicQuery();
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
        return _userInfoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.UserInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userInfoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.UserInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userInfoLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _userInfoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _userInfoLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.surwing.model.UserInfo fetchUserInfo(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.fetchUserInfo(userId);
    }

    /**
    * Returns the user info with the primary key.
    *
    * @param userId the primary key of the user info
    * @return the user info
    * @throws PortalException if a user info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.UserInfo getUserInfo(long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.getUserInfo(userId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the user infos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.UserInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user infos
    * @param end the upper bound of the range of user infos (not inclusive)
    * @return the range of user infos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.surwing.model.UserInfo> getUserInfos(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.getUserInfos(start, end);
    }

    /**
    * Returns the number of user infos.
    *
    * @return the number of user infos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUserInfosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.getUserInfosCount();
    }

    /**
    * Updates the user info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userInfo the user info
    * @return the user info that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.surwing.model.UserInfo updateUserInfo(
        com.surwing.model.UserInfo userInfo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.updateUserInfo(userInfo);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userInfoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userInfoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userInfoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public int countByUserDisplayTerms(
        com.surwing.search.UserDisplayTerms displayTerms, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.countByUserDisplayTerms(displayTerms,
            companyId, groupId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.User> findByUserDisplayTerms(
        com.surwing.search.UserDisplayTerms displayTerms, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc, long companyId,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.findByUserDisplayTerms(displayTerms,
            start, end, obc, companyId, groupId);
    }

    @Override
    public com.liferay.portal.model.User addUser(java.lang.String screenName,
        java.lang.String firstName, java.lang.String password,
        java.lang.String confirmPassword, long locationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userInfoLocalService.addUser(screenName, firstName, password,
            confirmPassword, locationId, serviceContext);
    }

    @Override
    public void editUser(long userId, java.lang.String firstName,
        long locationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _userInfoLocalService.editUser(userId, firstName, locationId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserInfoLocalService getWrappedUserInfoLocalService() {
        return _userInfoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserInfoLocalService(
        UserInfoLocalService userInfoLocalService) {
        _userInfoLocalService = userInfoLocalService;
    }

    @Override
    public UserInfoLocalService getWrappedService() {
        return _userInfoLocalService;
    }

    @Override
    public void setWrappedService(UserInfoLocalService userInfoLocalService) {
        _userInfoLocalService = userInfoLocalService;
    }
}
