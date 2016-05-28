package ann.project.systemmonitoring.util.sharedmemory;

import ann.project.systemmonitoring.decorator.sharedmemory.SharedMemoryRepeat;
import ann.project.systemmonitoring.entity.SharedMemory;

import java.util.*;

public class SharedMemoryUtils {

    public List<SharedMemoryRepeat> cheakRepeatSharedMemory(List<SharedMemory> sharedMemoryList){
        List<SharedMemoryRepeat> sharedMemoryRepeats = new ArrayList<>();
        Set<EmptyTypeOwner> emptyTypeOwners = new HashSet<>();

        for(SharedMemory sharedMemory: sharedMemoryList){
            EmptyTypeOwner emptyTypeOwner = new EmptyTypeOwner(sharedMemory.getType(), sharedMemory.getOWNER());

            if(emptyTypeOwners.contains(emptyTypeOwner)){
                SharedMemoryRepeat sharedMemoryRepeat = new SharedMemoryRepeat(sharedMemory);
                sharedMemoryRepeat.setRepeat(true);
                sharedMemoryRepeats.add(sharedMemoryRepeat);
            } else {
                emptyTypeOwners.add(emptyTypeOwner);
                SharedMemoryRepeat sharedMemoryRepeat = new SharedMemoryRepeat(sharedMemory);
                sharedMemoryRepeat.setRepeat(false);
                sharedMemoryRepeats.add(sharedMemoryRepeat);
            }
        }
        return sharedMemoryRepeats;
    }


}
