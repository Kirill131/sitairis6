<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page "none">

<div class="row">

    <div class="col-lg-6 new-col-lg-6">
            <div class="panel panel-default" style="margin-top:45px">
                <div class="panel-heading">
                    <h3 class="panel-title">Записаться на СТО</h3>
                </div>
                <div class="panel-body">
                    <form method="post">
                        <input name="${_csrf.parameterName}" value="${_csrf.token}" type="hidden">

                           <table>
                               <tbody>
                                   <tr style="margin-bottom: 20px">
                                       <td>
                                           <table>
                                               <tbody>
                                               <tr>
                                                   <td>
                                                       <input type="text" class="form-control" id="marka" placeholder="Марка"
                                                              name="marka">

                                                   </td>
                                                   <td>
                                                       <input type="text" class="form-control" id="model" placeholder="Модель"
                                                              name="model">
                                                   </td>
                                                   <td>
                                                       <input type="text" class="form-control" id="year" placeholder="Год выпуска"
                                                       name="year">
                                                   </td>
                                               </tr>
                                               </tbody>
                                           </table>
                                       </td>
                                   </tr>
                                   <tr style="margin-bottom: 20px">
                                       <td>
                                           <table>
                                               <tbody>
                                               <tr>
                                                   <td>
                                                       <input type="text" class="form-control" id="type_engine" placeholder="Тип двигателя"
                                                              name="type_engine">
                                                   </td>
                                                   <td>
                                                       <input type="text" class="form-control" id="value" placeholder="Например 1.6"
                                                              name="value">
                                                   </td>
                                               </tr>
                                               </tbody>
                                           </table>
                                       </td>
                                   </tr style="margin-bottom: 20px">
                                   <tr>
                                       <td>
                                           <table>
                                               <tbody>
                                               <tr>
                                                   <td>
                                                       <input type="text" class="form-control" id="vin" placeholder="VIN-код"
                                                              name="vin">
                                                   </td>
                                                   <td>
                                                       <input type="text" class="form-control" id="number" placeholder="Гос.номер"
                                                              name="number">
                                                   </td>
                                               </tr>
                                               </tbody>
                                           </table>
                                       </td>
                                   </tr>
                               </tbody>
                           </table>

                        <input id="datepicker" name="date" width="276" placeholder="Выбор даты"/>
                        <script>
                            $('#datepicker').datepicker({
                                uiLibrary: 'bootstrap4'
                            });
                        </script>

                        <button type="submit" class="btn btn-default" style="margin-left: 35%;margin-right: 20%">Регистрация</button>
                    <#--<a href="registration"></a>-->
                    </form>
                </div>
            </div>

    </div>

    <div class="col-lg-6 new-col-lg-6">
        Это написано слева!
    </div>
</div>
    <#--<input id="timepicker" width="276" />-->
    <#--<script>-->
        <#--$('#timepicker').timepicker({-->
            <#--uiLibrary: 'bootstrap4'-->
        <#--});-->
    <#--</script>-->


    <#--<div class="row">-->

        <#--<div class="col-lg-3 new-col-lg-3">-->
            <#--<div class="product-item">-->
                <#--<div>-->
                    <#--<img src="/static/diagnostic.png" class="img-resp">-->
                <#--</div>-->
                <#--<h4><a class="text-in_block"> Диагностика авто </a></h4>-->
                <#--<div class="add-to-card-btn">-->
                    <#--<a href="../more/about.html#opyt" class="btn btn-danger text-font">-->
                        <#--Подробнее-->
                    <#--</a>-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->

        <#--<div class="col-lg-3 new-col-lg-3">-->
            <#--<div class="product-item">-->
                <#--<div>-->
                    <#--<img src="/static/repair.png" class="img-resp">-->
                <#--</div>-->
                <#--<h4><a class="text-in_block"> Любой ремонт </a></h4>-->
                <#--<div class="add-to-card-btn">-->
                    <#--<a href="../more/about.html#garantiya" class="btn btn-danger text-font">-->
                        <#--Подробнее-->
                    <#--</a>-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->

        <#--<div class="col-lg-3 new-col-lg-3">-->
            <#--<div class="product-item">-->
                <#--<div>-->
                    <#--<img src="/static/look.jpg" class="img-resp">-->
                <#--</div>-->
                <#--<h4><a class="text-in_block"> Внешний вид </a></h4>-->
                <#--<div class="add-to-card-btn">-->
                    <#--<a href="../more/about.html#skidki" class="btn btn-danger text-font">-->
                        <#--Подробнее-->
                    <#--</a>-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->

        <#--<div class="col-lg-3 new-col-lg-3">-->
            <#--<div class="product-item">-->
                <#--<div>-->
                    <#--<img src="/static/clear.png"img-resp">-->
                <#--</div>-->
                <#--<h4><a class="text-in_block"> Автомойка </a></h4>-->
                <#--<div class="add-to-card-btn">-->
                    <#--<a href="../more/about.html#opt" class="btn btn-danger text-font">-->
                        <#--Подробнее-->
                    <#--</a>-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->

    <#--</div>-->


</@c.page>