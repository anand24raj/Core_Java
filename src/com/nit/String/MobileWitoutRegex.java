package com.nit.String;

public class MobileWitoutRegex 
{
    public static void main(String[] args) 
    {
        String mobile = IO.readln("Enter your 10 digits mobile number ");

        boolean isValid = mobile.matches("\\d{10}");

        if (isValid) 
        {
            IO.println(mobile + " is a valid 10 digit mobile number");
        } 
        else 
        {
            IO.println(mobile + " is an invalid 10 digit mobile number");
        }
    }
}