<#include "/template/liferaytags/init.ftl">

<@s.url var="editUserSaveUrl" action="editUserSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=editUserSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />
    <@aui.input name="uid" type="hidden" value=uid />

    <@aui.fieldset>
        <@aui.input label="登录名" name="screenName" value=screenName disabled=true>
        </@aui.input>

        <@aui.input label="姓名" name="firstName" value=firstName>
            <@aui.validator name="required" />
        </@aui.input>

        <#if !admin>
        <@aui.select name="locationId" label="所属病区">
            <@aui.option value=0 label='选择默认病区' />
            <#list locations as location>
                <#if location.locationId = locationId>
                    <@aui.option value=location.locationId label=location.locationName selected=true />
                <#else>
                    <@aui.option value=location.locationId label=location.locationName />
                </#if>
            </#list>
        </@aui.select>
        </#if>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='edit' />
    </@aui.button_row>

</@aui.form>