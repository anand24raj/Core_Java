package com.nit.objectclass.Sealed_demo;

sealed interface Vehicle permits Car, Bike, Bus
{

    void start();
}
final class Bus implements Vehicle 
{

    @Override
    public void start() 
    {
        IO.println("Bus is starting with heavy engine");
    }
}
non-sealed class Car implements Vehicle 
{

    @Override
    public void start() 
    {
        IO.println("Car is starting with key ignition");
    }
}
non-sealed class Bike implements Vehicle 
{

    @Override
    public void start() 
    {
        IO.println("Bike is starting with self start");
    }
}
public class SealedDemo2 
{

    public static void main(String[] args) 
    {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

        v = new Bus();
        v.start();
    }
}