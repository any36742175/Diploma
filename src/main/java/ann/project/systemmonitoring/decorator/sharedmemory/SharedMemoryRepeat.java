package ann.project.systemmonitoring.decorator.sharedmemory;

import ann.project.systemmonitoring.entity.SharedMemory;

public class SharedMemoryRepeat extends SharedMemory {
    private SharedMemory sharedMemory;
    private boolean repeat;

    public SharedMemoryRepeat(SharedMemory sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    @Override
    public int getKey() {
        return sharedMemory.getKey();
    }

    @Override
    public int getShm_id() {
        return sharedMemory.getShm_id();
    }

    @Override
    public String getPermission() {
        return sharedMemory.getPermission();
    }

    @Override
    public int getSize() {
        return sharedMemory.getSize();
    }

    @Override
    public int getProcNumber() {
        return sharedMemory.getProcNumber();
    }

    @Override
    public String getType() {
        return sharedMemory.getType();
    }

    @Override
    public String getOWNER() {
        return sharedMemory.getOWNER();
    }

    @Override
    public String getLastAttDet() {
        return sharedMemory.getLastAttDet();
    }

    @Override
    public String toString() {
        return "SharedMemoryRepeat{" +
                "sharedMemory=" + sharedMemory +
                ", repeat=" + repeat +
                '}';
    }
}
