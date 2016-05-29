package ann.project.systemmonitoring.controller;

//import ann.project.systemmonitoring.repository.TCPConnectionRepository;

import ann.project.systemmonitoring.entity.TCPConnection;
import ann.project.systemmonitoring.entity.imp.TCPConnectionImp;
import ann.project.systemmonitoring.repository.TCPConnectionRepository;
import ann.project.systemmonitoring.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class TCPConnectionController {

    @Autowired
    private TCPConnectionRepository tcpConnectionRepository;

    @RequestMapping("/getTCPConnection")
    public String index() {
        return "getTCPConnection";
    }

    @ModelAttribute("TCPConnectionList")
    public List<TCPConnection> getTCPConnectionList() {
        Iterator<TCPConnectionImp> iterator = tcpConnectionRepository.findAll().iterator();
        List<TCPConnection> tcpConnectionsList = new ArrayList<>();
        while (iterator.hasNext()) {
            tcpConnectionsList.add(iterator.next());
        }
        return tcpConnectionsList;
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
