package com.nit.abstraction;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
	IO.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
	IO.println("Drawing Square");
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
	Shape s;
	s = new Circle();
	s.draw();
	s = new Square();
	s.draw();
    }
}
