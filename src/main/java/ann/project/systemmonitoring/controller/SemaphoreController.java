package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.entity.imp.SemaphoreImp;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
import ann.project.systemmonitoring.util.DateTime;
import ann.project.systemmonitoring.util.sharedmemory.SemaphoreUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class SemaphoreController {

    @Autowired
    private SemaphoreRepository semaphoreRepository;

    private SemaphoreUtils sharedMemoryUtils = new SemaphoreUtils();

    @RequestMapping("/getSemaphores")
    public String index() {
        return "getSemaphores";
    }

    @ModelAttribute("semaphoreListRepeat")
    public List<Semaphore> getSemaphores() {
        return getSemaphoresRepeat();
    }

    public List<Semaphore> getSemaphoresRepeat() {
        Iterator<SemaphoreImp> iterator = semaphoreRepository.findAll().iterator();
        List<SemaphoreImp> semaphoreImpList = new ArrayList<>();
        while (iterator.hasNext()){
            semaphoreImpList.add(iterator.next());
        }
        return sharedMemoryUtils.checkRepeatSharedMemory(semaphoreImpList);
    }

    @ModelAttribute("dateTime")
    public String dateTime() {
        return DateTime.getCurrentDateTimeFormate();
    }
}
