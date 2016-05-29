package ann.project.systemmonitoring.util.chart;

import ann.project.systemmonitoring.entity.imp.IPCQueueImp;

import java.util.*;

public class Chart {
    public List<Point> getChart(List<IPCQueueImp> ipcQueueImps) {
        List<Point> points = new ArrayList<>();
        Map<String, Integer> pointsMap = new HashMap<>();
        for (IPCQueueImp ipcQueueImp : ipcQueueImps) {
            Integer messages = pointsMap.get(ipcQueueImp.getLastOperation());
            if (messages == null) {
                pointsMap.put(ipcQueueImp.getLastOperation(), ipcQueueImp.getMessages());
            } else {
                pointsMap.put(ipcQueueImp.getLastOperation(), messages + ipcQueueImp.getMessages());
            }
        }

        int i = 0;
        for (Map.Entry<String, Integer> entry :
                pointsMap.entrySet()
                ) {
            Point point = new Point(entry.getKey(), entry.getValue());
            point.setNumber(i++);
            points.add(point);
        }

        return points;
    }

    public Map<String, Map<String, Integer>> getChartMap(List<IPCQueueImp> ipcQueueImps) {
        Collections.sort(ipcQueueImps);
        Map<String, Map<String, Integer>> chartMap = new TreeMap<>();
        for (IPCQueueImp ipcQueueImp : ipcQueueImps) {
            Map<String, Integer> typeMessagesMap = chartMap.get(ipcQueueImp.getLastOperation());
            if (typeMessagesMap == null) {
                typeMessagesMap = new HashMap<>();
                typeMessagesMap.put(ipcQueueImp.getType(), ipcQueueImp.getMessages());
                chartMap.put(ipcQueueImp.getLastOperation(), typeMessagesMap);
            } else {
                Integer messages = typeMessagesMap.get(ipcQueueImp.getType());
                if (messages == null) {
                    typeMessagesMap.put(ipcQueueImp.getType(), ipcQueueImp.getMessages());
                } else {
                    typeMessagesMap.put(ipcQueueImp.getType(), messages + ipcQueueImp.getMessages());
                }
            }
        }

        return chartMap;
    }
}
