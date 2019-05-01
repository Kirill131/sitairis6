<#import "parts/common.ftl" as c>

<@c.page "none">
<form method="post" action="/order/filter">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <h3 style="color: #1e90ff">Поиск заказов по статусу</h3>
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
                    <th scope="col">Время начала</th>
                    <th scope="col">Время окончания</th>
                    <th scope="col">Сумма</th>
                    <th scope="col">Клиент</th>
                    <th scope="col">Мастер</th>
                    <th scope="col">Статус</th>
                    <th scope="col" width="100">Редактирование</th>
                    <th scope="col" width="100">Мастер</th>
                </tr>
                </thead>
                <tbody>
                <#list orders as orders>
                <tr>
                    <td>${orders.timestart}</td>
                    <td>${orders.timefinish}</td>
                    <td>${orders.amount}</td>
                    <td>${orders.id}</td>
                    <td>${orders.idmaster}</td>
                    <td>${orders.status}</td>
                    <td>
                        <form method="get" action="/order/${orders.idorder}">
                            <button type="submit" class="btn btn-secondary">Изменить</button>
                        </form>
                    </td>
                    <td>
                        <form>
                            <label>
                                <select class="combo-box" name="idmaster">
                                    <option value="default"></option>
                            <#list masters as master>
                                <option>${master.idmaster}</option>
                            </#list>
                                </select>
                            </label>
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