<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUrl" action="addSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="床位起始号码" name="fromNo" value=fromNo>
        </@aui.input>
        <@aui.input label="本次添加床位数量" name="count" value=count>
            <@aui.validator name="required" />
            <@aui.validator name="number" />
        </@aui.input>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='保存' />
    </@aui.button_row>

</@aui.form>