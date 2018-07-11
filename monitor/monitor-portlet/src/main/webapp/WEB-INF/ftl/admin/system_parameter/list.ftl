<#include "/template/liferaytags/init.ftl">

<style>
    .aui .control-group {
        margin: 0;
    }
</style>

<@s.url var="editUrl" action="edit" portletUrlType="action">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.form action="${editUrl}" name="fm" method="post">
    <@s.actionerror theme="liferay" />
    <@s.actionmessage theme="liferay" />
    <@s.fielderror theme="liferay" />

    <@aui.fieldset label="报警设置">
        <table>
            <tr>
                <td>体温音频报警</td>
                <td>
                    <#if temperatureAudioAlarm>
                        <@aui.input label="开启" inlineLabel="right" inlineField=true name="temperatureAudioAlarm"
                            type="radio" checked=true value="true" />
                        <@aui.input label="关闭" inlineLabel="right" inlineField=true name="temperatureAudioAlarm"
                            type="radio" value="false" />
                    <#else>
                        <@aui.input label="开启" inlineLabel="right" inlineField=true name="temperatureAudioAlarm"
                            type="radio" value="true" />
                        <@aui.input label="关闭" inlineLabel="right" inlineField=true name="temperatureAudioAlarm"
                            type="radio" checked=true value="false" />
                    </#if>
                </td>
            </tr>
            <tr>
                <td>标签超时报警时间(分钟)</td>
                <td>
                    <@aui.input type="text" label="" name="tagTimeOut" value=tagTimeOut /></td>
                </td>
            </tr>
        </table>
    </@aui.fieldset>

    <@aui.fieldset label="病人体温">
    <table>
        <tr>
            <td>病人默认最低体温</td>
            <td><@aui.input type="text" label="" name="patientDefaultMinTemp" value=patientDefaultMinTemp /></td>
        </tr>
        <tr>
            <td>病人默认最高体温</td>
            <td><@aui.input type="text" label="" name="patientDefaultMaxTemp" value=patientDefaultMaxTemp /></td>
        </tr>
    </table>
    </@aui.fieldset>

    <@aui.fieldset label="病人体温报警设置">
    <table>
        <tr>
            <td>红色报警温度范围</td>
            <td><@aui.input type="text" label="小于此值" name="redLevelTempRangeMin" value=redLevelTempRangeMin /></td>
            <td>或</td>
            <td><@aui.input type="text" label="大于此值" name="redLevelTempRangeMax" value=redLevelTempRangeMax /></td>
        </tr>
        <tr>
            <td>橙色报警温度范围</td>
            <td>
                <@aui.input type="text" label="小于此值" name="orangeLevelTempRangeMin" value=orangeLevelTempRangeMin />
            </td>
            <td>或</td>
            <td>
                <@aui.input type="text" label="大于此值" name="orangeLevelTempRangeMax" value=orangeLevelTempRangeMax />
            </td>
        </tr>
        <tr>
            <td>绿色报警温度范围</td>
            <td colspan="3">
                在橙色报警温度中的最小温度和最大温度之间的温度，显示为绿色
            </td>
        </tr>
    </table>
    </@aui.fieldset>

    <@aui.button_row>
        <@aui.button type="submit" value='保存' />
        <a href="/system-parameter"><@aui.button value='返回' /></a>
    </@aui.button_row>

</@aui.form>