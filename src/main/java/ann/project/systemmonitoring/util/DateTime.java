package ann.project.systemmonitoring.util;

import java.util.Date;

/**
 * Возвращаяет текущую дату в опрделенном формате
 */
public class DateTime {
    public static String getCurrentDateTimeFormate() {
        return "" + new Date();
    }
}
