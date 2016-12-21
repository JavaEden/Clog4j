package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.ClogLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;

public class ClogWarn implements ClogLogger {

    private static final Logger logger = LogManager.getLogger(ClogWarn.class);

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public int log(String tag, String message) {
        logger.warn(MarkerManager.getMarker(tag), message);
        return 0;
    }

    @Override
    public int log(String tag, String message, Throwable throwable) {
        logger.warn(MarkerManager.getMarker(tag), message, throwable);
        return 0;
    }

    @Override
    public int priority() {
        return 4;
    }
}
