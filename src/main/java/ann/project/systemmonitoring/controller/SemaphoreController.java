package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
import ann.project.systemmonitoring.repository.SharedMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Controller
public class SemaphoreController {

    @Autowired
    private SemaphoreRepository semaphoreRepository;

    @RequestMapping("/getSemaphores")
    public String index() {
        return "getSemaphores";
    }

    @ModelAttribute("semaphoreList")
    public List<Semaphore> getSemaphores() {
        Iterator<Semaphore> iterator = semaphoreRepository.findAll().iterator();
        List<Semaphore> semaphoreList = new ArrayList<>();
        while (iterator.hasNext()){
            semaphoreList.add(iterator.next());
        }
        return semaphoreList;
    }
}
