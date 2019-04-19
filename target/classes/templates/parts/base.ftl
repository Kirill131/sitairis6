<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Gomel-Decor </title>
    <!-- Bootstrap-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400" rel="stylesheet">

    <!-- Custom styles -->
    <#--<link rel="stylesheet" href="{% static 'style.css' %}">-->
    <#--<link  rel="stylesheet" type="text/css" th:href="@{/styles/style.css}" href="../style.css" />-->
    <link rel="stylesheet" type="text/css" href="../../style.css">
</head>
<body>

<div class="wrapper">
    {% include 'navbar.html' %}
    {% block content %}
    {% endblock content %}
    {% include 'footer.html' %}
</div>
</body>
</html>