<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUserUrl" action="addSaveUser" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUserUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="登录名" name="screenName" value=screenName>
            <@aui.validator name="required" />
        </@aui.input>

        <@aui.input label="姓名" name="firstName" value=firstName>
            <@aui.validator name="required" />
        </@aui.input>

        <@aui.input label="密码" name="password" value=password>
            <@aui.validator name="required" />
        </@aui.input>

        <@aui.input label="确认密码" name="confirmPassword" value=confirmPassword>
            <@aui.validator name="required" />
        </@aui.input>

        <@aui.select name="locationId" label="所属病区">
            <@aui.option value=0 label='选择默认病区' />
            <#list locations as location>
                <@aui.option value=location.locationId label=location.locationName />
            </#list>
        </@aui.select>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='add' />
    </@aui.button_row>

</@aui.form>