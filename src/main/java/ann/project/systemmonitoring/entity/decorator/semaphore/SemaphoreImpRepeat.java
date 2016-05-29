package ann.project.systemmonitoring.entity.decorator.semaphore;

import ann.project.systemmonitoring.entity.Semaphore;
import ann.project.systemmonitoring.entity.imp.SemaphoreImp;

/**
 * Декоратор, добаляет в semaphoreImp новое поле boolean repeat
 */
public class SemaphoreImpRepeat implements Semaphore {
    private SemaphoreImp semaphoreImp;
    private boolean repeat;

    public SemaphoreImpRepeat(SemaphoreImp semaphoreImp) {
        this.semaphoreImp = semaphoreImp;
    }

    public int getKey() {
        return semaphoreImp.getKey();
    }

    public int getShm_id() {
        return semaphoreImp.getShm_id();
    }

    public String getPermission() {
        return semaphoreImp.getPermission();
    }

    public int getSemPerKey() {
        return semaphoreImp.getSemPerKey();
    }

    public String getLastChange() {
        return semaphoreImp.getLastChange();
    }

    public String getLastOperation() {
        return semaphoreImp.getLastOperation();
    }

    public String getType() {
        return semaphoreImp.getType();
    }

    public String getOWNER() {
        return semaphoreImp.getOWNER();
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public boolean isRepeat() {
        return repeat;
    }

    @Override
    public String toString() {
        return "SemaphoreImpRepeat{" +
                "semaphoreImp=" + semaphoreImp +
                ", repeat=" + repeat +
                '}';
    }
}
