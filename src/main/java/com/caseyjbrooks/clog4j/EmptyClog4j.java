package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.ClogLogger;

public class EmptyClog4j implements ClogLogger {
    public int log(String tag, String message) {
        return 0;
    }

    public int log(String tag, String message, Throwable throwable) {
        return 0;
    }
}
