package com.core_java.Array;

// Polymorphism using Abstract Class and Method Overriding

abstract class Shape 
{
    public abstract String area();
}

class Square extends Shape 
{
    private int side;

    public Square(int side) 
    {
    	super();
        this.side = side;
    }

    @Override
    public String area() 
    {
        return "Area of Square : " + (side * side);
    }
}

class Circle extends Shape 
{
    double radius;
    final double PI = 3.14;

    public Circle(double radius) 
    {
    	super();
        this.radius = radius;
    }

    @Override
    public String area() 
    {
        return "Area of Circle : " + (PI * radius * radius);
    }
}

class Rectangle extends Shape 
{

    private int length, breadth;

    public Rectangle(int length, int breadth) 
    {
    	super();
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String area() 
    {
        return "Area of Rectangle : " + (length * breadth);
    }
}

public class ArrayEx19Polymorphism
{
    public static void main(String[] args) 
    {
        Shape[] shape = new Shape[3];

        shape[0] = new Square(5);
        shape[1] = new Circle(2.0);
        shape[2] = new Rectangle(10, 20);

        getShape(shape);
    }

    public static void getShape(Shape[] shape) 
    {
        for (Shape s : shape) 
        {
            IO.println(s.area());
        }
    }
}