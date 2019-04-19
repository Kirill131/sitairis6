<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
<<<<<<< HEAD
    <a class="navbar-brand" href="/">СТО</a>
=======
    <a class="navbar-brand" href="/">Sweater</a>
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
<<<<<<< HEAD
            <#--<li class="nav-item">-->
                <#--<a class="nav-link" href="/">Home</a>-->
            <#--</li>-->
            <li class="nav-item">
                <a class="nav-link" href="/master">Мастера</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user">Пользователи</a>
=======
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/main">Messages</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user">user list</a>
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
            </li>
        </ul>

        <#--<div class="navbar-text mr-3">${name}</div>-->
        <@l.logout />
    </div>
</nav>