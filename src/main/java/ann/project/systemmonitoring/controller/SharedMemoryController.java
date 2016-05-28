package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.decorator.sharedmemory.SharedMemoryRepeat;
import ann.project.systemmonitoring.entity.SharedMemory;
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
    public List<SharedMemoryRepeat> getSharedMemory() {
        Iterator<SharedMemory> iterator = sharedMemoryRepository.findAll().iterator();
        List<SharedMemory> sharedMemoryList = new ArrayList<>();
        while (iterator.hasNext()){
            sharedMemoryList.add(iterator.next());
        }
        return sharedMemoryUtils.cheakRepeatSharedMemory(sharedMemoryList);
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
