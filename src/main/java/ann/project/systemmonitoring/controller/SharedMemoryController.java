package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.entity.imp.SharedMemoryImp;
import ann.project.systemmonitoring.repository.SharedMemoryRepository;
import ann.project.systemmonitoring.util.DateTime;
import ann.project.systemmonitoring.util.sharedmemory.SharedMemoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class SharedMemoryController {

    @Autowired
    private SharedMemoryRepository sharedMemoryRepository;

    private SharedMemoryUtils sharedMemoryUtils = new SharedMemoryUtils();

    @RequestMapping("/getSharedMemory")
    public String index() {
        return "getSharedMemory";
    }

    @ModelAttribute("SharedMemoryRepeatList")
    public List<SharedMemory> getSharedMemory() {
        return getSharedMemoryRepeat();
    }

    public List<SharedMemory> getSharedMemoryRepeat() {
        Iterator<SharedMemoryImp> iterator = sharedMemoryRepository.findAll().iterator();
        List<SharedMemoryImp> sharedMemoryImpList = new ArrayList<>();
        while (iterator.hasNext()){
            sharedMemoryImpList.add(iterator.next());
        }
        return sharedMemoryUtils.checkRepeatSharedMemory(sharedMemoryImpList);
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
