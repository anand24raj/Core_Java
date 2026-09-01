package com.core_java.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LimitationOfFinally 
{

    public static void main(String[] args) 
    {

        Scanner sc = null;

        try 
        {
            sc = new Scanner(System.in);

            IO.print("Enter your Age : ");
            int age = sc.nextInt();
            IO.println("Your Age is : " + age);
        }
        catch (InputMismatchException e) 
        {
            IO.println("Inside Catch");
            IO.println("Input is not in a proper format");
        }
        finally 
        {
            IO.println("Inside finally");

            if (sc != null) 
           {
                sc.close();
           }
        }
    }
}