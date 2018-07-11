<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUrl" action="addSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.select name="locationId" label="所属病区">
            <#list locations as location>
                <@aui.option value=location.locationId label=location.locationName />
            </#list>
        </@aui.select>
        <@aui.select name="nodeType" label="基站类型">
            <#list nodeTypes as nt>
                <@aui.option value=nt.nodeType label=nt.nodeName />
            </#list>
        </@aui.select>
        <@aui.input label="基站编号" name="nodeNo" value=nodeNo>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='add' />
    </@aui.button_row>

</@aui.form>