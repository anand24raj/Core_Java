package com.nit.exception.basic;

public class SpecificException 
{
    public static void main(String[] args) 
    {

        IO.println("Main method started");

        try 
        {
            int x = 10 / 0;
            IO.println("x value is :" + x);
        } 
        catch (ArithmeticException e) 
        {
            IO.println("Don't divide a number by zero");
        }

        IO.println("Main method ended");
    }
}