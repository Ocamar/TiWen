<#include "/template/liferaytags/init.ftl">

<@s.url var="addPatientMrnSaveUrl" action="addPatientMrnSave" portletUrlType="action">
    <@s.param name="actionType" value="1" />
</@s.url>

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addPatientMrnSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.fieldset>
        <@aui.input label="住院号" name="mrn" value=mrn>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='下一步' />
    </@aui.button_row>

</@aui.form>