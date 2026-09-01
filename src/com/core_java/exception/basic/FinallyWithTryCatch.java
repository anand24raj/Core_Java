package com.core_java.exception.basic;

public class FinallyWithTryCatch 
{

    public static void main(String[] args) 
    {

        IO.println("Main method started!!!");

        try 
        {
            int x = 10 / 0;
        }
        catch (ArithmeticException e) 
        {
            IO.println("Exception Handled");
        }
        finally 
        {
            IO.println("Resources Handled");
        }

        IO.println("Main method ended!!!");
    }
}