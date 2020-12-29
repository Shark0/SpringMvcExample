<!DOCTYPE html>
<html>
<head>
    <title>Cars</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <#list cars as car>
        <tr>
            <td>${car.id}</td>
            <td>${car.name}</td>
            <td>${car.price}</td>
        </tr>
    </#list>
</table>
</body>
</html>