package ann.project.systemmonitoring.entity.imp;


import ann.project.systemmonitoring.entity.TCPConnection;

import javax.persistence.*;

@Entity
@Table(name = "TCP_connetion")
public class TCPConnectionImp implements TCPConnection {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "Process")
    private String process;

    @Column(name = "Local_address")
    private String localAddress;

    @Column(name = "Remote_address")
    private String remoteAddress;

    @Column(name = "state")
    private String state;


    public int getId() {
        return id;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TCPConnectionImp{" +
                "id=" + id +
                ", process='" + process + '\'' +
                ", localAddress='" + localAddress + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
