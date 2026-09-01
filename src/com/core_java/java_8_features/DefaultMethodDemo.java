package com.core_java.java_8_features;

public class DefaultMethodDemo {

    public static void main(String[] args) {

        Vehicle vehicle;

        vehicle = new Car();
        vehicle.run();
        vehicle.horn();
        vehicle.digitalMeter(); // Calls overridden version in Car

        vehicle = new Bike();
        vehicle.run();
        vehicle.horn();
        vehicle.digitalMeter(); // Calls default method from interface
    }
}
