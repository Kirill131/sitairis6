<#import "parts/common.ftl" as c>

<@c.page "none">
<div>
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="text" name="fIO" placeholder="ФИО">
        <input type="text" name="date_of_birth" placeholder="Дата рождения">
        <input type="number" name="category" placeholder="Категория">
        <input type="number" name="profile" placeholder="Профиль">
        <input type="text" name="year_start_working" placeholder="Год приема на работу">
        <button class="button" type="submit">Добавить</button>
    </form>
</div>
<form method="post" action="/master/filter">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="text" name="filter">
    <button class="button" type="submit">Поиск</button>
</form>
<div class="wrapper">
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <div style="padding-top: 57px">
            <table class="table table-bordered">
                <thead>
                <tr>
                <#--<th scope="col"><input type="checkbox" class="custom-control-input chk-all" name="master"></th>-->
                    <th scope="col">ФИО</th>
                    <th scope="col">Дата рождения</th>
                    <th scope="col">Категория</th>
                    <th scope="col">Профиль</th>
                    <th scope="col">Год начала работы</th>
                </tr>
                </thead>
                <tbody>
                <#list masters as master>
                <tr>
                <#--<th><input type="checkbox" class="custom-control-input" name="master" value="${ user.id }"></th>-->
                    <td>${master.fIO}</td>
                    <td>${master.date_of_birth}</td>
                    <td>${master.category}</td>
                    <td>${master.profile}</td>
                    <td>${master.year_start_working}</td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </form>
</div>
</@c.page>