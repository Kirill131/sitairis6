<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<div>
    <@l.logout />
</div>

<a href="/admin"> ADMIN </a>

<div>Список сообщений</div>
<#list users as user>
    <div>
        <b>${user.id}</b>
        <b>${user.FIO}</b>
        <b>${user.phone}</b>
        <b>${user.email}</b>
    </div>
<#else>
No clients!
</#list>
</@c.page>