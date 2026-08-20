package com.nit.method_hiding;

class Animal 
{
    public static int numberOfEyes = 2;   // static variable
    public int numberOfEars = 2;           // non-static variable

    public static void sleep() 
    {           // static method
        IO.println("Animal is sleeping");
    }
}

class Dog extends Animal 
{
    public static void sleep() 
    {           // method hiding
        IO.println("Dog is sleeping");
    }
}

class Horse extends Animal 
{
    public static void sleep() 
    {           // method hiding
        IO.println("Horse is sleeping");
    }
}
                                     			/*Mantra (Corrected & Perfect ✅)
												Using upcasting, whenever we call static field, 
											    non-static field, or static method, 
												they are executed using the current reference type.**/

public class MethodHiding 
{
    public static void main(String[] args) 
    {
        Animal animal = new Horse();   // upcasting
        IO.println("Number of eyes : " + Animal.numberOfEyes);
        IO.println("Number of ears : " + animal.numberOfEars);

        Animal.sleep();
    }
}

