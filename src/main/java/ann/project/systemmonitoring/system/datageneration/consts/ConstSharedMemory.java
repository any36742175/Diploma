package ann.project.systemmonitoring.system.datageneration.consts;

import java.util.ArrayList;
import java.util.List;

public class ConstSharedMemory {

    public static List<String> types = new ArrayList<String>() {
        {
            add("IPC queue list");
            add("IPC control");
            add("Trans. cache");
            add("IPC control");
            add("");
        }
    };
    public static List<String> owners = new ArrayList<String>() {
        {
            add("SVFE");
            add("stdauth");
            add("atmint");
            add("spring");
            add("posint");
            add("epayint");
            add("fraudint");
            add("hstint");
            add("");

        }
    };
}
