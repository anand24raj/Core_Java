package com.nit.interfaces;

interface Moveable {
    int SPEED = 90;   // public static final by default

    void move();      // public abstract by default
}

class Car implements Moveable {

    @Override
    public void move() {
        // SPEED = 120; // ❌ Not allowed (final variable)
        IO.println("Car speed is : " + SPEED + " KM/HR");
    }
}

public class InterfaceDemo1 {

    public static void main(String[] args) {
        Moveable moveable = new Car();
        moveable.move();

        IO.println("Moveable object Speed is : " + Moveable.SPEED + " KM/HR");
    }
}

