package com.core_java.exception.checked_rules;

public class CatchingWithSuperClass 
{
    public static void main(String[] args) 
    {
        try 
        {
            IO.println("Inside try block");
        } 
        catch (Throwable e)   // Exception OR Throwable both allowed
        {
            e.printStackTrace();
        }
    }
}
