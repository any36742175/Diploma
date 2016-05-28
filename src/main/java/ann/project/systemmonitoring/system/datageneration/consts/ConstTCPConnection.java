package ann.project.systemmonitoring.system.datageneration.consts;

import java.util.ArrayList;
import java.util.List;

public class ConstTCPConnection {
    public static List<String> states = new ArrayList<String>() {
        {
            add("LISTENING");
            add("SYN-SENT");
            add("SYN-RECEIVED");
            add("ESTABLISHED");
            add("CLOSE-WAIT");
            add("TIME-WAIT");
        }
    };

}
