<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Spring Security Example </title>
</head>
<body>
Add info about new client!

<#if message??>
        ${message}
</#if>

<form action="/registrationClientInfo" method="post">
    <div><label> Full name : <input type="text" name="FIO"/> </label></div>
    <div><label> Phone : <input type="tel" name="phone"/> </label></div>
    <div><label> Email : <input type="email" name="email"/> </label></div>
    <input type="hidden" name="_csrf" value="{{_csrf.token}}">
    <div><input type="submit" value="Sign In"/></div>
</form>
</body>
</html>