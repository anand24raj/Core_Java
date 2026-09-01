package com.core_java.exception.propagation;

class Foo 
{
    static 
    {
        IO.println("Foo class static block");
    }
}

public class ExceptionPropagationWithCheckedException 
{
    public static void main(String[] args) 
    {
        IO.println("Main method started!!!");

        try 
        {
            m1();
        } 
        catch (ClassNotFoundException e) 
        {
            IO.println("Handled by main method");
        }

        IO.println("Main method ended!!!");
    }

    public static void m1() throws ClassNotFoundException 
    {
        IO.println("m1 method started!!!");
        m2();
        IO.println("m1 method ended!!!");
    }

    public static void m2() throws ClassNotFoundException 
    {
        IO.println("m2 method started!!!");
        Class.forName("com.nit.exception.propagation.Foo1"); // Wrong class name intentionally
        IO.println("m2 method ended!!!");
    }
}
