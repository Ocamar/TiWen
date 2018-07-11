<#include "/template/liferaytags/init.ftl">

<@s.url var="addUrl" action="add" portletUrlType="render">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
    <a href="${addUrl}"><@aui.button value='add' /></a>
</@aui.button_row>

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@s.url var="locationSearchUrl" action="locationSearch" />

<@aui.form action="${locationSearchUrl}" name="fm" method="post">
    <@aui.input label="病区编号" name="locationNo" value=locationNo inlineField=true />
    <@aui.input label="病区名称" name="locationName" value=locationName inlineField=true />
    <@aui.button name="搜索" type="submit" value="搜索" />

    <@lui.search_container
        searchContainer=searchContainer
        iteratorURL=searchContainer.iteratorURL
        curParam=searchContainer.curParam
        orderByColParam=searchContainer.orderByColParam
        orderByTypeParam=searchContainer.orderByTypeParam
        deltaParam=searchContainer.deltaParam
        emptyResultsMessage="没有病区">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
            className="com.surwing.model.Location"
            escapedModel=true
            keyProperty="locationId"
            modelVar="loc"
        >
            ${stack.setValue("#request['currentLocation']", loc, false)}
            <@s.set var="currentLocation" value="#attr.currentLocation" />
            <@s.push value="currentLocation">
                <@lui.search_container_column_text name="病区编号" property="locationNo" orderable=true
                    orderableProperty="locationNo" />
                <@lui.search_container_column_text name="病区名称" property="locationName" orderable=true
                    orderableProperty="locationName" />
                <@lui.search_container_column_text name="启用ESB" property="esbEnabled" orderable=true
                    orderableProperty="esbEnabled" />

                <@s.url var="editUrl" action="edit" portletUrlType="render">
                    <@s.param name="locationId" value="%{locationId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteUrl" action="delete" portletUrlType="action">
                    <@s.param name="locationId" value="%{locationId}" />
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