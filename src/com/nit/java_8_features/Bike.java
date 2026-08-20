package com.nit.java_8_features;

public class Bike implements Vehicle {

    @Override
    public void run() {
        IO.println("Bike is running");
    }

    @Override
    public void horn() {
        IO.println("PEEP PEEP");
    }

    // No override of digitalMeter() → will use default implementation
}
