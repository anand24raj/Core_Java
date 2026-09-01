package com.core_java.exception.basic;

public class VariableInitialization 
{
    public static void main(String[] args) 
    {
        int x;

        try 
        {
            x = 100;
            IO.println(x);
        } 
        catch (Exception e) 
        {
            x = 200;
            IO.println(x);
        }
    }
}
