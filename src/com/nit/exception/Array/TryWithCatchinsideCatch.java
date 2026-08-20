package com.nit.exception.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchinsideCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try (sc) 
        {
            System.out.print("Enter your Roll number: ");
            int roll = sc.nextInt();
            System.out.println("Your Roll is: " + roll);
        } 
        catch (InputMismatchException e) 
        {
            System.err.println("Provide Valid input!!");

            try 
            {
                System.out.println(10 / 0);
            } 
            catch (ArithmeticException e1) 
            {
                System.err.println("Divide by zero problem");
            }
        } 
        finally 
        {
            try 
            {
                System.out.println("Finally block");
            } 
            catch (Exception e) 
            {
                System.out.println("Exception in finally");
            }
        }

        // ArrayStoreException Example
        try 
        {
            Object[] obj = new Integer[3];

            obj[0] = 12;
            obj[1] = 45;
            obj[2] = "90";   // ❌ Invalid
        } 
        catch (ArrayStoreException e) 
        {
            System.err.println("Invalid element so can't store in array");
        }
    }
}