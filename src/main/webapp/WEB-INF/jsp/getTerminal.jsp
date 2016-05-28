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
    <caption>Terminal</caption>
    <tr>
        <th>Terminal ID</th>
        <th>Terminal type</th>
        <th>Current node</th>
        <th>Connection time</th>
        <th>Previous node</th>
        <th>Owning nodes</th>
        <th>status</th>
    </tr>
    <c:forEach var="item" items="${terminalList}">
        <tr <c:if test="${item.getStatus().equals(\"Disabled\")}">
                <c:out value="${\"bgcolor=#F34F4F\"}"/>
            </c:if>
                <c:if test="${item.getStatus().equals(\"Not Active\")}">
                    <c:out value="${\"bgcolor=#FFF047\"}"/>
                </c:if>
        >
            <td><c:out value="${item.getTerminalID()}"/></td>
            <td><c:out value="${item.getTerminalType()}"/></td>
            <td><c:out value="${item.getCurrentNode()}"/></td>
            <td><c:out value="${item.getConnetcionTime()}"/></td>
            <td><c:out value="${item.getPreviousNode()}"/></td>
            <td><c:out value="${item.getOwningNodes()}"/></td>
            <td><c:out value="${item.getStatus()}"/></td>
        </tr>
    </c:forEach>
</table>

</body>

</html>