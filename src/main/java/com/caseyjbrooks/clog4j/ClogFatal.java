package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.ClogLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;

public class ClogFatal implements ClogLogger {

    private static final Logger logger = LogManager.getLogger(ClogFatal.class);

    public int log(String tag, String message) {
        logger.fatal(MarkerManager.getMarker(tag), message);
        return 0;
    }

    public int log(String tag, String message, Throwable throwable) {
        logger.fatal(MarkerManager.getMarker(tag), message, throwable);
        return 0;
    }
}
