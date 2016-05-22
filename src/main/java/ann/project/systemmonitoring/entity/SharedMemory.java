package ann.project.systemmonitoring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHARED_MEMORY")
public class SharedMemory {
    @Id
    @Column(name = "ID")
    //@GeneratedValue
    private int key;

    @Column(name = "SHM_ID")
    private int shm_id;

    @Column(name = "PERMISSION")
    private String permission;

    @Column(name = "SIZE")
    private int size;

    @Column(name = "PROC_NUMBER")
    private int procNumber;

    //@Column(name = "'Last Att, Det'")//todo
    private String lastAttDet;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getProcNumber() {
        return procNumber;
    }

    public void setProcNumber(int procNumber) {
        this.procNumber = procNumber;
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

    public String getLastAttDet() {
        return lastAttDet;
    }

    public void setLastAttDet(String lastAttDet) {
        this.lastAttDet = lastAttDet;
    }

    @Override
    public String toString() {
        return "SharedMemory{" +
                "key=" + key +
                ", shm_id=" + shm_id +
                ", permission='" + permission + '\'' +
                ", size=" + size +
                ", procNumber=" + procNumber +
                ", lastAttDet=" + lastAttDet +
                ", type='" + type + '\'' +
                ", OWNER='" + OWNER + '\'' +
                '}';
    }
}