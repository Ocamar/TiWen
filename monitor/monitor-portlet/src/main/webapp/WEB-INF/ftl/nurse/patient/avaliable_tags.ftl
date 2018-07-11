<#include "/template/liferaytags/init.ftl">

<@s.url var="availableTagSearchUrl" action="availableTagSearch" />

<@aui.form action="${availableTagSearchUrl}" name="fm" method="post">
    <@aui.input label="标签编号" name="tagNo" value=tagNo maxlength="8" inlineField=true />
    <@aui.button name="搜索" type="submit" value="搜索" />

    <@s.actionerror theme="liferay" />
    <@s.actionmessage theme="liferay" />
    <@s.fielderror theme="liferay" />

    <@lui.search_container
        searchContainer=searchContainer
        iteratorURL=searchContainer.iteratorURL
        curParam=searchContainer.curParam
        orderByColParam=searchContainer.orderByColParam
        orderByTypeParam=searchContainer.orderByTypeParam
        deltaParam=searchContainer.deltaParam
        emptyResultsMessage="没有标签">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
            className="com.surwing.model.Tag"
            escapedModel=true
            keyProperty="tagId"
            modelVar="tag"
        >
            ${stack.setValue("#request['currentTag']", tag, false)}
            <@s.set var="currentTag" value="#attr.currentTag" />
            <@s.push value="currentTag">
                <@lui.search_container_column_text name="S/N" property="tagId" orderable=true
                    orderableProperty="tagId"/>

                <@lui.search_container_column_text name="标签编号" property="tagNo" orderable=true
                    orderableProperty="tagNo"/>

                <@lui.search_container_column_text name="选择">
                    <input type="button" id="select" value="使用"
                           onclick="javascript:choose('${tagNo}');"/>
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>
        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>

<script type="text/javascript">
     function choose (tagNo){
         window.opener.document.getElementById("${portletNS}tagNo").value = tagNo;
         window.opener.${portletNS}popup.close();
     };
</script>