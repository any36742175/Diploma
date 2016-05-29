package ann.project.systemmonitoring.entity.decorator.sharedmemory;

import ann.project.systemmonitoring.entity.SharedMemory;
import ann.project.systemmonitoring.entity.imp.SharedMemoryImp;

/**
 * Декоратор, добаляет в SharedMemoryImp новое поле boolean repeat
 */
public class SharedMemoryRepeat implements SharedMemory {
    private SharedMemoryImp sharedMemoryImp;
    private boolean repeat;

    public SharedMemoryRepeat(SharedMemoryImp sharedMemoryImp) {
        this.sharedMemoryImp = sharedMemoryImp;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public int getKey() {
        return sharedMemoryImp.getKey();
    }

    public int getShm_id() {
        return sharedMemoryImp.getShm_id();
    }

    public String getPermission() {
        return sharedMemoryImp.getPermission();
    }

    public int getSize() {
        return sharedMemoryImp.getSize();
    }

    public int getProcNumber() {
        return sharedMemoryImp.getProcNumber();
    }

    public String getType() {
        return sharedMemoryImp.getType();
    }

    public String getOWNER() {
        return sharedMemoryImp.getOWNER();
    }

    public String getLastAttDet() {
        return sharedMemoryImp.getLastAttDet();
    }

    @Override
    public String toString() {
        return "SharedMemoryRepeat{" +
                "sharedMemoryImp=" + sharedMemoryImp +
                ", repeat=" + repeat +
                '}';
    }
}
