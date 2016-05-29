<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <script src="http://code.jquery.com/jquery-1.7rc2.js"></script>
    <style type='text/css'>
        .left-text {
            text-align: left;
        }
    </style>
    <!-- import the Google charts API -->
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
        // load the Visualization API and the chart package
        google.load('visualization', '1.0', {'packages': ['corechart']});
        // define call back handler
        google.setOnLoadCallback(drawChart);
        // function to draw charts
        function drawChart() {
            // configure Chart Details
            var data = google.visualization.arrayToDataTable([
                ["Genre", 'HSM messages', 'tcpcomms', 'Crout messages', 'Authorization', "", {role: 'annotation'}]
                <c:forEach var="timeTypeNUmber" items="${pointMap.entrySet()}">
                , ["<c:out value="${timeTypeNUmber.getKey()}"/>",
                    <c:out value="${(timeTypeNUmber.getValue().get(\"HSM messages\")==null)?0:timeTypeNUmber.getValue().get(\"HSM messages\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"tcpcomms\")==null)?0:timeTypeNUmber.getValue().get(\"tcpcomms\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"Crout messages\")==null)?0:timeTypeNUmber.getValue().get(\"Crout messages\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"Authorization\")==null)?0:timeTypeNUmber.getValue().get(\"Authorization\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"\")==null)?0:timeTypeNUmber.getValue().get(\"\")}"/>,
                    '']
                </c:forEach>


            ]);

            var chart = new
                    google.visualization.BarChart(document.getElementById('chart_div'));
            // set chart options
            chart.draw(data, {
                /*width: 400, height: 240, title: 'Messages',*/
                isStacked: true,
                vAxis: {title: 'time', titleTextStyle: {color: 'red'}}
            });
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
</head>
<body onload="drawChart();">
<table>
    <tr>
        <td><input type="button" value="Shared memory" onClick='location.href="/index"'></td>
        <td><input type="button" value="Semaphores" onClick='location.href="/index"'></td>
        <td><input type="button" value="IPC queues" onClick='location.href="/index"'></td>
        <td><input type="button" value="Terminals" onClick='location.href="/index"'></td>
        <td><input type="button" value="TCP" onClick='location.href="/index"'></td>
    </tr>
    <tbody>

    <tr>
        <td colspan="4" style="border-style:hidden">
            <div id="tableView"></div>
        </td>
    </tr>
    </tbody>
</table>
<center>Chart</center>
<div id="chart_div" style="width: 50%; margin: auto; height: <c:out value="${pointMap.entrySet().size()*20}"/>px"></div>
</div>
</body>
</html>

