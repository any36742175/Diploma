package ann.project.systemmonitoring.util.sharedmemory;

import ann.project.systemmonitoring.entity.decorator.semaphore.SemaphoreImpRepeat;
import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.entity.imp.SemaphoreImp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SemaphoreUtils {

    public List<Semaphore> checkRepeatSharedMemory(List<SemaphoreImp> semaphoreImpList){
        List<Semaphore> semaphoreRepeatList = new ArrayList<>();
        Set<EmptyTypeOwner> emptyTypeOwners = new HashSet<>();

        for(SemaphoreImp semaphoreImp : semaphoreImpList){
            EmptyTypeOwner emptyTypeOwner = new EmptyTypeOwner(semaphoreImp.getType(), semaphoreImp.getOWNER());

            if(emptyTypeOwners.contains(emptyTypeOwner)){
                SemaphoreImpRepeat semaphoreRepeat = new SemaphoreImpRepeat(semaphoreImp);
                semaphoreRepeat.setRepeat(true);
                semaphoreRepeatList.add(semaphoreRepeat);
            } else {
                emptyTypeOwners.add(emptyTypeOwner);
                SemaphoreImpRepeat semaphoreRepeat = new SemaphoreImpRepeat(semaphoreImp);
                semaphoreRepeat.setRepeat(false);
                semaphoreRepeatList.add(semaphoreRepeat);
            }
        }
        return semaphoreRepeatList;
    }


}
