package ann.project.systemmonitoring.system.datageneration.consts;

import java.util.ArrayList;
import java.util.List;

public final class ConstIPCQueue {

    public static List<String> types = new ArrayList<String>() {
        {
            add("HSM messages");
            add("tcpcomms");
            add("Crout messages");
            add("Authorization");
            add("");
        }
    };
    public static List<String> owners = new ArrayList<String>() {
        {
            add("txrout");
            add("stdauth");
            add("crout");
            add("spring");
            add("posint");
            add("epayint");
            add("fraudint");
            add("hsm_mcp");
            add("hstint");
            add("");

        }
    };
}
