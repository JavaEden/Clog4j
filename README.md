# Clog4j
Clog logger implementation for Log4j

See https://github.com/cjbrooks12/Clog for information on Clog.

### Clog4j Implementation

Clog4j provides simple Log4j implementations for Clog. The mapping between Clog levels and Log4j levels is as follows:

`Clog.d(...) --> logger.debug(...)`

`Clog.e(...) --> logger.error(...)`

`Clog.i(...) --> logger.info(...)`

`Clog.v(...) --> logger.trace(...)`

`Clog.w(...) --> logger.warn(...)`

`Clog.wtf(...) --> logger.fatal(...)`

In addition, Clog tags map to Log4j Markers, like so:

```
d(String tag, String message) {
  logger.debug(MarkerManager.getMarker(tag), message);
}
```
