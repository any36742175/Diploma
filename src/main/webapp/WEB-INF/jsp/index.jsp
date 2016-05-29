<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<script>
    function loadDoc(url, elementId) {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (xhttp.readyState == 4 && xhttp.status == 200) {
                document.getElementById(elementId).innerHTML = xhttp.responseText;
            }
        };
        xhttp.open("GET", url, true);
        xhttp.send();
    }
</script>

<head>

    <style>
        table {
            width: 50%; /* Ширина таблицы */
            border: 1px solid; /* Рамка вокруг таблицы */
            margin: auto; /* Выравниваем таблицу по центру окна  */
            border: 2px solid CornflowerBlue;
            border-radius: 10px;
        }

        td {
            text-align: center; /* Выравниваем текст по центру ячейки */
        }
    </style>
</head>
<body>

<table>
    <tr>
        <td><button type="button" onclick="loadDoc('/getSharedMemory', 'tableView')">Shared memory</button></td>
        <td><button type="button" onclick="loadDoc('/getSemaphores', 'tableView')">Semaphores</button></td>
        <td><button type="button" onclick="loadDoc('/getIPCQueue', 'tableView')">IPC queues</button></td>
        <td><button type="button" onclick="loadDoc('/getTerminal', 'tableView')">Terminals</button></td>
        <td><button type="button" onclick="loadDoc('/getTCPConnection', 'tableView')">TCP</button></td>
        <td><button type="button" onclick="loadDoc('/getTCPConnectionChart', 'tableView')">getTCPConnectionChart</button></td>
        <td><a href="/getTCPConnectionChart">Chart</a></td>
    </tr>
    <tbody>

    <tr>
        <td colspan="4" style="border-style:hidden"><div id="tableView"></div></td>
    </tr>
    </tbody>
</table>

</body>

</html>