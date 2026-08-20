package com.nit.exception.checked_rules;

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
