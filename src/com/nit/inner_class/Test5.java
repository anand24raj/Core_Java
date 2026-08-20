package com.nit.inner_class;

class Car {
    private String make;
    private String model;
    private final Engine engine;

    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsePower);
    }

    // Inner class
    private class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void start() {
            IO.println("Engine started with Horsepower: " + horsePower);
        }

        public void stop() {
            IO.println("Engine stopped.");
        }
    }

    public void startCar() {
        IO.println("Starting " + make + " " + model);
        engine.start();
    }

    public void stopCar() {
        IO.println("Stopping " + make + " " + model);
        engine.stop();
    }
}

public class Test5 {
    public static void main(String[] args) {
        Car myCar = new Car("Swift", "Desire", 120);
        myCar.startCar();
        myCar.stopCar();
    }
}
