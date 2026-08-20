package com.nit.exception.checked_rules;

public class ExceptionDemo1 
{
    public static void main(String[] args) throws Exception
    {
        m1();   // Handling is compulsory
    }

    public static void m1() throws Exception
    {
        throw new Exception("Checked Exception");
    }
}
