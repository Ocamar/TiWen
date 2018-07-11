<#include "/template/liferaytags/init.ftl">

<@sse.importstatic value="com.liferay.portal.kernel.portlet.LiferayWindowState" />

<@s.url var="addPatientSaveUrl" action="addPatientSave" portletUrlType="action" />

<@s.actionerror theme="liferay" />
<@s.actionmessage theme="liferay" />
<@s.fielderror theme="liferay" />

<@aui.form action=addPatientSaveUrl cssClass="lfr-dynamic-form" method="post" name="fm">
    <@aui.input name="actionType" type="hidden" value=actionType />
    <@aui.fieldset>
        <@aui.input label="住院号" name="mrn" value=mrn readonly=true>
        </@aui.input>
        <@aui.input label="姓名" name="name" value=name>
            <@aui.validator name="required" />
        </@aui.input>
        <#if actionType = 1 || actionType = 2>
        <div>
        <#else>
        <div style="display: none">
        </#if>
        <#if userDefaultLocation??>
            <@aui.input label="病区" name="locationName" value=userDefaultLocation.locationName disabled=true />
            <@aui.input name="locationId" type="hidden" value=userDefaultLocation.locationId />
            <@aui.select name="bedId" label="床位">
                <#if bedId gt 0>
                    <@aui.option value=bedId label=bedNo selected=true />
                </#if>
                <#list beds as bed>
                    <@aui.option value=bed.bedId label=bed.bedNo />
                </#list>
            </@aui.select>
        <#else>
            请管理员为您设置默认病区
        </#if>
        <#if !esbEnabled>
        <@aui.field_wrapper label="性别" required=true>
            <#if gender = 0>
                <@aui.input label="男" inlineLabel="right" inlineField=true name="gender" type="radio" checked=true
                    value="0" />
                <@aui.input label="女" inlineLabel="right" inlineField=true name="gender" type="radio" value="1" />
            <#else>
                <@aui.input label="男" inlineLabel="right" inlineField=true name="gender" type="radio" value="0" />
                <@aui.input label="女" inlineLabel="right" inlineField=true name="gender" type="radio" checked=true
                    value="1" />
            </#if>
        </@aui.field_wrapper>
        </#if>
        <@aui.input label="入院日期(yyyy-mm-dd)" name="birthday" value=birthday>
        </@aui.input>
        <@aui.input label="最低体温" name="minTemperature" value=minTemperature>
            <@aui.validator name="required" />
        </@aui.input>
        <@aui.input label="最高体温" name="maxTemperature" value=maxTemperature>
            <@aui.validator name="required" />
        </@aui.input>
        </div>
        <#if actionType = 3 || actionType = 1>
        <div>
        <#else>
        <div style="display: none">
        </#if>

        <span class="aui-field-row">
			<@portlet.renderURL windowState="${LiferayWindowState.POP_UP}" var="selectTagURL">
                <@portlet.param name="struts.portlet.action" value="/patient/availableTagSearch" />
            </@portlet.renderURL>
			<@aui.input id="tagNo" cssClass="lfr-input-text-container" inlineField=true label="标签编号"
                name="tagNo" value=tagNo size="55" type="text" maxlength="8"/>
	        <#assign data={'DocumentlibraryUrl':selectTagURL}>
	        <@aui.button id="${portletNS}selectTag" cssClass="journal-documentlibrary-button" inlineField=true
                data=data value="select" />
		</span>
        </div>
    </@aui.fieldset>

    <@aui.button_row>
        <#if actionType = 1>
        <@aui.button type="submit" value='添加' />
        <#elseif actionType = 2>
        <@aui.button type="submit" value='修改' />
        <#else>
        <@aui.button type="submit" value='更换' />
        </#if>
    </@aui.button_row>

</@aui.form>

<script type="text/javascript">
    var ${portletNS}popup;
    jQuery171(document).ready(
            function() {
                jQuery171('#${portletNS}selectTag').click(function() {
                    ${portletNS}popup = window.open(jQuery171("#${portletNS}selectTag").attr('data-documentlibraryurl'),
                                                    '选择标签',
                                                    'directories=no,height=640,location=no,menubar=no,resizable=yes,' +
                                                    'scrollbars=yes,status=no,toolbar=no,width=980');
                    ${portletNS}popup.focus();
                });
    });
</script>