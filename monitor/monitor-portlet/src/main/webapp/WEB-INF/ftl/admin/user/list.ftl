<#include "/template/liferaytags/init.ftl">

<@s.url var="userSearchUrl" action="userSearch" />

<@s.url var="addUserUrl" action="addUser">
    <@s.param name="redirect" value="%{currentURL}" />
</@s.url>

<@aui.button_row>
    <a href="${addUserUrl}"><@aui.button value='add' /></a>
</@aui.button_row>

<@aui.form action="${userSearchUrl}" name="fm" method="post">
    <@aui.input label="登录名" name="screenName" value=screenName inlineField=true />
    <@aui.input label="姓名" name="firstName" value=firstName inlineField=true />
    <@aui.button name="搜索" type="submit" value="搜索" />
    <@aui.button name="清除" type="reset" value="清除" />

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
    emptyResultsMessage="没有用户">
        <@lui.search_container_results results=searchContainer.results total=searchContainer.total />
        <@lui.search_container_row
        className="com.liferay.portal.model.User"
        escapedModel=true
        keyProperty="userId"
        modelVar="user"
        >
        ${stack.setValue("#request['currentUser']", user, false)}
            <@s.set var="currentUser" value="#attr.currentUser" />
            <@s.push value="currentUser">
                <@lui.search_container_column_text name="登录名" property="screenName" orderable=true
                    orderableProperty="screenName" />

                <@lui.search_container_column_text name="姓名" property="firstName" orderable=true
                    orderableProperty="firstName"/>

                <@lui.search_container_column_text name="用户角色">
                    ${roleNames}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="默认病区">
                    ${locationName}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="创建时间" orderable=true orderableProperty="createDate">
                    ${stack.findString("formatDate(createDate,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>

                <@lui.search_container_column_text name="修改时间" orderable=true orderableProperty="modifiedDate">
                    ${stack.findString("formatDate(modifiedDate,'yyyy-MM-dd HH:mm:ss')")}
                </@lui.search_container_column_text>

                <@s.url var="addAdminRoleUrl" action="addAdminRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="addNurseRoleUrl" action="addNurseRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="addHeadNurseRoleUrl" action="addHeadNurseRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteAdminRoleUrl" action="deleteAdminRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteNurseRoleUrl" action="deleteNurseRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="deleteHeadNurseRoleUrl" action="deleteHeadNurseRole" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="changePasswordUrl" action="changePassword" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@s.url var="editUserUrl" action="editUser" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>
                <@s.url var="deleteUserUrl" action="deleteUser" portletUrlType="action">
                    <@s.param name="uid" value="%{userId}" />
                    <@s.param name="redirect" value="%{currentURL}" />
                </@s.url>

                <@lui.search_container_column_text
                name="操作"
                >
                    <#if notDefaultAdmin>
                    <@lui.icon_menu message="角色管理">
                        <#if admin>
                            <@lui.icon url=deleteAdminRoleUrl message="取消管理员角色" />
                        <#else>
                            <@lui.icon url=addAdminRoleUrl message="设置为管理员" />
                        </#if>
                        <#if nurse>
                            <@lui.icon url=deleteNurseRoleUrl message="取消护士角色" />
                        <#else>
                            <@lui.icon url=addNurseRoleUrl message="设置为护士" />
                        </#if>
                        <#if headNurse>
                            <@lui.icon url=deleteHeadNurseRoleUrl message="取消护士长角色" />
                        <#else>
                            <@lui.icon url=addHeadNurseRoleUrl message="设置为护士长" />
                        </#if>
                    </@lui.icon_menu>
                    </#if>
                    <@lui.icon_menu message="信息管理">
                        <@lui.icon message="修改信息" url=editUserUrl />
                        <@lui.icon message="修改密码" url=changePasswordUrl />
                    </@lui.icon_menu>
                    <#if screenName != 'admin'>
                    <@lui.icon_menu>
                        <@lui.icon_delete url=deleteUserUrl />
                    </@lui.icon_menu>
                    </#if>
                </@lui.search_container_column_text>
            </@s.push>
        </@lui.search_container_row>

        <@lui.search_iterator />
    </@lui.search_container>

</@aui.form>