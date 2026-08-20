package com.nit.java_8_features;

// Java 8 interface with default method
public interface Vehicle {
    void run();        // abstract method
    void horn();       // abstract method

    // Default method (JDK 1.8 feature)
    default void digitalMeter() {
        IO.println("Default Implementation of digitalMeter");
    }
}

