<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUrl" action="addSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="名称" name="name" value=name>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="键" name="key" value=key>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="值" name="value" value=value>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="说明" name="remark" value=remark>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='add' />
    </@aui.button_row>

</@aui.form>