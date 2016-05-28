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
    <caption>TCP connections</caption>
    <tr>
        <th>Process</th>
        <th>Local Address</th>
        <th>Remote Address</th>
        <th>State</th>
    </tr>
    <c:forEach var="item" items="${TCPConnectionList}">
        <td><c:out value="${item.getProcess()}"/></td>
        <td><c:out value="${item.getLocalAddress()}"/></td>
        <td><c:out value="${item.getRemoteAddress()}"/></td>
        <td <c:choose>
            <c:when test="${item.getState().equals(\"CLOSE-WAIT\")}">
                <c:out value="${\"bgcolor=#F34F4F\"}"/>
            </c:when>
            <c:when test="${item.getState().equals(\"ESTABLISHED\")}">
                <c:out value="${\"bgcolor=#A7D152\"}"/>
            </c:when>
        </c:choose>
        ><c:out value="${item.getState()}"/></td>
        </tr>
    </c:forEach>
</table>

</body>

</html>