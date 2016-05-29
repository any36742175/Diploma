package ann.project.systemmonitoring.util.sharedmemory;

import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.entity.decorator.sharedmemory.SharedMemoryRepeat;
import ann.project.systemmonitoring.entity.imp.SharedMemoryImp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SharedMemoryUtils {

    public List<SharedMemory> checkRepeatSharedMemory(List<SharedMemoryImp> sharedMemoryImpList) {
        List<SharedMemory> sharedMemoryRepeats = new ArrayList<>();
        Set<EmptyTypeOwner> emptyTypeOwners = new HashSet<>();

        for (SharedMemoryImp sharedMemoryImp : sharedMemoryImpList) {
            EmptyTypeOwner emptyTypeOwner = new EmptyTypeOwner(sharedMemoryImp.getType(), sharedMemoryImp.getOWNER());

            if (emptyTypeOwners.contains(emptyTypeOwner)) {
                SharedMemoryRepeat sharedMemoryRepeat = new SharedMemoryRepeat(sharedMemoryImp);
                sharedMemoryRepeat.setRepeat(true);
                sharedMemoryRepeats.add(sharedMemoryRepeat);
            } else {
                emptyTypeOwners.add(emptyTypeOwner);
                SharedMemoryRepeat sharedMemoryRepeat = new SharedMemoryRepeat(sharedMemoryImp);
                sharedMemoryRepeat.setRepeat(false);
                sharedMemoryRepeats.add(sharedMemoryRepeat);
            }
        }
        return sharedMemoryRepeats;
    }


}
