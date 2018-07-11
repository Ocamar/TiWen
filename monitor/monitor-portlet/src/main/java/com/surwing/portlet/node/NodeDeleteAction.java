package com.surwing.portlet.node;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.service.NodeLocalServiceUtil;
import com.surwing.struts2.liferay.LiferayActionSupport;

/**
 * Created by zhaiyz on 16-1-8.
 */
public class NodeDeleteAction extends LiferayActionSupport {

    private static final Log LOG = LogFactoryUtil.getLog(NodeDeleteAction.class);

    private long nodeId;

    @Override
    public String execute() throws Exception {
        try {
            NodeLocalServiceUtil.deleteNode(nodeId);
            addActionMessage("删除基站成功");
        } catch (Exception e) {
            LOG.error("删除基站失败", e);
            addActionError("删除基站失败");
        }
        return BACK;
    }

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }
}
