package com.surwing.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.surwing.model.Tag;

import com.surwing.service.TagLocalService;
import com.surwing.service.persistence.BedPersistence;
import com.surwing.service.persistence.LocationPersistence;
import com.surwing.service.persistence.NodePersistence;
import com.surwing.service.persistence.PatientPersistence;
import com.surwing.service.persistence.SystemParameterPersistence;
import com.surwing.service.persistence.TagPersistence;
import com.surwing.service.persistence.TemperaturePersistence;
import com.surwing.service.persistence.UserInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tag local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.surwing.service.impl.TagLocalServiceImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.impl.TagLocalServiceImpl
 * @see com.surwing.service.TagLocalServiceUtil
 * @generated
 */
public abstract class TagLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements TagLocalService, IdentifiableBean {
    @BeanReference(type = com.surwing.service.BedLocalService.class)
    protected com.surwing.service.BedLocalService bedLocalService;
    @BeanReference(type = BedPersistence.class)
    protected BedPersistence bedPersistence;
    @BeanReference(type = com.surwing.service.LocationLocalService.class)
    protected com.surwing.service.LocationLocalService locationLocalService;
    @BeanReference(type = LocationPersistence.class)
    protected LocationPersistence locationPersistence;
    @BeanReference(type = com.surwing.service.NodeLocalService.class)
    protected com.surwing.service.NodeLocalService nodeLocalService;
    @BeanReference(type = NodePersistence.class)
    protected NodePersistence nodePersistence;
    @BeanReference(type = com.surwing.service.PatientLocalService.class)
    protected com.surwing.service.PatientLocalService patientLocalService;
    @BeanReference(type = PatientPersistence.class)
    protected PatientPersistence patientPersistence;
    @BeanReference(type = com.surwing.service.SystemParameterLocalService.class)
    protected com.surwing.service.SystemParameterLocalService systemParameterLocalService;
    @BeanReference(type = SystemParameterPersistence.class)
    protected SystemParameterPersistence systemParameterPersistence;
    @BeanReference(type = com.surwing.service.TagLocalService.class)
    protected com.surwing.service.TagLocalService tagLocalService;
    @BeanReference(type = TagPersistence.class)
    protected TagPersistence tagPersistence;
    @BeanReference(type = com.surwing.service.TemperatureLocalService.class)
    protected com.surwing.service.TemperatureLocalService temperatureLocalService;
    @BeanReference(type = TemperaturePersistence.class)
    protected TemperaturePersistence temperaturePersistence;
    @BeanReference(type = com.surwing.service.UserInfoLocalService.class)
    protected com.surwing.service.UserInfoLocalService userInfoLocalService;
    @BeanReference(type = UserInfoPersistence.class)
    protected UserInfoPersistence userInfoPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private TagLocalServiceClpInvoker _clpInvoker = new TagLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.surwing.service.TagLocalServiceUtil} to access the tag local service.
     */

    /**
     * Adds the tag to the database. Also notifies the appropriate model listeners.
     *
     * @param tag the tag
     * @return the tag that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Tag addTag(Tag tag) throws SystemException {
        tag.setNew(true);

        return tagPersistence.update(tag);
    }

    /**
     * Creates a new tag with the primary key. Does not add the tag to the database.
     *
     * @param tagId the primary key for the new tag
     * @return the new tag
     */
    @Override
    public Tag createTag(long tagId) {
        return tagPersistence.create(tagId);
    }

    /**
     * Deletes the tag with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param tagId the primary key of the tag
     * @return the tag that was removed
     * @throws PortalException if a tag with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Tag deleteTag(long tagId) throws PortalException, SystemException {
        return tagPersistence.remove(tagId);
    }

    /**
     * Deletes the tag from the database. Also notifies the appropriate model listeners.
     *
     * @param tag the tag
     * @return the tag that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Tag deleteTag(Tag tag) throws SystemException {
        return tagPersistence.remove(tag);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Tag.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return tagPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return tagPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return tagPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return tagPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return tagPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Tag fetchTag(long tagId) throws SystemException {
        return tagPersistence.fetchByPrimaryKey(tagId);
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
    public Tag getTag(long tagId) throws PortalException, SystemException {
        return tagPersistence.findByPrimaryKey(tagId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return tagPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Tag> getTags(int start, int end) throws SystemException {
        return tagPersistence.findAll(start, end);
    }

    /**
     * Returns the number of tags.
     *
     * @return the number of tags
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getTagsCount() throws SystemException {
        return tagPersistence.countAll();
    }

    /**
     * Updates the tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param tag the tag
     * @return the tag that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Tag updateTag(Tag tag) throws SystemException {
        return tagPersistence.update(tag);
    }

    /**
     * Returns the bed local service.
     *
     * @return the bed local service
     */
    public com.surwing.service.BedLocalService getBedLocalService() {
        return bedLocalService;
    }

    /**
     * Sets the bed local service.
     *
     * @param bedLocalService the bed local service
     */
    public void setBedLocalService(
        com.surwing.service.BedLocalService bedLocalService) {
        this.bedLocalService = bedLocalService;
    }

    /**
     * Returns the bed persistence.
     *
     * @return the bed persistence
     */
    public BedPersistence getBedPersistence() {
        return bedPersistence;
    }

    /**
     * Sets the bed persistence.
     *
     * @param bedPersistence the bed persistence
     */
    public void setBedPersistence(BedPersistence bedPersistence) {
        this.bedPersistence = bedPersistence;
    }

    /**
     * Returns the location local service.
     *
     * @return the location local service
     */
    public com.surwing.service.LocationLocalService getLocationLocalService() {
        return locationLocalService;
    }

    /**
     * Sets the location local service.
     *
     * @param locationLocalService the location local service
     */
    public void setLocationLocalService(
        com.surwing.service.LocationLocalService locationLocalService) {
        this.locationLocalService = locationLocalService;
    }

    /**
     * Returns the location persistence.
     *
     * @return the location persistence
     */
    public LocationPersistence getLocationPersistence() {
        return locationPersistence;
    }

    /**
     * Sets the location persistence.
     *
     * @param locationPersistence the location persistence
     */
    public void setLocationPersistence(LocationPersistence locationPersistence) {
        this.locationPersistence = locationPersistence;
    }

    /**
     * Returns the node local service.
     *
     * @return the node local service
     */
    public com.surwing.service.NodeLocalService getNodeLocalService() {
        return nodeLocalService;
    }

    /**
     * Sets the node local service.
     *
     * @param nodeLocalService the node local service
     */
    public void setNodeLocalService(
        com.surwing.service.NodeLocalService nodeLocalService) {
        this.nodeLocalService = nodeLocalService;
    }

    /**
     * Returns the node persistence.
     *
     * @return the node persistence
     */
    public NodePersistence getNodePersistence() {
        return nodePersistence;
    }

    /**
     * Sets the node persistence.
     *
     * @param nodePersistence the node persistence
     */
    public void setNodePersistence(NodePersistence nodePersistence) {
        this.nodePersistence = nodePersistence;
    }

    /**
     * Returns the patient local service.
     *
     * @return the patient local service
     */
    public com.surwing.service.PatientLocalService getPatientLocalService() {
        return patientLocalService;
    }

    /**
     * Sets the patient local service.
     *
     * @param patientLocalService the patient local service
     */
    public void setPatientLocalService(
        com.surwing.service.PatientLocalService patientLocalService) {
        this.patientLocalService = patientLocalService;
    }

    /**
     * Returns the patient persistence.
     *
     * @return the patient persistence
     */
    public PatientPersistence getPatientPersistence() {
        return patientPersistence;
    }

    /**
     * Sets the patient persistence.
     *
     * @param patientPersistence the patient persistence
     */
    public void setPatientPersistence(PatientPersistence patientPersistence) {
        this.patientPersistence = patientPersistence;
    }

    /**
     * Returns the system parameter local service.
     *
     * @return the system parameter local service
     */
    public com.surwing.service.SystemParameterLocalService getSystemParameterLocalService() {
        return systemParameterLocalService;
    }

    /**
     * Sets the system parameter local service.
     *
     * @param systemParameterLocalService the system parameter local service
     */
    public void setSystemParameterLocalService(
        com.surwing.service.SystemParameterLocalService systemParameterLocalService) {
        this.systemParameterLocalService = systemParameterLocalService;
    }

    /**
     * Returns the system parameter persistence.
     *
     * @return the system parameter persistence
     */
    public SystemParameterPersistence getSystemParameterPersistence() {
        return systemParameterPersistence;
    }

    /**
     * Sets the system parameter persistence.
     *
     * @param systemParameterPersistence the system parameter persistence
     */
    public void setSystemParameterPersistence(
        SystemParameterPersistence systemParameterPersistence) {
        this.systemParameterPersistence = systemParameterPersistence;
    }

    /**
     * Returns the tag local service.
     *
     * @return the tag local service
     */
    public com.surwing.service.TagLocalService getTagLocalService() {
        return tagLocalService;
    }

    /**
     * Sets the tag local service.
     *
     * @param tagLocalService the tag local service
     */
    public void setTagLocalService(
        com.surwing.service.TagLocalService tagLocalService) {
        this.tagLocalService = tagLocalService;
    }

    /**
     * Returns the tag persistence.
     *
     * @return the tag persistence
     */
    public TagPersistence getTagPersistence() {
        return tagPersistence;
    }

    /**
     * Sets the tag persistence.
     *
     * @param tagPersistence the tag persistence
     */
    public void setTagPersistence(TagPersistence tagPersistence) {
        this.tagPersistence = tagPersistence;
    }

    /**
     * Returns the temperature local service.
     *
     * @return the temperature local service
     */
    public com.surwing.service.TemperatureLocalService getTemperatureLocalService() {
        return temperatureLocalService;
    }

    /**
     * Sets the temperature local service.
     *
     * @param temperatureLocalService the temperature local service
     */
    public void setTemperatureLocalService(
        com.surwing.service.TemperatureLocalService temperatureLocalService) {
        this.temperatureLocalService = temperatureLocalService;
    }

    /**
     * Returns the temperature persistence.
     *
     * @return the temperature persistence
     */
    public TemperaturePersistence getTemperaturePersistence() {
        return temperaturePersistence;
    }

    /**
     * Sets the temperature persistence.
     *
     * @param temperaturePersistence the temperature persistence
     */
    public void setTemperaturePersistence(
        TemperaturePersistence temperaturePersistence) {
        this.temperaturePersistence = temperaturePersistence;
    }

    /**
     * Returns the user info local service.
     *
     * @return the user info local service
     */
    public com.surwing.service.UserInfoLocalService getUserInfoLocalService() {
        return userInfoLocalService;
    }

    /**
     * Sets the user info local service.
     *
     * @param userInfoLocalService the user info local service
     */
    public void setUserInfoLocalService(
        com.surwing.service.UserInfoLocalService userInfoLocalService) {
        this.userInfoLocalService = userInfoLocalService;
    }

    /**
     * Returns the user info persistence.
     *
     * @return the user info persistence
     */
    public UserInfoPersistence getUserInfoPersistence() {
        return userInfoPersistence;
    }

    /**
     * Sets the user info persistence.
     *
     * @param userInfoPersistence the user info persistence
     */
    public void setUserInfoPersistence(UserInfoPersistence userInfoPersistence) {
        this.userInfoPersistence = userInfoPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.surwing.model.Tag",
            tagLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.surwing.model.Tag");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Tag.class;
    }

    protected String getModelClassName() {
        return Tag.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = tagPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}