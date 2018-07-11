package com.surwing.service.base;

import com.surwing.service.NodeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author zhaiyz
 * @generated
 */
public class NodeLocalServiceClpInvoker {
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
    private String _methodName70;
    private String[] _methodParameterTypes70;
    private String _methodName71;
    private String[] _methodParameterTypes71;
    private String _methodName72;
    private String[] _methodParameterTypes72;

    public NodeLocalServiceClpInvoker() {
        _methodName0 = "addNode";

        _methodParameterTypes0 = new String[] { "com.surwing.model.Node" };

        _methodName1 = "createNode";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteNode";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteNode";

        _methodParameterTypes3 = new String[] { "com.surwing.model.Node" };

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

        _methodName10 = "fetchNode";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getNode";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getNodes";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getNodesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateNode";

        _methodParameterTypes15 = new String[] { "com.surwing.model.Node" };

        _methodName60 = "getBeanIdentifier";

        _methodParameterTypes60 = new String[] {  };

        _methodName61 = "setBeanIdentifier";

        _methodParameterTypes61 = new String[] { "java.lang.String" };

        _methodName66 = "addNode";

        _methodParameterTypes66 = new String[] {
                "long", "int", "java.lang.String", "long", "long"
            };

        _methodName67 = "countNodesByDisplayTerms";

        _methodParameterTypes67 = new String[] {
                "com.surwing.search.NodeDisplayTerms", "long", "long"
            };

        _methodName68 = "findNodesByDisplayTerms";

        _methodParameterTypes68 = new String[] {
                "com.surwing.search.NodeDisplayTerms",
                "com.liferay.portal.kernel.util.OrderByComparator", "int", "int",
                "long", "long"
            };

        _methodName70 = "updateNodeInfo";

        _methodParameterTypes70 = new String[] { "com.surwing.model.Node" };

        _methodName71 = "fetchByNodeNo";

        _methodParameterTypes71 = new String[] { "java.lang.String" };

        _methodName72 = "updateNodeStatusToTimeout";

        _methodParameterTypes72 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return NodeLocalServiceUtil.addNode((com.surwing.model.Node) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return NodeLocalServiceUtil.createNode(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return NodeLocalServiceUtil.deleteNode(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return NodeLocalServiceUtil.deleteNode((com.surwing.model.Node) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return NodeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return NodeLocalServiceUtil.fetchNode(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return NodeLocalServiceUtil.getNode(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return NodeLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return NodeLocalServiceUtil.getNodes(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return NodeLocalServiceUtil.getNodesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return NodeLocalServiceUtil.updateNode((com.surwing.model.Node) arguments[0]);
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return NodeLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            NodeLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return NodeLocalServiceUtil.addNode(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                (java.lang.String) arguments[2],
                ((Long) arguments[3]).longValue(),
                ((Long) arguments[4]).longValue());
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            return NodeLocalServiceUtil.countNodesByDisplayTerms((com.surwing.search.NodeDisplayTerms) arguments[0],
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue());
        }

        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return NodeLocalServiceUtil.findNodesByDisplayTerms((com.surwing.search.NodeDisplayTerms) arguments[0],
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                ((Long) arguments[4]).longValue(),
                ((Long) arguments[5]).longValue());
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return NodeLocalServiceUtil.updateNodeInfo((com.surwing.model.Node) arguments[0]);
        }

        if (_methodName71.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
            return NodeLocalServiceUtil.fetchByNodeNo((java.lang.String) arguments[0]);
        }

        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            NodeLocalServiceUtil.updateNodeStatusToTimeout();

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
