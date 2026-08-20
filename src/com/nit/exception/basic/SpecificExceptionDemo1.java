package com.nit.exception.basic;

public class SpecificExceptionDemo1 
{
    public static void main(String[] args) 
    {

        try 
        {
            throw new OutOfMemoryError();
        } 
        catch (Error e) 
        {
            IO.println("Inside Catch Block");
            IO.println(e);
        }
    }
}