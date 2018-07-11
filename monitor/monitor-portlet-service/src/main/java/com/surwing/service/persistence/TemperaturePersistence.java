package com.surwing.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.surwing.model.Temperature;

/**
 * The persistence interface for the temperature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhaiyz
 * @see TemperaturePersistenceImpl
 * @see TemperatureUtil
 * @generated
 */
public interface TemperaturePersistence extends BasePersistence<Temperature> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TemperatureUtil} to access the temperature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the temperature in the entity cache if it is enabled.
    *
    * @param temperature the temperature
    */
    public void cacheResult(com.surwing.model.Temperature temperature);

    /**
    * Caches the temperatures in the entity cache if it is enabled.
    *
    * @param temperatures the temperatures
    */
    public void cacheResult(
        java.util.List<com.surwing.model.Temperature> temperatures);

    /**
    * Creates a new temperature with the primary key. Does not add the temperature to the database.
    *
    * @param temperatureId the primary key for the new temperature
    * @return the new temperature
    */
    public com.surwing.model.Temperature create(long temperatureId);

    /**
    * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature that was removed
    * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Temperature remove(long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTemperatureException;

    public com.surwing.model.Temperature updateImpl(
        com.surwing.model.Temperature temperature)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the temperature with the primary key or throws a {@link com.surwing.NoSuchTemperatureException} if it could not be found.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature
    * @throws com.surwing.NoSuchTemperatureException if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Temperature findByPrimaryKey(long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.surwing.NoSuchTemperatureException;

    /**
    * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param temperatureId the primary key of the temperature
    * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.surwing.model.Temperature fetchByPrimaryKey(long temperatureId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the temperatures.
    *
    * @return the temperatures
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.surwing.model.Temperature> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Temperature> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.surwing.model.Temperature> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the temperatures from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of temperatures.
    *
    * @return the number of temperatures
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
