package com.yi.spring.slf4j;


public class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz.getName());
    }
}
