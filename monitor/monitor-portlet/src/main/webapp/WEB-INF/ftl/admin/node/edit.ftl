<#include "/template/liferaytags/init.ftl">

<@s.url var="editSaveUrl" action="editSave" portletUrlType="action">
    <@s.param name="nodeId" value=node.nodeId />
</@s.url>


<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=editSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.select name="node.locationId" label="所属病区">
            <#list locations as location>
                <#if location.locationId = node.locationId>
                    <@aui.option value=location.locationId label=location.locationName selected=true />
                <#else>
                    <@aui.option value=location.locationId label=location.locationName />
                </#if>
            </#list>
        </@aui.select>
        <@aui.select name="node.nodeType" label="基站类型">
            <#list nodeTypes as nt>
                <#if nt.nodeType = node.nodeType>
                    <@aui.option value=nt.nodeType label=nt.nodeName selected=true />
                <#else>
                    <@aui.option value=nt.nodeType label=nt.nodeName />
                </#if>
            </#list>
        </@aui.select>
        <@aui.input label="基站编号" name="node.nodeNo" value=node.nodeNo>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='save' />
        <a href="/nodes"><@aui.button value='返回' /></a>
    </@aui.button_row>

</@aui.form>