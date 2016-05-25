<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">

<body>
<%-- <h1>${message}</h1>--%>


<table border="1">
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
    <tr><td><c:out value="${item.getKey()}"/></td>
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
<%--<p><a href="${springUrl}">URL generated by Spring"${array}"</a></p>
<p><a href="${url}">URL generated by JSTL</a></p>
<c:forEach var="item" items="${array}">
    item <c:out value="${item}"></c:out>
</c:forEach>--%>
</body>

</html>