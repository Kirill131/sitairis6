<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page "none">
Add new user!
${message}

<@l.login "/registration" true/>
<a href="/registrationClientInfo">Add new user</a>
</@c.page>

