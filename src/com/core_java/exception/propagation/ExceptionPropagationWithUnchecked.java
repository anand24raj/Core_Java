package com.core_java.exception.propagation;

public class ExceptionPropagationWithUnchecked 
{
    public static void main(String[] args) 
    {
        IO.println("Main method started!!!");
        m1();
        IO.println("Main method ended!!!");
    }

    public static void m1() 
    {
        IO.println("m1 method started!!!");
        m2();
        IO.println("m1 method ended!!!");
    }

    public static void m2() 
    {
        IO.println("m2 method started!!!");
        try 
        {
            IO.println(10 / 0);
        } 
        catch (ArithmeticException e) 
        {
            IO.println("Handled by m2");
        }
        IO.println("m2 method ended!!!");
    }
}