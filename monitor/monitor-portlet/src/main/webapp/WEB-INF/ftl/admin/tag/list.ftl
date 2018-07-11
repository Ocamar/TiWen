<#include "/template/liferaytags/init.ftl">

<@s.url var="tagSearchUrl" action="tagSearch" />

<@s.url var="addUrl" action="add" portletUrlType="render">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
<a href="${addUrl}"><@aui.button value='add' /></a>
</@aui.button_row>

<@aui.form action="${tagSearchUrl}" name="fm" method="post">
    <@aui.select name="registered" label="是否注册" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部" />
        <@aui.option value="1" label="已注册" />
        <@aui.option value="2" label="未注册" />
    </@aui.select>

    <@aui.select name="tagType" label="标签类型" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部类型" />
        <#list tagTypes as tt>
            <@aui.option value=tt.tagType label=tt.tagName />
        </#list>
    </@aui.select>

    <@aui.select name="status" label="标签状态" onChange="javascript:document.${portletNS}fm.submit()" inlineField=true>
        <@aui.option value="0" label="全部状态" />
        <#list tagStatuses as ts>
            <@aui.option value=ts.tagStatus label=ts.tagName />
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
        emptyResultsMessage="没有标签">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
            className="com.surwing.model.Tag"
            escapedModel=true
            keyProperty="tagId"
            modelVar="tag"
        >
            ${stack.setValue("#request['currentTag']", tag, false)}
            <@s.set var="currentTag" value="#attr.currentTag" />
            <@s.push value="currentTag">
                <@lui.search_container_column_text name="序号" property="tagId" orderable=true
                    orderableProperty="tagId"/>

                <@lui.search_container_column_text name="标签编号" property="tagNo" orderable=true
                    orderableProperty="tagNo"/>

                <@lui.search_container_column_text name="基站编号" orderable=true orderableProperty="nodeId">
                    ${nodeNo}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="病区名称" orderable=true orderableProperty="locationId">
                    <#if location??>
                    ${location.locationName}
                    </#if>
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="创建时间" orderable=true orderableProperty="createDate">
                    ${stack.findString("formatDate(createDate,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="状态" orderable=true orderableProperty="status">
                    ${statusName}
                </@lui.search_container_column_text>

                <@s.url var="registerUrl" action="register" portletUrlType="render">
                    <@s.param name="tagId" value="%{tagId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteUrl" action="delete" portletUrlType="action">
                    <@s.param name="tagId" value="%{tagId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@lui.search_container_column_text name="操作">
                    <#if tag.locationId = 0>
                    <@lui.icon_menu>
                        <@lui.icon image="edit" message="注册" url=registerUrl />
                    </@lui.icon_menu>
                    <#else>
                    <@lui.icon_menu>
                        <@lui.icon image="edit" message="编辑" url=registerUrl />
                    </@lui.icon_menu>
                    </#if>
                    <@lui.icon_menu>
                        <@lui.icon_delete url=deleteUrl />
                    </@lui.icon_menu>
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>
        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>