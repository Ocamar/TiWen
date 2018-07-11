<#include "/template/liferaytags/init.ftl">

<@s.url var="addSaveUrl" action="addSave" portletUrlType="action">
</@s.url>


<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="标签编号" name="tagNo" maxlength="8" value=tagNo>

        </@aui.input>
        <@aui.select name="locationId" label="所属病区">
            <#list locations as location>
                <@aui.option value=location.locationId label=location.locationName />
            </#list>
        </@aui.select>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='保存' />
        <a href="/all-tags"><@aui.button value='返回' /></a>
    </@aui.button_row>

</@aui.form>