package com.nit.exception;

public class ExceptionFormat 
{
    public static void main(String[] args) 
    {
        Exception e = new ArithmeticException("Divide by zero problem");

        IO.println(e.toString()); 
        // java.lang.ArithmeticException: Divide by zero problem
    }
}