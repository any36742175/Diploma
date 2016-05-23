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
    private int currentNode;

    @Column(name = "CONNECTION_TIME")//todo
    private String connetcionTime;

    @Column(name = "PREVIOUS_NODE")//todo
    private int previousNode;

    @Column(name = "OWNING_NODES")
    private String owningNodes;

    @Column(name = "STATUSES")
    private String statuses;

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

    public int getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(int currentNode) {
        this.currentNode = currentNode;
    }

    public String getConnetcionTime() {
        return connetcionTime;
    }

    public void setConnetcionTime(String connetcionTime) {
        this.connetcionTime = connetcionTime;
    }

    public int getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(int previousNode) {
        this.previousNode = previousNode;
    }

    public String getOwningNodes() {
        return owningNodes;
    }

    public void setOwningNodes(String owningNodes) {
        this.owningNodes = owningNodes;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "terminalID='" + terminalID + '\'' +
                ", terminalType='" + terminalType + '\'' +
                ", currentNode=" + currentNode +
                ", connetcionTime='" + connetcionTime + '\'' +
                ", previousNode='" + previousNode + '\'' +
                ", owningNodes='" + owningNodes + '\'' +
                ", statuses='" + statuses + '\'' +
                '}';
    }
}