package com.nit.objectclass.Sealed_demo;

sealed class Bird permits Parrot, Sparrow 
{

    public void fly() 
    {
        IO.println("Generic Bird is flying");
    }
}

final class Parrot extends Bird 
{

    @Override
    public void fly() 
    {
        IO.println("Parrot Bird is flying");
    }
}

non-sealed class Sparrow extends Bird 
{

    @Override
    public void fly() 
    {
        IO.println("Sparrow Bird is flying");
    }
}

public class SealedDemo1 
{

    public static void main(String[] args) 
    {

        Bird bird = null;

        bird = new Parrot();
        bird.fly();

        bird = new Sparrow();
        bird.fly();
    }
}