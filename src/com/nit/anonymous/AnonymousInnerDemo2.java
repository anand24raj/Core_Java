package com.nit.anonymous;

abstract class Shape {
    public abstract void draw();
}

public class AnonymousInnerDemo2 {
    public static void main(String[] args) {

        Shape circle = new Shape() {
            @Override
            public void draw() {
                IO.println("Drawing Circle");
            }
        };

        circle.draw();
    }
}
