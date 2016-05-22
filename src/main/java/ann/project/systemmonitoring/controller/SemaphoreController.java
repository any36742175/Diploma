package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class SemaphoreController {

    @Autowired
    private SemaphoreRepository semaphoreRepository;

    @RequestMapping("/getSemaphores")
    public String getSemaphores() {


        Iterator<Semaphore> iterator = semaphoreRepository.findAll().iterator();
        String s = "";
        s += "<br>Semaphores</br>";
        while (iterator.hasNext()) {
            s += "<br>" + iterator.next().toString();
        }
        return s;
    }
}
