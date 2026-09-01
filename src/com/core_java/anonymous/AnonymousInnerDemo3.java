package com.core_java.anonymous;

interface Moveable {
    void move();
}

public class AnonymousInnerDemo3 {
    public static void main(String[] args) {

        Moveable car = new Moveable() {
            @Override
            public void move() {
                IO.println("Car is moving");
            }
        };

        car.move();
    }
}
