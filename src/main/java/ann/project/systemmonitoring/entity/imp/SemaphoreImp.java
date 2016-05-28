package ann.project.systemmonitoring.entity.imp;

import ann.project.systemmonitoring.entity.Semaphore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEMAPHORE")
public class SemaphoreImp implements Semaphore {
    @Id
    @Column(name = "ID")
    //@GeneratedValue
    private int key;

    @Column(name = "SHM_ID")
    private int shm_id;

    @Column(name = "PERMISSION")
    private String permission;

    //@Column(name = "'Sem. per key'")//todo
    private int semPerKey;

    //@Column(name = "LAST_CHANGE")//todo
    private String lastChange;

    //@Column(name = "LAST_OPERATION")//todo
    private String lastOperation;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "OWNER")
    private String OWNER;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getShm_id() {
        return shm_id;
    }

    public void setShm_id(int shm_id) {
        this.shm_id = shm_id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getSemPerKey() {
        return semPerKey;
    }

    public void setSemPerKey(int semPerKey) {
        this.semPerKey = semPerKey;
    }

    public String getLastChange() {
        return lastChange;
    }

    public void setLastChange(String lastChange) {
        this.lastChange = lastChange;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER;
    }

    @Override
    public String toString() {
        return "SemaphoreImp{" +
                "key=" + key +
                ", shm_id=" + shm_id +
                ", permission='" + permission + '\'' +
                ", semPerKey=" + semPerKey +
                ", lastChange=" + lastChange +
                ", lastOperation=" + lastOperation +
                ", type='" + type + '\'' +
                ", OWNER='" + OWNER + '\'' +
                '}';
    }
}