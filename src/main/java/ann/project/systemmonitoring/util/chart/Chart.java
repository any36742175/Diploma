package ann.project.systemmonitoring.util.chart;

import ann.project.systemmonitoring.entity.imp.IPCQueueImp;

import java.util.*;

/**
 * Класс выводящий график
 */

public class Chart {
    /**
     * key - дата и время в формате строки
     * value-map, где key - тип сообщения, value - количество сообщений
     * <p>
     * т.е. собирается информация:
     * Момент времени, тип сообщений которые были в этот момент времени, количество сообщений с каждым типом
     */
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
