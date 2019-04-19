<!-- Footer -->
<footer class="page-footer font-small footer-bg">

    <!-- Footer Links -->
    <div class="text-center text-md-left mt-5">

        <!-- Grid row -->
        <div class="row mt-3">

            <!-- Grid column -->
            <div class="col-lg-6">

                <!-- Content -->
                <script src='https://maps.googleapis.com/maps/api/js?v=3.exp'></script>
                <div style='overflow:hidden;height:370px;width:660px;'>
                    <div id='gmap_canvas' class="map-footer" style='height:350px;width:660px;'></div>
                    <style>#gmap_canvas img{max-width:none!important;background:none!important}</style></div>
                <script type='text/javascript'>function init_map(){
                    var myOptions = {zoom:17,center:new google.maps.LatLng(52.4529164,30.99291560000006),mapTypeId: google.maps.MapTypeId.ROADMAP};map = new google.maps.Map(document.getElementById('gmap_canvas'), myOptions);marker = new google.maps.Marker({map: map,position: new google.maps.LatLng(52.4529164,30.99291560000006)});infowindow = new google.maps.InfoWindow({content:'<strong>ИП Рыбак, Valtec</strong><br>Беларусь, Гомель, ул. Советская 134/2<br>'});google.maps.event.addListener(marker, 'click', function(){infowindow.open(map,marker);});infowindow.open(map,marker);}google.maps.event.addDomListener(window, 'load', init_map);</script>

            </div>
            <!-- Grid column -->

            <!-- Grid column -->

            <div class="col-lg-6 footer_contact text-left">
                            <p class="contact-name"><b>ИП Рыбак Д. Н.</b></p>
                            <p class="contact_adress"> индекс, Беларусь, г.Гомель, ул. Советская 134/2, цокольный этаж </p>
                            <p>#}

                                    <b>E-mail:</b>#}
                                    <b><a style="color:#e82d3c; display: inline;"
                                                                   href="mailto:Valtec_Gomel@gmail.com">Valtec_Gomel@gmail.com</a></b>
                            </p>
                            <a class="contact-number" href="tel:+375253185258" style="display:inline">
                                <i class="sprite sprite-call"></i>
                                +375 (29)
                                <span class="red"> 318-58-52 </span>
                                <span class="normal"> (Life) </span>
                            </a>

                            <div class="text-left" style="margin-top: 25px">
                                <button class="btn btn-danger btn-r">
                                        Форма связи
                                    </button>
                            </div>

            </div>
        </div>
    </div>
</footer>
  <!-- Footer -->