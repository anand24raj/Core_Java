package com.nit.abstraction;

abstract class Vehicles {
    protected String name;

    public Vehicles(String name) {
	super();
	this.name = name;
    }

    public abstract void run();
}

class Bike extends Vehicles {

    public Bike(String bikeName) {
	super(bikeName);
    }

    @Override
    public void run() {
	IO.println(name + " is running");
    }
}

class Car1 extends Vehicles {
    public Car1(String carName) {
	super(carName);
    }

    @Override
    public void run() {
	IO.println(name + " is running");
    }
}

public class AbstractDemo4 {
    public static void main(String[] args) {
	Vehicles vehicle = null;
	vehicle = new Car1("Naxon");
	vehicle.run();
	vehicle = new Bike("Bullet");
	vehicle.run();
    }
}