/*You are building a Vehicle Management System for a transport company.

There is a Vehicle class that represents all vehicles.

You want to ensure every vehicle can start its engine, but the exact implementation depends on the vehicle type.

A developer mistakenly tries to make the constructor abstract or a static method abstract, which causes compiler errors.

This program demonstrates how to correctly use abstract classes, constructors, and static methods in Java.

Learning Objectives

Understand that constructors cannot be abstract.

Understand that static methods cannot be abstract.

Learn how abstract instance methods can enforce behavior in subclasses.

Learn how to implement abstract methods in concrete subclasses.

Requirements

Create an abstract class Vehicle with:

A constructor to initialize the brand attribute (cannot be abstract).

A static method displayCategory() to print "This is a vehicle." (cannot be abstract).

An abstract instance method startEngine() to be implemented by subclasses.

Create a concrete subclass Car that:

Inherits from Vehicle.

Implements the startEngine() method, printing "Car engine started.".

In the Main class, do the following:

Call the static method from Vehicle.

Instantiate a Car object.

Call the startEngine() method on the Car object.
*/

package com.nit.abstraction;

abstract class Vehicle
{
    protected String brand;

    public Vehicle(String brand) 
    {
        this.brand = brand;
    }
    
    public static void displayCategory()
    {
        
    }
    
    public abstract void startEngine();

}

class Car extends Vehicle 
{

    public Car(String brand) 
    {
        super(brand);
    }

    @Override
    public void startEngine() 
    {
        IO.println("Car engine started.");
    }
}



public class VehicleManagementSystem 
{ 
    void main() {
        
        Vehicle.displayCategory();

        String brand = IO.readln();
        Car C = new Car(brand);

        C.startEngine();

    }
}
