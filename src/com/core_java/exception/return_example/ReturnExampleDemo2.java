package com.core_java.exception.return_example;

@SuppressWarnings("finally")
public class ReturnExampleDemo2 
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
        finally 
        {
            return 300;   // Overrides above returns
        }
    }
}
