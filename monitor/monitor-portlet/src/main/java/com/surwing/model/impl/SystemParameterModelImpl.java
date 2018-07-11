package com.surwing.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.surwing.model.SystemParameter;
import com.surwing.model.SystemParameterModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SystemParameter service. Represents a row in the &quot;M_SystemParameter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.surwing.model.SystemParameterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SystemParameterImpl}.
 * </p>
 *
 * @author zhaiyz
 * @see SystemParameterImpl
 * @see com.surwing.model.SystemParameter
 * @see com.surwing.model.SystemParameterModel
 * @generated
 */
public class SystemParameterModelImpl extends BaseModelImpl<SystemParameter>
    implements SystemParameterModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a system parameter model instance should use the {@link com.surwing.model.SystemParameter} interface instead.
     */
    public static final String TABLE_NAME = "M_SystemParameter";
    public static final Object[][] TABLE_COLUMNS = {
            { "systemParameterId", Types.BIGINT },
            { "locationId", Types.BIGINT },
            { "key_", Types.VARCHAR },
            { "value", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table M_SystemParameter (systemParameterId LONG not null primary key,locationId LONG,key_ VARCHAR(75) null,value VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table M_SystemParameter";
    public static final String ORDER_BY_JPQL = " ORDER BY systemParameter.systemParameterId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY M_SystemParameter.systemParameterId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.surwing.model.SystemParameter"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.surwing.model.SystemParameter"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.surwing.model.SystemParameter"),
            true);
    public static long KEY_COLUMN_BITMASK = 1L;
    public static long LOCATIONID_COLUMN_BITMASK = 2L;
    public static long SYSTEMPARAMETERID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.surwing.model.SystemParameter"));
    private static ClassLoader _classLoader = SystemParameter.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            SystemParameter.class
        };
    private long _systemParameterId;
    private long _locationId;
    private long _originalLocationId;
    private boolean _setOriginalLocationId;
    private String _key;
    private String _originalKey;
    private String _value;
    private long _columnBitmask;
    private SystemParameter _escapedModel;

    public SystemParameterModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _systemParameterId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setSystemParameterId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _systemParameterId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return SystemParameter.class;
    }

    @Override
    public String getModelClassName() {
        return SystemParameter.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("systemParameterId", getSystemParameterId());
        attributes.put("locationId", getLocationId());
        attributes.put("key", getKey());
        attributes.put("value", getValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long systemParameterId = (Long) attributes.get("systemParameterId");

        if (systemParameterId != null) {
            setSystemParameterId(systemParameterId);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        String key = (String) attributes.get("key");

        if (key != null) {
            setKey(key);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }
    }

    @Override
    public long getSystemParameterId() {
        return _systemParameterId;
    }

    @Override
    public void setSystemParameterId(long systemParameterId) {
        _systemParameterId = systemParameterId;
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _columnBitmask |= LOCATIONID_COLUMN_BITMASK;

        if (!_setOriginalLocationId) {
            _setOriginalLocationId = true;

            _originalLocationId = _locationId;
        }

        _locationId = locationId;
    }

    public long getOriginalLocationId() {
        return _originalLocationId;
    }

    @Override
    public String getKey() {
        if (_key == null) {
            return StringPool.BLANK;
        } else {
            return _key;
        }
    }

    @Override
    public void setKey(String key) {
        _columnBitmask |= KEY_COLUMN_BITMASK;

        if (_originalKey == null) {
            _originalKey = _key;
        }

        _key = key;
    }

    public String getOriginalKey() {
        return GetterUtil.getString(_originalKey);
    }

    @Override
    public String getValue() {
        if (_value == null) {
            return StringPool.BLANK;
        } else {
            return _value;
        }
    }

    @Override
    public void setValue(String value) {
        _value = value;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            SystemParameter.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public SystemParameter toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (SystemParameter) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SystemParameterImpl systemParameterImpl = new SystemParameterImpl();

        systemParameterImpl.setSystemParameterId(getSystemParameterId());
        systemParameterImpl.setLocationId(getLocationId());
        systemParameterImpl.setKey(getKey());
        systemParameterImpl.setValue(getValue());

        systemParameterImpl.resetOriginalValues();

        return systemParameterImpl;
    }

    @Override
    public int compareTo(SystemParameter systemParameter) {
        long primaryKey = systemParameter.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SystemParameter)) {
            return false;
        }

        SystemParameter systemParameter = (SystemParameter) obj;

        long primaryKey = systemParameter.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        SystemParameterModelImpl systemParameterModelImpl = this;

        systemParameterModelImpl._originalLocationId = systemParameterModelImpl._locationId;

        systemParameterModelImpl._setOriginalLocationId = false;

        systemParameterModelImpl._originalKey = systemParameterModelImpl._key;

        systemParameterModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<SystemParameter> toCacheModel() {
        SystemParameterCacheModel systemParameterCacheModel = new SystemParameterCacheModel();

        systemParameterCacheModel.systemParameterId = getSystemParameterId();

        systemParameterCacheModel.locationId = getLocationId();

        systemParameterCacheModel.key = getKey();

        String key = systemParameterCacheModel.key;

        if ((key != null) && (key.length() == 0)) {
            systemParameterCacheModel.key = null;
        }

        systemParameterCacheModel.value = getValue();

        String value = systemParameterCacheModel.value;

        if ((value != null) && (value.length() == 0)) {
            systemParameterCacheModel.value = null;
        }

        return systemParameterCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{systemParameterId=");
        sb.append(getSystemParameterId());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", key=");
        sb.append(getKey());
        sb.append(", value=");
        sb.append(getValue());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.surwing.model.SystemParameter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>systemParameterId</column-name><column-value><![CDATA[");
        sb.append(getSystemParameterId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>key</column-name><column-value><![CDATA[");
        sb.append(getKey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}