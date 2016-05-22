package ann.project.systemmonitoring.controller;

import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.repository.SharedMemoryRepository;
import ann.project.systemmonitoring.system.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class SharedMemoryController {
    @Autowired
    private SharedMemoryRepository sharedMemoryRepository;

    @Autowired
    private System system;

   // @RequestMapping("/sharedMemory")
    @RequestMapping("/getSharedMemory")
    public String getSharedMemory() {

        Iterator<SharedMemory> iterator = sharedMemoryRepository.findAll().iterator();
        String s = "";
        s += "<br>Shared Memory</br>";
        while (iterator.hasNext()) {
            s += "<br>" + iterator.next().toString();
        }
        return s;
    }
}
