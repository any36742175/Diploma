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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SharedMemory that = (SharedMemory) o;

        if (key != that.key) return false;
        if (shm_id != that.shm_id) return false;
        if (size != that.size) return false;
        if (procNumber != that.procNumber) return false;
        if (permission != null ? !permission.equals(that.permission) : that.permission != null) return false;
        if (lastAttDet != null ? !lastAttDet.equals(that.lastAttDet) : that.lastAttDet != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return OWNER != null ? OWNER.equals(that.OWNER) : that.OWNER == null;

    }

    @Override
    public int hashCode() {
        int result = key;
        result = 31 * result + shm_id;
        result = 31 * result + (permission != null ? permission.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + procNumber;
        result = 31 * result + (lastAttDet != null ? lastAttDet.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (OWNER != null ? OWNER.hashCode() : 0);
        return result;
    }
}