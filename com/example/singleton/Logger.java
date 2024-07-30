package com.example.singleton;

public class Logger {
    private static Logger instance;

    // Private constructor prevents instantiation from other classes
    private Logger() { }

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println(message);
    }
}
