package com.surwing.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.surwing.model.SystemParameter;
import com.surwing.service.base.SystemParameterLocalServiceBaseImpl;

/**
 * The implementation of the system parameter local service.
 *
 * <p> All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.surwing.service.SystemParameterLocalService} interface.
 *
 * <p> This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM. </p>
 *
 * @author zhaiyz
 * @see com.surwing.service.base.SystemParameterLocalServiceBaseImpl
 * @see com.surwing.service.SystemParameterLocalServiceUtil
 */
public class SystemParameterLocalServiceImpl extends SystemParameterLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.surwing.service
     * .SystemParameterLocalServiceUtil} to access the system parameter local service.
     */

    public String getByLocationIdAndKey(long locationId, String key) throws SystemException {
        SystemParameter systemParameter = systemParameterPersistence.fetchByLocationIdAndKey(locationId, key);
        return systemParameter == null ? null : systemParameter.getValue();
    }

    public SystemParameter addOrUpdateSystemParameter(long locationId, String key, String value)
            throws SystemException {
        SystemParameter systemParameter = systemParameterPersistence.fetchByLocationIdAndKey(locationId, key);
        boolean isNew = false;
        if (systemParameter == null) {
            isNew = true;
            long systemParameterId = counterLocalService.increment(SystemParameter.class.getName());
            systemParameter = systemParameterPersistence.create(systemParameterId);
        }
        systemParameter.setLocationId(locationId);
        systemParameter.setKey(key);
        systemParameter.setValue(value);

        if (isNew) {
            return super.addSystemParameter(systemParameter);
        } else {
            return super.updateSystemParameter(systemParameter);
        }
    }
}
