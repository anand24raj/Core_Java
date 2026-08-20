package com.nit.java_8_features;

public class Car implements Vehicle {

    @Override
    public void run() {
        IO.println("Car is running");
    }

    @Override
    public void horn() {
        IO.println("POP POP");
    }

    @Override
    public void digitalMeter() {
        IO.println("Car is having digital meter facility");
    }
}
