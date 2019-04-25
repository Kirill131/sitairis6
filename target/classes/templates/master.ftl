<#import "parts/common.ftl" as c>

<@c.page "none">
<div>
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <h3 style="color: #1e90ff">Добаление мастера</h3>
        <input type="text" name="fIO" placeholder="ФИО">
        <input type="text" name="date_of_birth" placeholder="Дата рождения">
        <input type="number" name="category" placeholder="Категория">
        <input type="number" name="profile" placeholder="Профиль">
        <input type="text" name="year_start_working" placeholder="Год приема на работу">
        <button class="btn btn-outline-primary" type="submit">Добавить</button>
    </form>
</div>
<form method="post" action="/master/filter">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <h3 style="color: #1e90ff">Поиск мастеров по категориям</h3>
    <input type="text" name="filter">
    <button class="btn btn-outline-primary" type="submit">Поиск</button>
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
                    <th scope="col" width="100">Уволнение</th>
                    <th scope="col" width="100">Редактирование</th>
                </tr>
                </thead>
                <tbody>
                <#list masters as master>
                <tr>
                    <td>${master.fIO}</td>
                    <td>${master.date_of_birth}</td>
                    <td>${master.category}</td>
                    <td>${master.profile}</td>
                    <td>${master.year_start_working}</td>
                    <td>
                        <form method="post" action="/master/deleteMaster">
                            <input type="hidden" value="${master.idmaster}" name="masterId">
                            <input type="hidden" value="${_csrf.token}" name="_csrf">
                            <button class="btn btn-danger" type="submit">Уволить</button>
                        </form>
                    </td>
                    <td>
                        <form method="get" action="/master/${master.idmaster}">
                            <button type="submit" class="btn btn-secondary">Изменить</button>
                            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                        </form>
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </form>
</div>
</@c.page>