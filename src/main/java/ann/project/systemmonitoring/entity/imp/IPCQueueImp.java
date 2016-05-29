package ann.project.systemmonitoring.entity.imp;

import ann.project.systemmonitoring.entity.IPCQueue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IPC_QUEUES")
public class IPCQueueImp implements IPCQueue, Comparable<IPCQueueImp> {
    @Id
    @Column(name = "ID")
    //@GeneratedValue
    private String queueId;

    @Column(name = "PERMISSION")
    private String permission;

    @Column(name = "QUEUE_SIZE")//todo
    private int queueSize;

    @Column(name = "MESSAGES")//todo
    private int messages;

    @Column(name = "LAST_OPERATION")//todo
    private String lastOperation;

    @Column(name = "QUEUE_TYPE")
    private String Type;

    @Column(name = "OWNER")
    private String OWNER;

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(int queueSize) {
        this.queueSize = queueSize;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public String getType() {
        return Type;
    }

    public void setType(String queueType) {
        this.Type = queueType;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER;
    }

    @Override
    public String toString() {
        return "IPCQueueImp{" +
                "queueId=" + queueId +
                ", permission='" + permission + '\'' +
                ", queueSize=" + queueSize +
                ", messages='" + messages + '\'' +
                ", lastOperation='" + lastOperation + '\'' +
                ", Type='" + Type + '\'' +
                ", OWNER='" + OWNER + '\'' +
                '}';
    }


    @Override
    public int compareTo(IPCQueueImp o) {
        return this.getLastOperation().compareTo(o.getLastOperation());
    }
}