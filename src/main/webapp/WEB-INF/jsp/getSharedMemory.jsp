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
    <caption>SharedMemory</caption>
    <tr>
        <th>KEY</th>
        <th>SHM ID</th>
        <th>Permission</th>
        <th>Size</th>
        <th>Proc number</th>
        <th>Last Att, Det</th>
        <th>Type</th>
        <th>Owner</th>
    </tr>
    <c:forEach var="item" items="${SharedMemoryRepeatList}">
        <tr
                <c:choose>
                    <c:when test="${item.isRepeat() || item.getType().equals(\"\")}">
                        <c:out value="${\"bgcolor=#F34F4F\"}"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${\"bgcolor=#A7D152\"}"/>
                    </c:otherwise>
                </c:choose>
        >
            <td><c:out value="${item.getKey()}"/></td>
            <td><c:out value="${item.getShm_id()}"/></td>
            <td><c:out value="${item.getPermission()}"/></td>
            <td><c:out value="${item.getSize()}"/></td>
            <td><c:out value="${item.getProcNumber()}"/></td>
            <td><c:out value="${item.getLastAttDet()}"/></td>
            <td><c:out value="${item.getType()}"/></td>
            <td><c:out value="${item.getOWNER()}"/></td>
        </tr>
    </c:forEach>
</table>

</body>

</html>