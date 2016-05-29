package ann.project.systemmonitoring.controller;

//import ann.project.systemmonitoring.repository.TCPConnectionRepository;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.entity.TCPConnection;
import ann.project.systemmonitoring.entity.imp.IPCQueueImp;
import ann.project.systemmonitoring.entity.imp.TCPConnectionImp;
import ann.project.systemmonitoring.repository.IPCQueueRepository;
import ann.project.systemmonitoring.repository.TCPConnectionRepository;
import ann.project.systemmonitoring.util.DateTime;
import ann.project.systemmonitoring.util.chart.Chart;
import ann.project.systemmonitoring.util.chart.Point;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
/*IPCQueue*/
public class ChartController {

    @Autowired
    private IPCQueueRepository ipcQueueRepository;

    @RequestMapping("/getChart")
    public String index() {
        return "getChart";
    }

   /* @ModelAttribute("pointList")
    public List<Point> getTCPConnectionList() {
        Iterator<IPCQueueImp> iterator = ipcQueueRepository.findAll().iterator();
        List<IPCQueueImp> tcpConnectionsList = new ArrayList<>();
        while (iterator.hasNext()) {
            tcpConnectionsList.add(iterator.next());
        }


        return new Chart().getChart(tcpConnectionsList);
    }*/
    @ModelAttribute("pointMap")
    public Map<String, Map<String, Integer>>  getIPCQueueMap() {
        Iterator<IPCQueueImp> iterator = ipcQueueRepository.findAll().iterator();
        List<IPCQueueImp> tcpConnectionsList = new ArrayList<>();
        while (iterator.hasNext()) {
            tcpConnectionsList.add(iterator.next());
        }


        return new Chart().getChartMap(tcpConnectionsList);
    }



    /*@ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }*/
}
