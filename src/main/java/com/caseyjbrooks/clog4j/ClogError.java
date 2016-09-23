package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.ClogLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;

public class ClogError implements ClogLogger {

    private static final Logger logger = LogManager.getLogger(ClogError.class);

    public int log(String tag, String message) {
        logger.error(MarkerManager.getMarker(tag), message);
        return 0;
    }

    public int log(String tag, String message, Throwable throwable) {
        logger.error(MarkerManager.getMarker(tag), message, throwable);
        return 0;
    }
}
