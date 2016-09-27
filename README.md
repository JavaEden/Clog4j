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

Getting Clog4j integrated into your project is easy. Add the following to your project's initialization, such as your `main()` method:

```java
if(isDebug) { // <-- isDebug is a flag indicating your build is in development, replace with your actual debug check
    Clog.setCurrentProfile("dev", Clog4j.getDevelopmentClog());
}
else {
    Clog.setCurrentProfile("prod", Clog4j.getProductionClog());
}
```

In development, all logs will be directed to the Log4j implementations shown above, but in production, all logs will be discarded. You can replace the production log profile with implementations that write to file or send to your a database if you need that instead.

### Download
Clog and Clog4j is distrubuted through JitPack.io.

[![](https://jitpack.io/v/cjbrooks12/Clog4j.svg)](https://jitpack.io/#cjbrooks12/Clog4j)
[![JitPack Javadoc](https://img.shields.io/github/tag/cjbrooks12/Clog.svg?maxAge=2592000&label=javadoc)](https://jitpack.io/com/github/cjbrooks12/Clog/v1.0.0/javadoc/)
[![Github Releases](https://img.shields.io/github/downloads/cjbrooks12/Clog4j/latest/total.svg?maxAge=2592000)]()

In your project-level `build.gradle`:

```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

In your module's `build.gradle` (replace the version with the most recent release shown on badge above):
```groovy
dependencies {
    ...
    compile('com.github.cjbrooks12:Clog4j:v1.0.0') {
        transitive = true;
    }
}
```

You will need to add a Log4j configuration file to your project for any logging of priotity lower than `error` to show. Add a file called `log4j2.xml` to `src/main/resources/` as your configuration file. A basic example configuration is shown below:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
    <Appenders>
        <Console name="STDOUT" target="SYSTEM_OUT">
            <PatternLayout pattern="%d %-5p [%t] %C{2} (%F:%L) - %m%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Logger name="org.apache.log4j.xml" level="info"/>
        <Root level="trace">
            <AppenderRef ref="STDOUT"/>
        </Root>
    </Loggers>
</Configuration>
```
