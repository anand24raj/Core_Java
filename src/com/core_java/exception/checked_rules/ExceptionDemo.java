package com.core_java.exception.checked_rules;

public class ExceptionDemo 
{
    static 
    {
        try 
        {
            throw new IllegalArgumentException("Illegal Argument");
        } 
        catch (IllegalArgumentException e) 
        {
            IO.println(e);
        }
    }

    public static void main(String[] args) 
    {
    }
}
