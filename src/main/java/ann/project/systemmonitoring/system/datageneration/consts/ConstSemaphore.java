package ann.project.systemmonitoring.system.datageneration.consts;

import java.util.ArrayList;
import java.util.List;

public class ConstSemaphore {

    public static List<String> types = new ArrayList<String>() {
        {
            add("Multiple access control");
            add("Trans. cache");
            add("");
        }
    };
    public static List<String> owners = new ArrayList<String>() {
        {
            add("SVFE");
            add("hstint");
            add("");

        }
    };
}
