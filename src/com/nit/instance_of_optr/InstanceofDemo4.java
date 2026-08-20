package com.nit.instance_of_optr;

class Vehicle 
{
    public void run() 
    {
        System.out.println("Vehicle is running");
    }
}

class BMW extends Vehicle 
{
}

class Audi extends Vehicle 
{
}

public class InstanceofDemo4 
{

    public static void main(String[] args) 
    {

        BMW b = new BMW();
        acceptCarType(b);

        // Audi a = new Audi();
        // acceptCarType(a);
    }

    public static void acceptCarType(Vehicle v) 
    {
        if (v instanceof BMW) 
        {
            System.out.println("BMW Car");
        }
        else if (v instanceof Audi) 
        {
            System.out.println("AUDI Car");
        }
    }
}
