<#include "/template/liferaytags/init.ftl">

<@s.url var="changePasswordSaveUrl" action="changePasswordSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=changePasswordSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />
    <@aui.input name="uid" type="hidden" value=uid />

    <@aui.fieldset>
        <@aui.input label="用户ID" name="screenName" value=screenName disabled=true>
        </@aui.input>

        <@aui.input label="密码" name="password" value=password>
            <@aui.validator name="required" />
        </@aui.input>

        <@aui.input label="确认密码" name="confirmPassword" value=confirmPassword>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='edit' />
    </@aui.button_row>

</@aui.form>