<#include "/template/liferaytags/init.ftl">

<@s.url var="registerSaveUrl" action="registerSave" portletUrlType="action">
    <@s.param name="tagId" value=tagId />
</@s.url>


<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=registerSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="redirect" type="hidden" value=redirect />

    <@aui.fieldset>
        <@aui.input label="标签编号" name="tagNo" value=tagNo readonly=true></@aui.input>
        <@aui.select name="locationId" label="所属病区">
            <#list locations as location>
                <@aui.option value=location.locationId label=location.locationName />
            </#list>
        </@aui.select>
    </@aui.fieldset>

    <@aui.button_row>
        <#if locationId != 0>
            <@aui.button type="submit" value='保存' />
        <#else>
            <@aui.button type="submit" value='注册' />
        </#if>
        <a href="/all-tags"><@aui.button value='返回' /></a>
    </@aui.button_row>

</@aui.form>