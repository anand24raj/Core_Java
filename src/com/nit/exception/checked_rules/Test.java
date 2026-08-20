package com.nit.exception.checked_rules;

public class Test 
{
    public static void main(String[] args) 
    {
        try 
        {
        } 
        catch (ArithmeticException e)   // ✅ Valid (Unchecked)
        {
            e.printStackTrace();
        }
    }
}
