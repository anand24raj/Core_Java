package com.core_java.exception;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {

        try 
        {
            throw new ArithmeticException("Batch 53 is dividing by zero");
        }
        catch (Exception e) 
        {
            IO.println("Inside Catch");
            System.err.println(e);
        }
    }
}
