<#include "/template/liferaytags/init.ftl">

<a id="${portletNS}refresh-link" href="javascript:Liferay.Portlet.refresh('#p_p_id_8_WAR_monitorportlet_')"
   title="1分钟自动刷新">刷新</a>
<#if playSound>
<div style="display: none">
    <object height="100" width="100" data="${portalURL}/monitor-portlet/audio/warn.mp3"></object>
</div>
</#if>

<@s.url var="patientStatusSearchUrl" action="patientStatusSearch" />

<@aui.form action="${patientStatusSearchUrl}" name="fm" method="post">
    <@aui.input label="住院号" name="mrn" value=mrn inlineField=true />
    <@aui.input label="姓名" name="name" value=mrn inlineField=true />
    <@aui.select name="febrile" label="是否高烧" inlineField=true>
        <@aui.option value="0" label="全部" />
        <@aui.option value="1" label="高烧" />
        <@aui.option value="2" label="正常" />
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
                <@lui.search_container_column_text name="床位编号" orderable=true orderableProperty="bedId">
                    ${bedNo!}
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="住院号" property="mrn" orderable=true orderableProperty="mrn"/>
                <@lui.search_container_column_text name="姓名" property="name" orderable=true orderableProperty="name"/>
                <@lui.search_container_column_text name="1小时内最新体温" orderable=true orderableProperty="temperature">
                    ${latestTemperature}
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="8小时最高体温" orderable=true
                    orderableProperty="temperatureIn8h">
                    ${highestTemperatureIn8h}
                </@lui.search_container_column_text>
                <@s.url var="showTempForTodayUrl" action="showTempForToday" portletUrlType="action">
                    <@s.param name="patientId" value="%{patientId}" />
                </@s.url>
                <@lui.search_container_column_text name="今日">
                    <#if hasTodayRecords>
                        <a href="${showTempForTodayUrl}" target="blank">
                            <img src="${portalURL}/monitor-portlet/images/chart.gif" />
                        </a>
                    <#else>
                        无记录
                    </#if>
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="警告" orderable=true orderableProperty="febrile">
                    <#if febrile>
                        <img src="${portalURL}/monitor-portlet/images/warn.gif" title="体温异常" />
                    </#if>
                    <#if tagMessageException>
                        <img src="${portalURL}/monitor-portlet/images/warn.gif" title="标签异常" />
                    </#if>
                </@lui.search_container_column_text>
                <@lui.search_container_column_text name="标签" property="tagNo" orderable=true
                    orderableProperty="tagNo"/>
                <@lui.search_container_column_text name="注册时间" orderable=true orderableProperty="createDate">
                    ${stack.findString("formatDate(createDate,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>

        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>

<@aui.script>
    jQuery171(document).ready(function() {
        var refresh = setTimeout(function() {
            jQuery171("#${portletNS}refresh-link")[0].click();
        }, 60000);

        jQuery171("#${portletNS}refresh-link").click(
            function () {
                clearTimeout(refresh);
            }
        );
    });
</@aui.script>