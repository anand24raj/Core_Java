package com.core_java.oops.abstraction;

abstract class Cars {
    protected int speed = 120;

    public Cars() {
        IO.println("Car class constructor");
    }

    public void getCarDetails() {
        IO.println("Car has one engine and 4 wheels");
    }

    public abstract void run();
}

class BMW extends Cars {
    @Override
    public void run() {
        IO.println("BMW Car is running");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Cars car = new BMW();

        IO.println("BMW speed is: " + car.speed);
        car.getCarDetails();
        car.run();
    }
}

//Note : abstract class constructor will be executed through sub class object by using super)