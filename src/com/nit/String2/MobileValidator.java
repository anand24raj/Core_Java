package com.nit.String2;

public class MobileValidator 
{
    public static void main(String[] args) 
    {
        String mobile = "8707008781";

        String regex = "^[6-9][0-9]{9}$";

        if (mobile.matches(regex)) 
        {
            System.out.println("Valid Mobile Number");
        } 
        else 
        {
            System.out.println("Invalid Mobile Number");
        }
    }
}