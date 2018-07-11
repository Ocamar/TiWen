package com.surwing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.surwing.model.Temperature;

import java.util.List;

/**
 * The persistence utility for the temperature service. This utility wraps {@link TemperaturePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TemperaturePersistence
 * @see TemperaturePersistenceImpl
 * @generated
 */
public class TemperatureUtil {
    private static TemperaturePersistence _persistence;

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
    public static void clearCache(Temperature temperature) {
        getPersistence().clearCache(temperature);
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
    public static List<Temperature> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Temperature> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Temperature> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Temperature update(Temperature temperature)
        throws SystemException {
        return getPersistence().update(temperature);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Temperature update(Temperature temperature,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(temperature, serviceContext);
    }

    /**
    * Caches the temperature in the entity cache if it is enabled.
    *
    * @param temperature the temperature
    */
    public static void cacheResult(com.surwing.model.Temperature temperature) {
        getPersistence().cacheResult(temperature);
    }

    /**
    * Caches the temperatures in the entity cache if it is enabled.
    *
    * @param temperatures the temperatures
    */
    public static void cacheResult(
        java.util.List<com.surwing.model.Temperature> temperatures) {
        getPersistence().cacheResult(temperatures);
    }

    /**
    * Creates a new temperature with the primary key. Does not add the temperature to the database.
    *
    * @param temperatureId the primary key for the new temperature
    * @return the new temperature
    */
    public static com.surwing.model.Temperature create(long temperatureId) {
        return getPersistence().create(temperatureId);
    }

    /**
    * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature that was removed
    * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Temperature remove(long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTemperatureException {
        return getPersistence().remove(temperatureId);
    }

    public static com.surwing.model.Temperature updateImpl(
        com.surwing.model.Temperature temperature)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(temperature);
    }

    /**
    * Returns the temperature with the primary key or throws a {@link com.surwing.NoSuchTemperatureException} if it could not be found.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature
    * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Temperature findByPrimaryKey(
        long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTemperatureException {
        return getPersistence().findByPrimaryKey(temperatureId);
    }

    /**
    * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.surwing.model.Temperature fetchByPrimaryKey(
        long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(temperatureId);
    }

    /**
    * Returns all the temperatures.
    *
    * @return the temperatures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Temperature> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the temperatures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of temperatures
    * @param end the upper bound of the range of temperatures (not inclusive)
    * @return the range of temperatures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Temperature> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the temperatures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.surwing.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of temperatures
    * @param end the upper bound of the range of temperatures (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of temperatures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.surwing.model.Temperature> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the temperatures from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of temperatures.
    *
    * @return the number of temperatures
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TemperaturePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TemperaturePersistence) PortletBeanLocatorUtil.locate(com.surwing.service.ClpSerializer.getServletContextName(),
                    TemperaturePersistence.class.getName());

            ReferenceRegistry.registerReference(TemperatureUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TemperaturePersistence persistence) {
    }
}
