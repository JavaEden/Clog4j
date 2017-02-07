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
    @Override
    public void trace(String msg) { Clog.v(name, msg); }
    @Override
    public void trace(String format, Object arg) { Clog.v(name, format, arg); }
    @Override
    public void trace(String format, Object arg1, Object arg2) { Clog.v(name, format, arg1, arg2); }
    @Override
    public void trace(String format, Object... arguments) { Clog.v(name, format, arguments); }
    @Override
    public void trace(String msg, Throwable t) { Clog.v(name, msg, t); }
    @Override
    public void trace(Marker marker, String msg) { Clog.v(marker.getName(), msg); }
    @Override
    public void trace(Marker marker, String format, Object arg) { Clog.v(marker.getName(), format, arg); }
    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) { Clog.v(marker.getName(), format, arg1, arg2); }
    @Override
    public void trace(Marker marker, String format, Object... argArray) { Clog.v(marker.getName(), format, argArray); }
    @Override
    public void trace(Marker marker, String msg, Throwable t) { Clog.v(marker.getName(), msg, t); }

    @Override
    public void debug(String msg) { Clog.d(name, msg); }
    @Override
    public void debug(String format, Object arg) { Clog.d(name, format, arg); }
    @Override
    public void debug(String format, Object arg1, Object arg2) { Clog.d(name, format, arg1, arg2); }
    @Override
    public void debug(String format, Object... arguments) { Clog.d(name, format, arguments); }
    @Override
    public void debug(String msg, Throwable t) { Clog.d(name, msg, t); }
    @Override
    public void debug(Marker marker, String msg) { Clog.d(marker.getName(), msg); }
    @Override
    public void debug(Marker marker, String format, Object arg) { Clog.d(marker.getName(), format, arg); }
    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) { Clog.d(marker.getName(), format, arg1, arg2); }
    @Override
    public void debug(Marker marker, String format, Object... argArray) { Clog.d(marker.getName(), format, argArray); }
    @Override
    public void debug(Marker marker, String msg, Throwable t) { Clog.d(marker.getName(), msg, t); }

    @Override
    public void info(String msg) { Clog.i(name, msg); }
    @Override
    public void info(String format, Object arg) { Clog.i(name, format, arg); }
    @Override
    public void info(String format, Object arg1, Object arg2) { Clog.i(name, format, arg1, arg2); }
    @Override
    public void info(String format, Object... arguments) { Clog.i(name, format, arguments); }
    @Override
    public void info(String msg, Throwable t) { Clog.i(name, msg, t); }
    @Override
    public void info(Marker marker, String msg) { Clog.i(marker.getName(), msg); }
    @Override
    public void info(Marker marker, String format, Object arg) { Clog.i(marker.getName(), format, arg); }
    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) { Clog.i(marker.getName(), format, arg1, arg2); }
    @Override
    public void info(Marker marker, String format, Object... argArray) { Clog.i(marker.getName(), format, argArray); }
    @Override
    public void info(Marker marker, String msg, Throwable t) { Clog.i(marker.getName(), msg, t); }

    @Override
    public void warn(String msg) { Clog.w(name, msg); }
    @Override
    public void warn(String format, Object arg) { Clog.w(name, format, arg); }
    @Override
    public void warn(String format, Object arg1, Object arg2) { Clog.w(name, format, arg1, arg2); }
    @Override
    public void warn(String format, Object... arguments) { Clog.w(name, format, arguments); }
    @Override
    public void warn(String msg, Throwable t) { Clog.w(name, msg, t); }
    @Override
    public void warn(Marker marker, String msg) { Clog.w(marker.getName(), msg); }
    @Override
    public void warn(Marker marker, String format, Object arg) { Clog.w(marker.getName(), format, arg); }
    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) { Clog.w(marker.getName(), format, arg1, arg2); }
    @Override
    public void warn(Marker marker, String format, Object... argArray) { Clog.w(marker.getName(), format, argArray); }
    @Override
    public void warn(Marker marker, String msg, Throwable t) { Clog.w(marker.getName(), msg, t); }

    @Override
    public void error(String msg) { Clog.e(name, msg); }
    @Override
    public void error(String format, Object arg) { Clog.e(name, format, arg); }
    @Override
    public void error(String format, Object arg1, Object arg2) { Clog.e(name, format, arg1, arg2); }
    @Override
    public void error(String format, Object... arguments) { Clog.e(name, format, arguments); }
    @Override
    public void error(String msg, Throwable t) { Clog.e(name, msg, t); }
    @Override
    public void error(Marker marker, String msg) { Clog.e(marker.getName(), msg); }
    @Override
    public void error(Marker marker, String format, Object arg) { Clog.e(marker.getName(), format, arg); }
    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) { Clog.e(marker.getName(), format, arg1, arg2); }
    @Override
    public void error(Marker marker, String format, Object... argArray) { Clog.e(marker.getName(), format, argArray); }
    @Override
    public void error(Marker marker, String msg, Throwable t) { Clog.e(marker.getName(), msg, t); }

}
