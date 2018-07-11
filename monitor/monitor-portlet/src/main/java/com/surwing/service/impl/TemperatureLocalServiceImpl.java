package com.surwing.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.surwing.model.Temperature;
import com.surwing.service.base.TemperatureLocalServiceBaseImpl;
import com.surwing.util.DateHelper;

import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the temperature local service.
 *
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.TemperatureLocalService} interface.
 *
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.TemperatureLocalServiceBaseImpl
 * @see com.surwing.service.TemperatureLocalServiceUtil
 */
public class TemperatureLocalServiceImpl extends TemperatureLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service.TemperatureLocalServiceUtil} to
      * access the temperature local service.
     */

    public Temperature addTemperature(long patientId, BigDecimal temperature) throws SystemException, PortalException {
        if (temperature.compareTo(BigDecimal.valueOf(30L)) == -1) {
            return null;
        }

        long temperatureId = counterLocalService.increment(Temperature.class.getName());
        Temperature t = temperaturePersistence.create(temperatureId);
        t.setPatientId(patientId);
        t.setTemperature(temperature);
        t.setCreateDate(new Date());

        patientLocalService.updatePatientStatus(patientId, temperature);

        return super.addTemperature(t);
    }

    public Temperature getPatientTemperatureIn8h(long patientId) throws SystemException {
        Date now = new Date();
        Date eightHourAgo = DateUtils.addHours(now, -8);

        DynamicQuery dynamicQuery = dynamicQuery();

        dynamicQuery.add(PropertyFactoryUtil.forName("patientId").eq(patientId));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").ge(eightHourAgo));

        dynamicQuery.addOrder(OrderFactoryUtil.desc("temperature"));
        dynamicQuery.addOrder(OrderFactoryUtil.desc("temperatureId"));

        List<Temperature> temperatures = dynamicQuery(dynamicQuery, 0, 1);
        if (temperatures == null || temperatures.size() == 0) {
            return null;
        } else {
            return temperatures.get(0);
        }
    }

    public BigDecimal getCurrentHourTemperature(long patientId, Date currentHour) throws SystemException {
        Date nextHour = DateUtils.addHours(currentHour, 1);
        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("patientId").eq(patientId));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").ge(currentHour));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").lt(nextHour));
        dynamicQuery.addOrder(OrderFactoryUtil.asc("temperatureId"));
        List<Temperature> temperatures = dynamicQuery(dynamicQuery, 0, 1);

        if (temperatures == null || temperatures.size() == 0) {
            return BigDecimal.ZERO;
        } else {
            return temperatures.get(0).getTemperature();
        }
    }

    public boolean hasTodayRecords(long patientId) throws SystemException {
        Date startDateOfDay = DateHelper.getStartDateOfDay(new Date());
        DynamicQuery dynamicQuery = dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("patientId").eq(patientId));
        dynamicQuery.add(PropertyFactoryUtil.forName("createDate").ge(startDateOfDay));
        int count = Long.valueOf(dynamicQueryCount(dynamicQuery)).intValue();
        return count > 0;
    }
}
