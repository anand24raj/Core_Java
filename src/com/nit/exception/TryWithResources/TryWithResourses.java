package com.nit.exception.TryWithResources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourses 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try (sc) 
        {
            IO.print("Enter your Salary : ");
            double salary = sc.nextDouble();
            IO.println("Your salary is : " + salary);

        } 
        catch (InputMismatchException e) 
        {

            IO.println("Input is not in a valid format");
        }
    }
}