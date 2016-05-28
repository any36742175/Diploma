package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.IPCQueue;
import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.repository.IPCQueueRepository;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
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
    public List<IPCQueue> getIPCQueue() {
        Iterator<IPCQueue> iterator = ipcQueueRepository.findAll().iterator();
        List<IPCQueue> ipcQueueList = new ArrayList<>();
        while (iterator.hasNext()){
            ipcQueueList.add(iterator.next());
        }
        return ipcQueueList;
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
