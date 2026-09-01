package com.core_java.String;

public class MobileWithRegex 
{
    public static void main(String[] args) 
    {
        String mobile = IO.readln("Enter your mobile number ");

        boolean isValid = mobile.matches("[6-9]\\d{9}");

        if (isValid) 
        {
            IO.println(mobile + " is a valid mobile number");
        } 
        else 
        {
            IO.println(mobile + " is an invalid mobile number");
        }
    }
}