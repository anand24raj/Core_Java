package com.core_java.String;

public class EqualsIgnoreCaseDemo 
{
    public static void main(String[] args) 
    {

        String user = args[0];

        if (user.equalsIgnoreCase("Ravi")) 
        {
            IO.println("Welcome Ravi, You are authenticated");
        } 
        else 
        {
            System.err.println("Sorry Wrong username");
        }
    }
}