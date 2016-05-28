package ann.project.systemmonitoring.system;

import ann.project.systemmonitoring.entity.imp.IPCQueue;
import ann.project.systemmonitoring.entity.imp.Terminal;
import ann.project.systemmonitoring.repository.IPCQueueRepository;
import ann.project.systemmonitoring.repository.TerminalRepository;
import ann.project.systemmonitoring.system.datageneration.imp.DataGeneratorIPCQueue;
import ann.project.systemmonitoring.system.datageneration.imp.DataGeneratorSemaphores;
import ann.project.systemmonitoring.system.datageneration.imp.DataGeneratorSharedMemory;
import ann.project.systemmonitoring.entity.imp.SemaphoreImp;
import ann.project.systemmonitoring.entity.imp.SharedMemoryImp;
import ann.project.systemmonitoring.repository.SemaphoreRepository;
import ann.project.systemmonitoring.repository.SharedMemoryRepository;
import ann.project.systemmonitoring.system.datageneration.imp.DataGeneratorTerminal;
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

    @Autowired
    private IPCQueueRepository ipcQueueRepository;

    @Autowired
    private TerminalRepository terminalRepository;

    private Random random = new Random();

    @Before("execution(* ann.project.systemmonitoring.controller.SharedMemoryController.*getSharedMemory())")
    private void createDataForSharedMemory() {
        Iterable<SharedMemoryImp> all = sharedMemoryRepository.findAll();
        sharedMemoryRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            SharedMemoryImp sharedMemoryImp = new DataGeneratorSharedMemory().generateData();
            sharedMemoryRepository.save(sharedMemoryImp);
        }
    }

    @Before("execution(* ann.project.systemmonitoring.controller.SemaphoreController.*getSemaphores())")
    private void createDataForSemaphore() {
        Iterable<SemaphoreImp> all = semaphoreRepository.findAll();
        semaphoreRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            SemaphoreImp semaphoreImp = new DataGeneratorSemaphores().generateData();
            semaphoreRepository.save(semaphoreImp);
        }
    }

    @Before("execution(* ann.project.systemmonitoring.controller.IPCQueueController.*getIPCQueue())")
    private void createDataForIPCQueue() {
        Iterable<IPCQueue> all = ipcQueueRepository.findAll();
        ipcQueueRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            IPCQueue ipcQueue = new DataGeneratorIPCQueue().generateData();
            ipcQueueRepository.save(ipcQueue);
        }
    }


    @Before("execution(* ann.project.systemmonitoring.controller.TerminalController.*getTerminal())")
    private void createDataForTerminal() {
        Iterable<Terminal> all = terminalRepository.findAll();
        terminalRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            Terminal terminal = new DataGeneratorTerminal().generateData();
            terminalRepository.save(terminal);
        }
    }
}
