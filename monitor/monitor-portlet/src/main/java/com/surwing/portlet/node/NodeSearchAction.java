package com.surwing.portlet.node;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.opensymphony.xwork2.ActionContext;
import com.surwing.enums.NodeStatus;
import com.surwing.enums.NodeType;
import com.surwing.model.Location;
import com.surwing.model.Node;
import com.surwing.search.NodeDisplayTerms;
import com.surwing.service.LocationLocalServiceUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.struts2.liferay.SearchActionSupport;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;

/**
 * Created by zhaiyz on 16-1-9.
 */
public class NodeSearchAction extends SearchActionSupport<NodeDisplayTerms, Node> {

    @Override
    public NodeDisplayTerms getSearchTerms(PortletRequest portletRequest) {
        return new NodeDisplayTerms(portletRequest);
    }

    @Override
    protected int searchCount(NodeDisplayTerms searchTerms) throws SystemException, PortalException {
        return NodeLocalServiceUtil.countNodesByDisplayTerms(searchTerms, getCompanyId(), getScopeGroupId());
    }

    @Override
    protected List<Node> search(NodeDisplayTerms searchTerms, int startIndex, int endIndex, OrderByComparator obc)
            throws SystemException, PortalException {
        return NodeLocalServiceUtil.findNodesByDisplayTerms(searchTerms, obc, startIndex, endIndex, getCompanyId(),
                getScopeGroupId());
    }

    public List<NodeType> getNodeTypes() {
        List<NodeType> nodeTypes = new ArrayList<>();
        for (NodeType nodeType : NodeType.values()) {
            nodeTypes.add(nodeType);
        }
        return nodeTypes;
    }

    public List<Location> getLocations() throws SystemException {
        return LocationLocalServiceUtil.getLocationsByC_G(getCompanyId(), getScopeGroupId(), QueryUtil.ALL_POS,
                QueryUtil.ALL_POS);
    }

    public List<NodeStatus> getAllStatus() {
        List<NodeStatus> allStatus = new ArrayList<>();
        for (NodeStatus ns : NodeStatus.values()) {
            allStatus.add(ns);
        }
        return allStatus;
    }

    public String getNodeTypeName() {
        Node node = getCurrentNode();
        return NodeType.getNameByType(node.getNodeType());
    }

    public String getLocationNo() throws SystemException, PortalException {
        Node node = getCurrentNode();
        Location location = LocationLocalServiceUtil.getLocation(node.getLocationId());
        return location.getLocationNo();
    }

    public String getLocationName() throws SystemException, PortalException {
        Node node = getCurrentNode();
        Location location = LocationLocalServiceUtil.getLocation(node.getLocationId());
        return location.getLocationName();
    }

    public String getStatusName() {
        Node node = getCurrentNode();
        return NodeStatus.getNameByStatus(node.getStatus());
    }

    private Node getCurrentNode() {
        return (Node) ActionContext.getContext().getValueStack().findValue("top", Node.class, false);
    }
}
