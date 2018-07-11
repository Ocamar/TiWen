<#include "/template/liferaytags/init.ftl">

<@s.url var="editSaveUrl" action="editSave" portletUrlType="action" >
    <@s.param name="locationId" value=loc.locationId />
</@s.url>

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=editSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="病区编号" name="loc.locationNo" value=loc.locationNo>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="病区名称" name="loc.locationName" value=loc.locationName>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input type="checkbox" label="启用ESB" name="loc.esbEnabled" value=loc.esbEnabled />
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='button.save' />
    </@aui.button_row>

</@aui.form>