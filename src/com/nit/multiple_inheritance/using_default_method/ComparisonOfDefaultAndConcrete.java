package com.nit.multiple_inheritance.using_default_method;

// Interface with default method
interface Sayable 
{
    default void say() 
    {
        IO.println("Interface default say method");
    }
}

// Concrete class with method of same name
class Say 
{
    public void say() 
    {
        IO.println("Class concrete method say");
    }
}

// Class extending concrete class and implementing interface
class MyImplementer extends Say implements Sayable 
{
    // No need to override say() because class method wins over interface default
}

// Main class
public class ComparisonOfDefaultAndConcrete 
{

    public static void main(String[] args) 
    {
        new MyImplementer().say(); // Calls class method, not interface default
    }
}

