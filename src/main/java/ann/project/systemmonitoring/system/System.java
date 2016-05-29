package ann.project.systemmonitoring.system;

import ann.project.systemmonitoring.entity.imp.*;
import ann.project.systemmonitoring.repository.*;
import ann.project.systemmonitoring.system.datageneration.imp.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Класс, которые перед каждым запросом данных из репозитория,
 * указанными классами в аннотации метода, обноляет его данные с помощью реализация метода DataGenerate
 */

/*Позволяет привязывать методы к вызовам других методов*/
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

    @Autowired
    private TCPConnectionRepository tcpConnectionRepository;

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
        Iterable<IPCQueueImp> all = ipcQueueRepository.findAll();
        ipcQueueRepository.delete(all);

        for (int i = 0; i < random.nextInt(1000) + 500; i++) {
            IPCQueueImp ipcQueueImp = new DataGeneratorIPCQueue().generateData();
            ipcQueueRepository.save(ipcQueueImp);
        }
    }


    @Before("execution(* ann.project.systemmonitoring.controller.TerminalController.*getTerminal())")
    private void createDataForTerminal() {
        Iterable<TerminalImp> all = terminalRepository.findAll();
        terminalRepository.delete(all);

        for (int i = 0; i < random.nextInt(100); i++) {
            TerminalImp terminalImp = new DataGeneratorTerminal().generateData();
            terminalRepository.save(terminalImp);
        }
    }

    @Before("execution(* ann.project.systemmonitoring.controller.TCPConnectionController.getTCPConnectionList())")
    private void createDataForTCPConnection() {
        Iterable<TCPConnectionImp> all = tcpConnectionRepository.findAll();
        tcpConnectionRepository.delete(all);

        for (int i = 0; i < random.nextInt(20); i++) {
            TCPConnectionImp terminalImp = new DataGeneratorTCPConnection().generateData();
            tcpConnectionRepository.save(terminalImp);
        }
    }
}
