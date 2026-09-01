package com.core_java.exception.return_example;

public class ReturnExampleDemo 
{
    public static void main(String[] args) 
    {
        IO.println(input());
    }

    public static int input() 
    {
        try 
        {
            return 100;
        } 
        catch (Exception e) 
        {
            return 200;
        }
        // IO.println("Unreachable"); ❌ Not allowed
    }
}
