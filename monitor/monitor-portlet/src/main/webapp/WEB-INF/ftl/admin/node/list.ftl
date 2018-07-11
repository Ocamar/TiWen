<#include "/template/liferaytags/init.ftl">

<@s.url var="addUrl" action="add" portletUrlType="render">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
    <a href="${addUrl}"><@aui.button value='add' /></a>
</@aui.button_row>

<@s.url var="nodeSearchUrl" action="nodeSearch" />

<@aui.form action="${nodeSearchUrl}" name="fm" method="post">
    <@aui.select name="nodeType" label="基站类型" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部类型" />
        <#list nodeTypes as nt>
            <@aui.option value=nt.nodeType label=nt.nodeName />
        </#list>
    </@aui.select>

    <@aui.select name="locationId" label="病区" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部病区" />
        <#list locations as location>
            <@aui.option value=location.locationId label=location.locationName />
        </#list>
    </@aui.select>

    <@aui.select name="status" label="状态" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部状态" />
        <#list allStatus as status>
            <@aui.option value=status.nodeStatus label=status.statusName />
        </#list>
    </@aui.select>

    <@s.actionerror theme="liferay" />
    <@s.actionmessage theme="liferay" />
    <@s.fielderror theme="liferay" />

    <@lui.search_container
    searchContainer=searchContainer
    iteratorURL=searchContainer.iteratorURL
    curParam=searchContainer.curParam
    orderByColParam=searchContainer.orderByColParam
    orderByTypeParam=searchContainer.orderByTypeParam
    deltaParam=searchContainer.deltaParam
    emptyResultsMessage="没有基站">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
        className="com.surwing.model.Node"
        escapedModel=true
        keyProperty="nodeId"
        modelVar="node"
        >
        ${stack.setValue("#request['currentNode']", node, false)}
            <@s.set var="currentNode" value="#attr.currentNode" />
            <@s.push value="currentNode">
                <@lui.search_container_column_text name="序号" property="nodeId" orderable=true
                orderableProperty="nodeId"/>

                <@lui.search_container_column_text name="基站编号" property="nodeNo" orderable=true
                orderableProperty="nodeNo"/>

                <@lui.search_container_column_text name="基站类型" orderable=true orderableProperty="nodeType">
                ${nodeTypeName}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="IP地址" property="ip" orderable=true orderableProperty="ip"/>

                <@lui.search_container_column_text name="病区名称" orderable=true orderableProperty="locationId">
                ${locationName}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="最后通信时间" orderable=true
                orderableProperty="lastReceivedTime">
                ${stack.findString("formatDate(lastReceivedTime,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="最后传送消息时间" orderable=true
                orderableProperty="lastTransmitTime">
                ${stack.findString("formatDate(lastTransmitTime,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="状态" orderable=true orderableProperty="status">
                ${statusName}
                </@lui.search_container_column_text>

                <@s.url var="editUrl" action="edit" portletUrlType="render">
                    <@s.param name="nodeId" value="%{nodeId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteUrl" action="delete" portletUrlType="action">
                    <@s.param name="nodeId" value="%{nodeId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@lui.search_container_column_text
                name="操作"
                >
                    <@lui.icon_menu>
                        <@lui.icon image="edit" url=editUrl />
                    </@lui.icon_menu>
                    <@lui.icon_menu>
                        <@lui.icon_delete url=deleteUrl />
                    </@lui.icon_menu>
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>
        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>