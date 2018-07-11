<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUrl" action="addSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="病区编号" name="locationNo" value=locationNo>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="病区名称" name="locationName" value=locationName>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input type="checkbox" label="启用ESB" name="esbEnabled" />
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='add' />
    </@aui.button_row>

</@aui.form>