package com.nit.String;

public class EmailValidate 
{
    public static void main(String[] args) 
    {
        String email = IO.readln("Enter a valid email id : ");

        boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

        if (isValid) 
        {
            IO.println(email + " is a valid email");
        } 
        else 
        {
            IO.println(email + " is not a valid email id");
        }
    }
}