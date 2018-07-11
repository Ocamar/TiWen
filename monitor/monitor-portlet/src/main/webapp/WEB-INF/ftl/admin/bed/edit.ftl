<#include "/template/liferaytags/init.ftl">

<@s.url var="editSaveUrl" action="editSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=editSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />
    <@aui.input name="bedId" type="hidden" value=bedId />

    <@aui.fieldset>
        <@aui.input label="床位编号" name="bedNo" value=bedNo readonly=true>
        </@aui.input>
        <@aui.input label="床位别称" name="alias" value=alias>
            <@aui.validator name="required" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='保存' />
    </@aui.button_row>

</@aui.form>