package org.slf4j.impl;

import com.caseyjbrooks.clog.Clog;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class Clog4jLoggerImpl implements Logger {

    private String name;

    public Clog4jLoggerImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // What is enabled?
    @Override
    public boolean isTraceEnabled() { return true; }
    @Override
    public boolean isTraceEnabled(Marker marker) { return true; }

    @Override
    public boolean isDebugEnabled() { return true; }
    @Override
    public boolean isDebugEnabled(Marker marker) { return true; }

    @Override
    public boolean isInfoEnabled() { return true; }
    @Override
    public boolean isInfoEnabled(Marker marker) { return true; }

    @Override
    public boolean isWarnEnabled() { return true; }
    @Override
    public boolean isWarnEnabled(Marker marker) { return true; }

    @Override
    public boolean isErrorEnabled() { return true; }
    @Override
    public boolean isErrorEnabled(Marker marker) { return true; }

    // Logger implementations
    @Override public void trace(String msg)                                             { Clog.pushTag(name);             Clog.v(msg);                Clog.popTag(); }
    @Override public void trace(String format, Object arg)                              { Clog.pushTag(name);             Clog.v(format, arg);        Clog.popTag(); }
    @Override public void trace(String format, Object arg1, Object arg2)                { Clog.pushTag(name);             Clog.v(format, arg1, arg2); Clog.popTag(); }
    @Override public void trace(String format, Object... arguments)                     { Clog.pushTag(name);             Clog.v(format, arguments);  Clog.popTag(); }
    @Override public void trace(String msg, Throwable t)                                { Clog.pushTag(name);             Clog.v(msg, t);             Clog.popTag(); }
    @Override public void trace(Marker marker, String msg)                              { Clog.pushTag(marker.getName()); Clog.v(msg);                Clog.popTag(); }
    @Override public void trace(Marker marker, String format, Object arg)               { Clog.pushTag(marker.getName()); Clog.v(format, arg);        Clog.popTag(); }
    @Override public void trace(Marker marker, String format, Object arg1, Object arg2) { Clog.pushTag(marker.getName()); Clog.v(format, arg1, arg2); Clog.popTag(); }
    @Override public void trace(Marker marker, String format, Object... argArray)       { Clog.pushTag(marker.getName()); Clog.v(format, argArray);   Clog.popTag(); }
    @Override public void trace(Marker marker, String msg, Throwable t)                 { Clog.pushTag(marker.getName()); Clog.v(msg, t);             Clog.popTag(); }

    @Override public void debug(String msg)                                             { Clog.pushTag(name);             Clog.d(msg);                Clog.popTag(); }
    @Override public void debug(String format, Object arg)                              { Clog.pushTag(name);             Clog.d(format, arg);        Clog.popTag(); }
    @Override public void debug(String format, Object arg1, Object arg2)                { Clog.pushTag(name);             Clog.d(format, arg1, arg2); Clog.popTag(); }
    @Override public void debug(String format, Object... arguments)                     { Clog.pushTag(name);             Clog.d(format, arguments);  Clog.popTag(); }
    @Override public void debug(String msg, Throwable t)                                { Clog.pushTag(name);             Clog.d(msg, t);             Clog.popTag(); }
    @Override public void debug(Marker marker, String msg)                              { Clog.pushTag(marker.getName()); Clog.d(msg);                Clog.popTag(); }
    @Override public void debug(Marker marker, String format, Object arg)               { Clog.pushTag(marker.getName()); Clog.d(format, arg);        Clog.popTag(); }
    @Override public void debug(Marker marker, String format, Object arg1, Object arg2) { Clog.pushTag(marker.getName()); Clog.d(format, arg1, arg2); Clog.popTag(); }
    @Override public void debug(Marker marker, String format, Object... argArray)       { Clog.pushTag(marker.getName()); Clog.d(format, argArray);   Clog.popTag(); }
    @Override public void debug(Marker marker, String msg, Throwable t)                 { Clog.pushTag(marker.getName()); Clog.d(msg, t);             Clog.popTag(); }

    @Override public void info(String msg)                                              { Clog.pushTag(name);             Clog.i(msg);                Clog.popTag(); }
    @Override public void info(String format, Object arg)                               { Clog.pushTag(name);             Clog.i(format, arg);        Clog.popTag(); }
    @Override public void info(String format, Object arg1, Object arg2)                 { Clog.pushTag(name);             Clog.i(format, arg1, arg2); Clog.popTag(); }
    @Override public void info(String format, Object... arguments)                      { Clog.pushTag(name);             Clog.i(format, arguments);  Clog.popTag(); }
    @Override public void info(String msg, Throwable t)                                 { Clog.pushTag(name);             Clog.i(msg, t);             Clog.popTag(); }
    @Override public void info(Marker marker, String msg)                               { Clog.pushTag(marker.getName()); Clog.i(msg);                Clog.popTag(); }
    @Override public void info(Marker marker, String format, Object arg)                { Clog.pushTag(marker.getName()); Clog.i(format, arg);        Clog.popTag(); }
    @Override public void info(Marker marker, String format, Object arg1, Object arg2)  { Clog.pushTag(marker.getName()); Clog.i(format, arg1, arg2); Clog.popTag(); }
    @Override public void info(Marker marker, String format, Object... argArray)        { Clog.pushTag(marker.getName()); Clog.i(format, argArray);   Clog.popTag(); }
    @Override public void info(Marker marker, String msg, Throwable t)                  { Clog.pushTag(marker.getName()); Clog.i(msg, t);             Clog.popTag(); }

    @Override public void warn(String msg)                                              { Clog.pushTag(name);             Clog.w(msg);                Clog.popTag(); }
    @Override public void warn(String format, Object arg)                               { Clog.pushTag(name);             Clog.w(format, arg);        Clog.popTag(); }
    @Override public void warn(String format, Object arg1, Object arg2)                 { Clog.pushTag(name);             Clog.w(format, arg1, arg2); Clog.popTag(); }
    @Override public void warn(String format, Object... arguments)                      { Clog.pushTag(name);             Clog.w(format, arguments);  Clog.popTag(); }
    @Override public void warn(String msg, Throwable t)                                 { Clog.pushTag(name);             Clog.w(msg, t);             Clog.popTag(); }
    @Override public void warn(Marker marker, String msg)                               { Clog.pushTag(marker.getName()); Clog.w(msg);                Clog.popTag(); }
    @Override public void warn(Marker marker, String format, Object arg)                { Clog.pushTag(marker.getName()); Clog.w(format, arg);        Clog.popTag(); }
    @Override public void warn(Marker marker, String format, Object arg1, Object arg2)  { Clog.pushTag(marker.getName()); Clog.w(format, arg1, arg2); Clog.popTag(); }
    @Override public void warn(Marker marker, String format, Object... argArray)        { Clog.pushTag(marker.getName()); Clog.w(format, argArray);   Clog.popTag(); }
    @Override public void warn(Marker marker, String msg, Throwable t)                  { Clog.pushTag(marker.getName()); Clog.w(msg, t);             Clog.popTag(); }

    @Override public void error(String msg)                                             { Clog.pushTag(name);             Clog.e(msg);                Clog.popTag(); }
    @Override public void error(String format, Object arg)                              { Clog.pushTag(name);             Clog.e(format, arg);        Clog.popTag(); }
    @Override public void error(String format, Object arg1, Object arg2)                { Clog.pushTag(name);             Clog.e(format, arg1, arg2); Clog.popTag(); }
    @Override public void error(String format, Object... arguments)                     { Clog.pushTag(name);             Clog.e(format, arguments);  Clog.popTag(); }
    @Override public void error(String msg, Throwable t)                                { Clog.pushTag(name);             Clog.e(msg, t);             Clog.popTag(); }
    @Override public void error(Marker marker, String msg)                              { Clog.pushTag(marker.getName()); Clog.e(msg);                Clog.popTag(); }
    @Override public void error(Marker marker, String format, Object arg)               { Clog.pushTag(marker.getName()); Clog.e(format, arg);        Clog.popTag(); }
    @Override public void error(Marker marker, String format, Object arg1, Object arg2) { Clog.pushTag(marker.getName()); Clog.e(format, arg1, arg2); Clog.popTag(); }
    @Override public void error(Marker marker, String format, Object... argArray)       { Clog.pushTag(marker.getName()); Clog.e(format, argArray);   Clog.popTag(); }
    @Override public void error(Marker marker, String msg, Throwable t)                 { Clog.pushTag(marker.getName()); Clog.e(msg, t);             Clog.popTag(); }

}
