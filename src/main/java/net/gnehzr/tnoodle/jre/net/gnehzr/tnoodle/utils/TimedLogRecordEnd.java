package net.gnehzr.tnoodle.jre.net.gnehzr.tnoodle.utils;

import java.util.logging.Level;
import java.util.logging.LogRecord;

@SuppressWarnings("serial")
public class TimedLogRecordEnd extends LogRecord {
    public TimedLogRecordEnd(Level level, String msg, String extraMsg, long startMillis, long endMillis) {
        super(level, format(msg, extraMsg, startMillis, endMillis));
    }

    private static String format(String msg, String extraMsg, long startMillis, long endMillis) {
        String str = "FINISHED " + msg + " (took " + String.format("%.2f", (endMillis - startMillis) / 1000.0) + " seconds";
        if (extraMsg != null) {
            str += ", " + extraMsg;
        }
        str += ")";
        return str;
    }
}
