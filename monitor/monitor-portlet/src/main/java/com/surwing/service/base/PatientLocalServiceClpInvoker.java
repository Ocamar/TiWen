package com.surwing.service.base;

import com.surwing.service.PatientLocalServiceUtil;

import java.util.Arrays;

/**
 * @author zhaiyz
 * @generated
 */
public class PatientLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;
    private String _methodName66;
    private String[] _methodParameterTypes66;
    private String _methodName67;
    private String[] _methodParameterTypes67;
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;
    private String _methodName71;
    private String[] _methodParameterTypes71;
    private String _methodName74;
    private String[] _methodParameterTypes74;
    private String _methodName75;
    private String[] _methodParameterTypes75;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName78;
    private String[] _methodParameterTypes78;
    private String _methodName79;
    private String[] _methodParameterTypes79;
    private String _methodName80;
    private String[] _methodParameterTypes80;
    private String _methodName81;
    private String[] _methodParameterTypes81;
    private String _methodName82;
    private String[] _methodParameterTypes82;

    public PatientLocalServiceClpInvoker() {
        _methodName0 = "addPatient";

        _methodParameterTypes0 = new String[] { "com.surwing.model.Patient" };

        _methodName1 = "createPatient";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deletePatient";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deletePatient";

        _methodParameterTypes3 = new String[] { "com.surwing.model.Patient" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchPatient";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getPatient";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getPatients";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getPatientsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updatePatient";

        _methodParameterTypes15 = new String[] { "com.surwing.model.Patient" };

        _methodName60 = "getBeanIdentifier";

        _methodParameterTypes60 = new String[] {  };

        _methodName61 = "setBeanIdentifier";

        _methodParameterTypes61 = new String[] { "java.lang.String" };

        _methodName66 = "addPatient";

        _methodParameterTypes66 = new String[] {
                "java.lang.String", "java.lang.String", "long", "long", "int",
                "java.lang.String", "java.math.BigDecimal",
                "java.math.BigDecimal", "java.lang.String",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName67 = "fetchByMrn";

        _methodParameterTypes67 = new String[] { "java.lang.String" };

        _methodName68 = "findByDisplayTerms";

        _methodParameterTypes68 = new String[] {
                "com.surwing.search.PatientDisplayTerms",
                "com.liferay.portal.kernel.util.OrderByComparator", "int", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName69 = "countByDisplayTerms";

        _methodParameterTypes69 = new String[] {
                "com.surwing.search.PatientDisplayTerms",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName71 = "updatePatientStatus";

        _methodParameterTypes71 = new String[] { "long", "java.math.BigDecimal" };

        _methodName74 = "findPatientStatusByDisplayTerms";

        _methodParameterTypes74 = new String[] {
                "com.surwing.search.PatientStatusDisplayTerms",
                "com.liferay.portal.kernel.util.OrderByComparator", "int", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName75 = "countPatientStatusByDisplayTerms";

        _methodParameterTypes75 = new String[] {
                "com.surwing.search.PatientStatusDisplayTerms",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName77 = "findMajorPatients";

        _methodParameterTypes77 = new String[] {
                "long", "com.liferay.portal.service.ServiceContext"
            };

        _methodName78 = "discharge";

        _methodParameterTypes78 = new String[] { "long" };

        _methodName79 = "hasFebrilePatient";

        _methodParameterTypes79 = new String[] {  };

        _methodName80 = "unRegisterTag";

        _methodParameterTypes80 = new String[] { "long" };

        _methodName81 = "deletePatient";

        _methodParameterTypes81 = new String[] { "long" };

        _methodName82 = "getInpatientByLocation";

        _methodParameterTypes82 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return PatientLocalServiceUtil.addPatient((com.surwing.model.Patient) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return PatientLocalServiceUtil.createPatient(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return PatientLocalServiceUtil.deletePatient(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return PatientLocalServiceUtil.deletePatient((com.surwing.model.Patient) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return PatientLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return PatientLocalServiceUtil.fetchPatient(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return PatientLocalServiceUtil.getPatient(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return PatientLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return PatientLocalServiceUtil.getPatients(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return PatientLocalServiceUtil.getPatientsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return PatientLocalServiceUtil.updatePatient((com.surwing.model.Patient) arguments[0]);
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return PatientLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            PatientLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return PatientLocalServiceUtil.addPatient((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                ((Integer) arguments[4]).intValue(),
                (java.lang.String) arguments[5],
                (java.math.BigDecimal) arguments[6],
                (java.math.BigDecimal) arguments[7],
                (java.lang.String) arguments[8],
                (com.liferay.portal.service.ServiceContext) arguments[9]);
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            return PatientLocalServiceUtil.fetchByMrn((java.lang.String) arguments[0]);
        }

        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return PatientLocalServiceUtil.findByDisplayTerms((com.surwing.search.PatientDisplayTerms) arguments[0],
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            return PatientLocalServiceUtil.countByDisplayTerms((com.surwing.search.PatientDisplayTerms) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName71.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
            PatientLocalServiceUtil.updatePatientStatus(((Long) arguments[0]).longValue(),
                (java.math.BigDecimal) arguments[1]);

            return null;
        }

        if (_methodName74.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
            return PatientLocalServiceUtil.findPatientStatusByDisplayTerms((com.surwing.search.PatientStatusDisplayTerms) arguments[0],
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName75.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
            return PatientLocalServiceUtil.countPatientStatusByDisplayTerms((com.surwing.search.PatientStatusDisplayTerms) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            return PatientLocalServiceUtil.findMajorPatients(((Long) arguments[0]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            PatientLocalServiceUtil.discharge(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            return PatientLocalServiceUtil.hasFebrilePatient();
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            PatientLocalServiceUtil.unRegisterTag(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            return PatientLocalServiceUtil.deletePatient(((Long) arguments[0]).longValue());
        }

        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return PatientLocalServiceUtil.getInpatientByLocation(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
