<#include "/template/liferaytags/init.ftl">

<@s.url var="addUrl" action="add" portletUrlType="render">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
    <a href="${addUrl}"><@aui.button value='添加床位' /></a>
</@aui.button_row>

<@s.url var="bedSearchUrl" action="bedSearch" />

<@aui.form action="${bedSearchUrl}" name="fm" method="post">
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
        emptyResultsMessage="没有床位">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
            className="com.surwing.model.Bed"
            escapedModel=true
            keyProperty="bedId"
            modelVar="bed"
        >
            ${stack.setValue("#request['currentBed']", bed, false)}
            <@s.set var="currentBed" value="#attr.currentBed" />
            <@s.push value="currentBed">
                <@lui.search_container_column_text name="床位编号" property="bedNo" orderable=true
                    orderableProperty="bedId"/>

                <@lui.search_container_column_text name="床位别称" property="alias" orderable=true
                    orderableProperty="bedId"/>

                <@lui.search_container_column_text name="病区编号" orderable=true orderableProperty="locationId">
                    ${locationNo}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="病区名称" orderable=true orderableProperty="locationId">
                    ${locationName}
                </@lui.search_container_column_text>

                <@s.url var="editUrl" action="edit" portletUrlType="render">
                    <@s.param name="bedId" value="%{bedId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteUrl" action="delete" portletUrlType="action">
                    <@s.param name="bedId" value="%{bedId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@lui.search_container_column_text name="操作">
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