package com.core_java.exception.basic;

public class FinallyBlock 
{

    public static void main(String[] args) 
    {
        try 
        {
            IO.println(10 / 0);
        } 
        finally 
        {
            IO.println("Finally block");
        }

        IO.println("Program completed");
    }
}