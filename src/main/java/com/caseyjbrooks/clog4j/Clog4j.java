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
        HashMap<String, ClogLogger> loggers = new HashMap<>();
        loggers.put(null, new ClogInfo());
        loggers.put(Clog.KEY_V,   new ClogTrace());
        loggers.put(Clog.KEY_D,   new ClogDebug());
        loggers.put(Clog.KEY_I,   new ClogInfo());
        loggers.put(Clog.KEY_W,   new ClogWarn());
        loggers.put(Clog.KEY_E,   new ClogError());
        loggers.put(Clog.KEY_WTF, new ClogFatal());

        return new Clog(loggers, formatter);
    }

    public static Clog getProductionClog() {
        ClogFormatter formatter = new Parseltongue();
        HashMap<String, ClogLogger> loggers = new HashMap<>();
        loggers.put(null, new EmptyLogger());
        loggers.put(Clog.KEY_V,   new EmptyLogger());
        loggers.put(Clog.KEY_D,   new EmptyLogger());
        loggers.put(Clog.KEY_I,   new EmptyLogger());
        loggers.put(Clog.KEY_W,   new EmptyLogger());
        loggers.put(Clog.KEY_E,   new EmptyLogger());
        loggers.put(Clog.KEY_WTF, new EmptyLogger());

        return new Clog(loggers, formatter);
    }

}
