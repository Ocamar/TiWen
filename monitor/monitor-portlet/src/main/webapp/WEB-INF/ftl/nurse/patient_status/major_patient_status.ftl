<#include "/template/liferaytags/init.ftl">

<a id="${portletNS}refresh-link" href="javascript:Liferay.Portlet.refresh('#p_p_id_12_WAR_monitorportlet_')"
   title="1分钟自动刷新">刷新</a>

<table width="960" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
<#list patients as patient>
    ${stack.setValue("#request['currentPatient']", patient, false)}
    <@s.set var="currentPatient" value="#attr.currentPatient" />
    <@s.push value="currentPatient">
    <#assign alarmLevel = patient.alarmLevel?int>
    <#if alarmLevel = 1>
        <#assign tdBgcolor = "#DA0000">
    <#elseif alarmLevel = 2>
        <#assign tdBgcolor = "#FFD700">
    <#elseif alarmLevel = 3>
        <#assign tdBgcolor = "#00E00D">
    </#if>
    <#if patient.latestDate lt threeMinutesAgo?datetime>
        <#assign tdBgcolor = "#DA0000">
        <#assign offline = "离线">
    <#else>
        <#assign offline = "">
    </#if>
    <td>
        <table width="240" border="0" cellpadding="0" cellspacing="0" class="lines"
               style="background-color: ${tdBgcolor}">
            <tr height="200">
                <td>
                    <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <tr height="100">
                            <td colspan="2" align="center" class="textbig">
                                <span style="height: 100px">${stack.findString("getBedNo(bedId)")}</span><#if offline?length gt 0><span style="height: 12px;line-height:12px;font-size: 12px;vertical-align: middle; " class="text">${offline!}</span></#if>
                            </td>
                        </tr>
                        <tr height="100">
                            <td height="70" align="left" class="text"
                                style="background-color: ${tdBgcolor};font-size: 20px;font-weight: normal;">
                                <#if patient.name?length gt 5>
                                ${patient.name?substring(0, 5)}...
                                <#else>
                                ${patient.name}
                                </#if>
                            </td>
                            <td align="right" class="text" style="background-color: ${tdBgcolor}">
                                <table width="95" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td width="90" height="50" align="center" class="text"
                                            style="background-color: ${tdBgcolor};font-size: 26px;font-weight: normal;">
                                            ${patient.temperature?string['00.0']}℃
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </td>
    <#if patient_index = 3 || patient_index = 7>
        </tr>
        <tr>
    </#if>
    </@s.push>
</#list>
    </tr>
</table>

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
