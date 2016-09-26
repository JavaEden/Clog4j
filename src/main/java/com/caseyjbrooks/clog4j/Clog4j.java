package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.Clog;
import com.caseyjbrooks.clog.ClogFormatter;
import com.caseyjbrooks.clog.ClogLogger;
import com.caseyjbrooks.clog.EmptyLogger;
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
        loggers.put(null, new EmptyLogger());
        loggers.put("d", new EmptyLogger());
        loggers.put("e", new EmptyLogger());
        loggers.put("i", new EmptyLogger());
        loggers.put("v", new EmptyLogger());
        loggers.put("w", new EmptyLogger());
        loggers.put("wtf", new EmptyLogger());

        return new Clog(loggers, formatter);
    }

}
