/**
 * 
 */
package com.browsewhat.app.utils;

/**
 * @author krahul
 *
 */
public final class BWLogger {

    public static void trace(String message) {
        System.out.println(message);
    }

    public static void trace(String message, String... args) {
        System.out.println(message);
    }

    public static void trace(String message, Throwable e, String... args) {
        System.out.println(message);
    }

    public static void info(String message) {
        System.out.println(message);
    }

    public static void info(String message, String... args) {
        System.out.println(message);
    }

    public static void info(String message, Throwable e, String... args) {
        System.out.println(message);
    }

    public static void debug(String message) {
        System.out.println(message);
    }

    public static void debug(String message, String... args) {
        System.out.println(message);
    }

    public static void debug(String message, Throwable e, String... args) {
        System.out.println(message);
    }

    public static void error(String message) {
        System.out.println(message);
    }

    public static void error(String message, String... args) {
        System.out.println(message);
    }

    public static void error(String message, Throwable e) {
        System.out.println(message);
        e.printStackTrace();
    }
    
    public static void error(String message, Throwable e, String... args) {
        System.out.println(message);
    }

    public static void fatal(String message) {
        System.out.println(message);
    }

    public static void fatal(String message, String... args) {
        System.out.println(message);
    }

    public static void fatal(String message, Throwable e, String... args) {
        System.out.println(message);
    }
}
