<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page "none">
Login page
<@l.login "/login" false/>
<a href="/registrationClientInfo">Add new user</a>
</@c.page>




<!--<!DOCTYPE html>-->
<!--<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.w3.org/1999/xhtml">-->
<!--<head>-->
    <!--<meta charset="UTF-8">-->
    <!--<title>Login</title>-->

    <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css">-->

    <!--&lt;!&ndash;<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>&ndash;&gt;-->
    <!--&lt;!&ndash;<link rel="stylesheet" href="../static/style.css">&ndash;&gt;-->
    <!--&lt;!&ndash;<link  rel="stylesheet" type="text/css" th:href="@{/styles/style.css}" href="/styles/style.css" />&ndash;&gt;-->
    <!--&lt;!&ndash;<link rel="script" href="{% static 'js/scripts.js' %}">&ndash;&gt;-->

<!--</head>-->
<!--<body>-->
<!--&lt;!&ndash;---- Include the above in your HEAD tag --------&ndash;&gt;-->
<!--<div class="container">-->
    <!--<div class="row">-->
        <!--<div class="col-md-6 col-md-offset-3">-->
            <!--<div class="panel panel-login">-->
                <!--<div class="panel-heading">-->
                    <!--<div class="row">-->
                        <!--<div class="col-xs-12">-->
                            <!--<a class="active" >Login</a>-->
                        <!--</div>-->
                    <!--</div>-->
                    <!--<hr>-->
                <!--</div>-->
                <!--<div class="panel-body">-->
                    <!--<div class="row">-->
                        <!--<div class="col-lg-12">-->
                            <!--<form action="/login" method="post" style="display: block;">-->
                                <!--<div class="form-group text-center">-->
                                    <!--<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">-->
                                    <!--&lt;!&ndash;<div><label> User Name : <input type="text" name="username"/> </label></div>&ndash;&gt;-->
                                <!--</div>-->
                                <!--<div class="form-group text-center">-->
                                    <!--<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">-->
                                    <!--&lt;!&ndash;<div><label> Password: <input type="password" name="password"/> </label></div>&ndash;&gt;-->

                                <!--</div>-->
                                <!--<div class="form-group">-->
                                    <!--<div class="row">-->
                                        <!--<div class="col-sm-6 col-sm-offset-3">-->
                                            <!--<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">-->
                                        <!--</div>-->
                                    <!--</div>-->
                                    <!--<div class="text-center" style="padding-top: 20px">-->
                                        <!--<a href="/registrationClientInfo">Create account</a>-->
                                    <!--</div>-->
                                <!--</div>-->
                                <!--<input type="hidden" name="_csrf" value="{{_csrf.token}}">-->
                            <!--</form>-->
                            <!--&lt;!&ndash;<form id="register-form" action="" method="post" role="form" style="display: none;">&ndash;&gt;-->
                                <!--&lt;!&ndash;{% csrf_token %}&ndash;&gt;-->
                                <!--&lt;!&ndash;<div class="form-group">&ndash;&gt;-->
                                    <!--&lt;!&ndash;<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">&ndash;&gt;-->
                                <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                <!--&lt;!&ndash;<div class="form-group">&ndash;&gt;-->
                                    <!--&lt;!&ndash;<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">&ndash;&gt;-->
                                <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                <!--&lt;!&ndash;<div class="form-group">&ndash;&gt;-->
                                    <!--&lt;!&ndash;<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">&ndash;&gt;-->
                                <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                <!--&lt;!&ndash;<div class="form-group">&ndash;&gt;-->
                                    <!--&lt;!&ndash;<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">&ndash;&gt;-->
                                <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                <!--&lt;!&ndash;<div class="form-group">&ndash;&gt;-->
                                    <!--&lt;!&ndash;<div class="row">&ndash;&gt;-->
                                        <!--&lt;!&ndash;<div class="col-sm-6 col-sm-offset-3">&ndash;&gt;-->
                                            <!--&lt;!&ndash;<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">&ndash;&gt;-->
                                        <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                    <!--&lt;!&ndash;</div>&ndash;&gt;-->
                                <!--&lt;!&ndash;</div>&ndash;&gt;-->

                            <!--&lt;!&ndash;</form>&ndash;&gt;-->
                        <!--</div>-->
                    <!--</div>-->
                <!--</div>-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->
<!--</div>-->
<!--</body>-->
<!--</html>-->