<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>

<html>
<head>
    <title>Home page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<p>Hello, ${name}</p>
<p id="secondText"></p>

<script type="text/javascript">
    $(function () {
        console.log('index.jsp');
        $("#secondText").text('Nice to meet you!');
    });
</script>
</body>
</html>