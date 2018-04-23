package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

 class Logger {
    private Logger() {
        // private constructor
    }
    // static inner class - inner classes are not loaded until they are
    // referenced.
    private static class LoggerHolder {
        private static Logger logger = new Logger();
    }
    // global access point
    public static Logger getInstance() {
        return LoggerHolder.logger;
    }
    //Other methods
}
public class LoggerReflection {
    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = null;
        try {
            Constructor[] cstr = Logger.class.getDeclaredConstructors();
            for (Constructor constructor: cstr) {
                //Setting constructor accessible
                constructor.setAccessible(true);
                instance2
                    = (Logger) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("instance1="+instance1.hashCode());
        System.out.println("instance2="+instance2.hashCode());
    }
}