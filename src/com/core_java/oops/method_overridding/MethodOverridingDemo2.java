package com.core_java.oops.method_overridding;

class Shape {
    public void draw() {
        IO.println("Generic Shape");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        IO.println("Drawing Square");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        IO.println("Drawing Rectangle");
    }
}

public class MethodOverridingDemo2 {
    public static void main(String[] args) {

        Shape s = null;   // reference variable

        // Dynamic Method Dispatch
        s = new Square();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}

