package com.nit.String;

public class UniqueWord 
{
    public static void main(String[] args) 
    {
        String s1 = "java is a beautiful language, It is also platform independent language";

        boolean isAvailable = s1.contains("platform");

        IO.println(isAvailable);
    }
}