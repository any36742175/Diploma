package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.imp.IPCQueueImp;
import ann.project.systemmonitoring.repository.IPCQueueRepository;
import ann.project.systemmonitoring.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class IPCQueueController {

    @Autowired
    private IPCQueueRepository ipcQueueRepository;

    @RequestMapping("/getIPCQueue")
    public String index() {
        return "getIPCQueue";
    }

    @ModelAttribute("IPCQueueList")
    public List<IPCQueueImp> getIPCQueue() {
        Iterator<IPCQueueImp> iterator = ipcQueueRepository.findAll().iterator();
        List<IPCQueueImp> ipcQueueImpList = new ArrayList<>();
        while (iterator.hasNext()) {
            ipcQueueImpList.add(iterator.next());
        }
        return ipcQueueImpList;
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
