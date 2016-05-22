package ann.project.systemmonitoring.system;

import ann.project.systemmonitoring.datageneration.imp.DataGeneratorSemaphores;
import ann.project.systemmonitoring.datageneration.imp.DataGeneratorSharedMemory;
import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
import ann.project.systemmonitoring.repository.SharedMemoryRepository;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Aspect
@Component
public class System {

    @Autowired
    private SharedMemoryRepository sharedMemoryRepository;

    @Autowired
    private SemaphoreRepository semaphoreRepository;

    private Random random = new Random();

    @Before("execution(* ann.project.systemmonitoring.controller.SharedMemoryController.*getSharedMemory())")
    private void createDataForSharedMemory() {
        Iterable<SharedMemory> all = sharedMemoryRepository.findAll();
        sharedMemoryRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            SharedMemory sharedMemory = new DataGeneratorSharedMemory().generateData();
            sharedMemoryRepository.save(sharedMemory);
        }
    }

    @Before("execution(* ann.project.systemmonitoring.controller.SharedMemoryController.*getSemaphores())")
    private void createDataForSemaphore() {
        Iterable<Semaphore> all = semaphoreRepository.findAll();
        semaphoreRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            Semaphore semaphore = new DataGeneratorSemaphores().generateData();
            semaphoreRepository.save(semaphore);
        }
    }
}
