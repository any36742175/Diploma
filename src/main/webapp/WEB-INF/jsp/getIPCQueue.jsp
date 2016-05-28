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
<input type="text" id="dateTime" value="${dateTime}" style="width: 50%">
<table border="1" width="50%">
    <caption>IPC Queue</caption>
    <tr>
        <th>Queue ID</th>
        <th>Permission</th>
        <th>Queue size</th>
        <th>Messages</th>
        <th>last Operation</th>
        <th>Queue type</th>
        <th>Owner</th>
    </tr>
    <c:forEach var="item" items="${IPCQueueList}">
        <tr
                <c:choose>
                    <c:when test="${item.getType().equals(\"\")}">
                        <c:out value="${\"bgcolor=#F34F4F\"}"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${\"bgcolor=#A7D152\"}"/>
                    </c:otherwise>
                </c:choose>
        >
            <td><c:out value="${item.getQueueId()}"/></td>
            <td><c:out value="${item.getPermission()}"/></td>
            <td><c:out value="${item.getQueueSize()}"/></td>
            <td><c:out value="${item.getMessages()}"/></td>
            <td><c:out value="${item.getLastOperation()}"/></td>
            <td><c:out value="${item.getType()}"/></td>
            <td><c:out value="${item.getOWNER()}"/></td>
        </tr>
    </c:forEach>
</table>

</body>

</html>