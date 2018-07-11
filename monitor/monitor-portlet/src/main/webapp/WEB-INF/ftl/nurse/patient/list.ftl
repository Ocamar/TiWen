<#include "/template/liferaytags/init.ftl">

<@s.url var="addPatientMrnUrl" action="addPatientMrn" portletUrlType="render">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
    <a href="${addPatientMrnUrl}"><@aui.button value='病人注册' /></a>
</@aui.button_row>

<@s.url var="patientSearchUrl" action="patientSearch" />

<@aui.form action="${patientSearchUrl}" name="fm" method="post">
    <@aui.input label="住院号" name="mrn" value=mrn inlineField=true />
    <@aui.input label="标签" name="tagNo" value=tagNo inlineField=true />
    <@aui.select name="dischargeStatus" label="是否住院" inlineField=true>
        <@aui.option value="0" label="全部" />
        <@aui.option value="1" label="在住院" />
        <@aui.option value="2" label="已出院" />
    </@aui.select>
    <@aui.button name="搜索" type="submit" value="搜索" />

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
        emptyResultsMessage="没有病人">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
            className="com.surwing.model.Patient"
            escapedModel=true
            keyProperty="patientId"
            modelVar="patient"
        >
            ${stack.setValue("#request['currentPatient']", patient, false)}
            <@s.set var="currentPatient" value="#attr.currentPatient" />
            <@s.push value="currentPatient">
                <@lui.search_container_column_text name="住院号" property="mrn" orderable=true orderableProperty="mrn"/>
                <@lui.search_container_column_text name="姓名" property="name" orderable=true orderableProperty="name"/>
                <@lui.search_container_column_text name="病区名称" orderable=true orderableProperty="locationId">
                    ${locationName!}
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="床位编号" orderable=true orderableProperty="bedId">
                    ${bedNo!}
                </@lui.search_container_column_text>
                <#if !esbEnabled>
                <@lui.search_container_column_text name="性别" orderable=true orderableProperty="gender">
                    ${genderName!}
                </@lui.search_container_column_text>
                </#if>
                <@lui.search_container_column_text name="入院日期" orderable=true orderableProperty="birthday">
                    ${stack.findString("formatDate(birthday, 'yyyy-MM-dd')")}
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="最小体温" property="minTemperature" orderable=true
                    orderableProperty="minTemperature"/>
                <@lui.search_container_column_text name="最大体温" property="maxTemperature" orderable=true
                orderableProperty="maxTemperature"/>
                <@lui.search_container_column_text name="标签" property="tagNo" orderable=true
                    orderableProperty="tagNo"/>

                <@s.url var="unRegisterUrl" action="unRegister" portletUrlType="action">
                    <@s.param name="patientId" value="%{patientId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="addPatientMrnSaveUrl" action="addPatientMrnSave" portletUrlType="action">
                    <@s.param name="mrn" value="%{mrn}" />
                    <@s.param name="actionType" value="3" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>
                <@s.url var="addPatientMrnSaveEditUrl" action="addPatientMrnSave" portletUrlType="action">
                    <@s.param name="mrn" value="%{mrn}" />
                    <@s.param name="actionType" value="2" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>
                <@s.url var="dischargeUrl" action="discharge" portletUrlType="action">
                    <@s.param name="patientId" value="%{patientId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>
                <@s.url var="deleteUrl" action="delete" portletUrlType="action">
                    <@s.param name="patientId" value="%{patientId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@lui.search_container_column_text
                    name="操作"
                >
                    <#if !discharge>
                    <@lui.icon_menu>
                        <@lui.icon message="修改" url=addPatientMrnSaveEditUrl />
                    </@lui.icon_menu>
                    <@lui.icon_menu>
                        <#if tagNo != ''>
                        <@lui.icon message="更换" url=addPatientMrnSaveUrl />
                        <#else>
                            <@lui.icon message="绑定" url=addPatientMrnSaveUrl />
                        </#if>
                    </@lui.icon_menu>
                    <#if tagNo != ''>
                    <@lui.icon_menu>
                        <@lui.icon message="注销" url=unRegisterUrl />
                    </@lui.icon_menu>
                    </#if>
                    <@lui.icon_menu>
                        <@lui.icon message="出院" url=dischargeUrl />
                    </@lui.icon_menu>
                    </#if>
                    <@lui.icon_menu>
                        <@lui.icon_delete message="删除" url=deleteUrl />
                    </@lui.icon_menu>
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>

        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>