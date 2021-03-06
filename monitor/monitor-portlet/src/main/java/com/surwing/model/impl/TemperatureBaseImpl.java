package com.surwing.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.surwing.model.Temperature;

import com.surwing.service.TemperatureLocalServiceUtil;

/**
 * The extended model base implementation for the Temperature service. Represents a row in the &quot;M_Temperature&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TemperatureImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see TemperatureImpl
 * @see com.surwing.model.Temperature
 * @generated
 */
public abstract class TemperatureBaseImpl extends TemperatureModelImpl
    implements Temperature {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a temperature model instance should use the {@link Temperature} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TemperatureLocalServiceUtil.addTemperature(this);
        } else {
            TemperatureLocalServiceUtil.updateTemperature(this);
        }
    }
}
