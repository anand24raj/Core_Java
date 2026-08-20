package com.nit.exception.return_example;

public class ReturnExampleDemo1 
{
    public static void main(String[] args) 
    {
        IO.println(input());
    }

    public static int input() 
    {
        try 
        {
            return 10 / 0;   // ArithmeticException
        } 
        catch (Exception e) 
        {
            return 200;
        }
    }
}