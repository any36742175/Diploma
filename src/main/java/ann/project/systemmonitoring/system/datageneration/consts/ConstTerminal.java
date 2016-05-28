package ann.project.systemmonitoring.system.datageneration.consts;

import java.util.ArrayList;
import java.util.List;

public class ConstTerminal {
    public static String NOT_ACTIVE = "Not Active";
    public static String ACTIVE = "Active";
    public static String DISABLED = "Disabled";

    public static List<String> terminalTypes = new ArrayList<String>() {
        {
            add("ATM");
            add("POS");
            add("ePOS");
        }
    };
    public static List<String> terminalStatuses = new ArrayList<String>() {
        {
            add(NOT_ACTIVE);
            add(ACTIVE);
            add(DISABLED);
        }
    };
}
