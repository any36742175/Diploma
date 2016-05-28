package ann.project.systemmonitoring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TERMINAL")
public class Terminal {
    @Id
    @Column(name = "ID")
    //@GeneratedValue
    private String terminalID;

    @Column(name = "TERMINAL_TYPE")
    private String terminalType;

    @Column(name = "CURRENT_NODE")//todo
    private String currentNode;

    @Column(name = "CONNECTION_TIME")//todo
    private String connectionTime;

    @Column(name = "PREVIOUS_NODE")//todo
    private String previousNode;

    @Column(name = "OWNING_NODES")
    private String owningNodes;

    @Column(name = "STATUSES")
    private String status;

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(String currentNode) {
        this.currentNode = currentNode;
    }

    public String getConnetcionTime() {
        return connectionTime;
    }

    public void setConnetcionTime(String connetcionTime) {
        this.connectionTime = connetcionTime;
    }

    public String getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(String previousNode) {
        this.previousNode = previousNode;
    }

    public String getOwningNodes() {
        return owningNodes;
    }

    public void setOwningNodes(String owningNodes) {
        this.owningNodes = owningNodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "terminalID='" + terminalID + '\'' +
                ", terminalType='" + terminalType + '\'' +
                ", currentNode=" + currentNode +
                ", connetcionTime='" + connectionTime + '\'' +
                ", previousNode='" + previousNode + '\'' +
                ", owningNodes='" + owningNodes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}