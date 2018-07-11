package com.surwing.job;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.surwing.service.NodeLocalServiceUtil;

/**
 * @author zhaiyz
 */
public class NodeStatusCheckJob extends MonitorBaseMessageListener {

    private static final Log LOG = LogFactoryUtil.getLog(NodeStatusCheckJob.class);

    @Override
    protected void doJob(long companyId) throws Exception {
        LOG.info("检查基站状态任务开始");
        NodeLocalServiceUtil.updateNodeStatusToTimeout();
        LOG.info("检查基站状态任务结束");
    }
}
