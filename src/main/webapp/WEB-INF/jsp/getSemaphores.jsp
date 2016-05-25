<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <style>
        table {
            width: 50%; /* Ширина таблицы */
            border: 1px solid; /* Рамка вокруг таблицы */
            margin: auto; /* Выравниваем таблицу по центру окна  */
        }

        td {
            text-align: center; /* Выравниваем текст по центру ячейки */
        }
    </style>
</head>
<body>

<table border="1" width="50%">
    <caption>SEMAPHORE</caption>
    <tr>
        <th>QUEUE Id</th>
        <th>Permission</th>
        <th>Queue size</th>
        <th>Messages</th>
        <th>last Operation</th>
        <th>Queue type</th>
        <th>Owner</th>
    </tr>
    <c:forEach var="item" items="${semaphoreList}">
        <tr>
            <td><c:out value="${item.getKey()}"/></td>
            <td>SHM ID</td>
            <td>Permission</td>
            <td>Size</td>
            <td>Proc number</td>
            <td>Last Att, Det</td>
            <td>Type</td>
            <td>Owner</td>
        </tr>
    </c:forEach>
</table>

</body>

</html>