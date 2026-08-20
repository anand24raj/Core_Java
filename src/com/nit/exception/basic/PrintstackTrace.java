package com.nit.exception.basic;

public class PrintstackTrace 
{
    public static void main(String[] args) 
    {

        IO.println("Main method started");

        try 
        {
            String str = null;
            IO.println(str.toLowerCase());
        }
        catch (Exception e) 
        {

            IO.println("ref is pointing to null");
            IO.println("----------------------");

            IO.println(e.toString()); // FQN : errorMessage

            IO.println("----------------------");

            IO.println(e.getMessage()); // errorMessage

            IO.println("----------------------");

            e.printStackTrace(); // Complete details
        }

        IO.println("Main method ended");
    }
}