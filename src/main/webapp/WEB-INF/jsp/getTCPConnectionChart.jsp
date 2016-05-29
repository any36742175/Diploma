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
                ["Genre",'HSM messages', 'tcpcomms', 'Crout messages', 'Authorization', "", { role: 'annotation' } ]
                <c:forEach var="timeTypeNUmber" items="${pointMap.entrySet()}">
                ,["<c:out value="${timeTypeNUmber.getKey()}"/>",
                    <c:out value="${(timeTypeNUmber.getValue().get(\"HSM messages\")==null)?0:timeTypeNUmber.getValue().get(\"HSM messages\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"tcpcomms\")==null)?0:timeTypeNUmber.getValue().get(\"tcpcomms\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"Crout messages\")==null)?0:timeTypeNUmber.getValue().get(\"Crout messages\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"Authorization\")==null)?0:timeTypeNUmber.getValue().get(\"Authorization\")}"/>,
                    <c:out value="${(timeTypeNUmber.getValue().get(\"\")==null)?0:timeTypeNUmber.getValue().get(\"\")}"/>,
                    '']
                </c:forEach>


            ]);


            /*new google.visualization.DataTable();
            // define columns. It will represent x axis and y axis
            data.addColumn('timeofday', 'time');
            data.addColumn('number', 'messages');
            // add data to chart
            data.addRows(<c:out value="${pointList.size()}"/>);

            <c:forEach var="item" items="${pointList}">
                data.setValue(<c:out value="${item.getNumber()}"/>, 0, [<c:out value="${item.getHour()}"/>, <c:out value="${item.getMinute()}"/>, <c:out value="${item.getSecunde()}"/>]);
                data.setValue(<c:out value="${item.getNumber()}"/>, 1, <c:out value="${item.getY()}"/>);
                data.setValue(<c:out value="${item.getNumber()}"/>, 2, <c:out value="${item.getY()}"/>);
            </c:forEach>*/


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
</head>
<body onload="drawChart();">
<div id="chart_div" style="width: 50%; height: <c:out value="${pointMap.entrySet().size()*20}"/>px"></div>
</div>
</body>
</html>

<%--

<c:forEach var="item" items="${pointList}">
    data.setValue(<c:out value="${item.getNumber()}"/>, 0, <c:out value="${item.getX()}"/>);
    data.setValue(<c:out value="${item.getNumber()}"/>, 1, <c:out value="${item.getY()}"/>);
</c:forEach>--%>
