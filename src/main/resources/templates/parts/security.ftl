<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
    <#assign
    user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    name = user.getUsername()
    <#--isAdmin = user.role()-->
    user_auth = true
    >
<#else>
    <#assign
    name = "unknown"
    isAdmin = false
    user_auth = false
    >
</#if>