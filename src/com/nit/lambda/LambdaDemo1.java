package com.nit.lambda;

interface Vehicle {
    void run();
}

public class LambdaDemo1 {
    public static void main(String[] args) {

        Vehicle car = () -> IO.println("Car is running");
        car.run();

        Vehicle bus = () -> IO.println("Bus is running");
        bus.run();

        Vehicle bike = () -> IO.println("Bike is running");
        bike.run();
    }
}
