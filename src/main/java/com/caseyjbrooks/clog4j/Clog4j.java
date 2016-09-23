package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.Clog;
import com.caseyjbrooks.clog.ClogFormatter;
import com.caseyjbrooks.clog.ClogLogger;
import com.caseyjbrooks.clog.parseltongue.Parseltongue;

import java.util.HashMap;

public class Clog4j {

    public static Clog getDevelopmentClog() {
        ClogFormatter formatter = new Parseltongue();
        HashMap<String, ClogLogger> loggers = new HashMap<String, ClogLogger>();
        loggers.put(null, new ClogInfo());
        loggers.put("d", new ClogDebug());
        loggers.put("e", new ClogError());
        loggers.put("i", new ClogInfo());
        loggers.put("v", new ClogTrace());
        loggers.put("w", new ClogWarn());
        loggers.put("wtf", new ClogFatal());

        return new Clog(loggers, formatter);
    }

    public static Clog getProductionClog() {
        ClogFormatter formatter = new Parseltongue();
        HashMap<String, ClogLogger> loggers = new HashMap<String, ClogLogger>();
        loggers.put(null, new EmptyClog4j());
        loggers.put("d", new EmptyClog4j());
        loggers.put("e", new EmptyClog4j());
        loggers.put("i", new EmptyClog4j());
        loggers.put("v", new EmptyClog4j());
        loggers.put("w", new EmptyClog4j());
        loggers.put("wtf", new EmptyClog4j());

        return new Clog(loggers, formatter);
    }

}
