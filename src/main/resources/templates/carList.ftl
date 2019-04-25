<#import "parts/common.ftl" as c>

<@c.page "none">
<#--TEST message!!!-->

<div>
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <h3 style="color: #1e90ff">Добаление авто</h3>
        <input type="text" name="carname" placeholder="Название: Opel Astra">
        <input type="text" name="year" placeholder="Год выпуска">
        <input type="number" name="value_engine" placeholder="Объём двигателя">
        <input type="text" name="type_engine" placeholder="Тип топлива">
        <input type="text" name="statenumber" placeholder="Гос.номер">
        <input type="text" name="vincode" placeholder="Vin код">
        <button class="btn btn-outline-primary" type="submit">Добавить</button>
    </form>
</div>

<form method="post" action="/car/filter">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <h3 style="color: #1e90ff">Поиск авто по vin</h3>
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
                    <th scope="col">Id_машины</th>
                    <th scope="col">Машина</th>
                    <th scope="col">Год выпуска</th>
                    <th scope="col">Объём двигателя</th>
                    <th scope="col">Тип топлива</th>
                    <th scope="col">Гос. номер</th>
                    <th scope="col">VIN</th>
                    <th scope="col" width="100">Удалить</th>
                    <th scope="col" width="100">Редактировать</th>
                </tr>
                </thead>
                <tbody>
                <#list cars as car>
                <tr>
                    <td>${car.idcar}</td>
                    <td>${car.carname}</td>
                    <td>${car.year}</td>
                    <td>${car.value_engine}</td>
                    <td>${car.type_engine}</td>
                    <td>${car.statenumber}</td>
                    <td>${car.vincode}</td>
                    <td>
                        <form method="post" action="/carlist/deleteCar">
                            <input type="hidden" value="${car.idcar}" name="idcar">
                            <input type="hidden" value="${_csrf.token}" name="_csrf">
                            <button class="btn btn-danger" type="submit">Удалить</button>
                        </form>
                    </td>
                    <td>
                        <form method="get" action="/carlist/${car.idcar}">
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