/*Write a Java program to create a custom exception class called InvalidAgeException.
•	The program should take a user's age as input.
•	If the age is less than 18, throw the InvalidAgeException with the message "Age must be 18 or above to vote."
•	Otherwise, print "You are eligible to vote."

Examples
Example 1
Input:
16
Output:
Exception in thread "main" InvalidAgeException: Age must be 18 or above to vote.*/

package com.nit.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message) 
    {
        super(message);
    }
}

public class AgeExceptions
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter age :");
        int age = sc.nextInt(); 
        sc.close();
        try 
        {
            if (age < 18) 
            {
                throw new InvalidAgeException("Age must be 18 or above to vote.");
            } 
            else 
            {
                IO.println("You are eligible to vote.");
            }
        } 
        catch (InvalidAgeException e) 
        {
            IO.println("Exception in thread \"main\" " + e);
        }
        
    }
}
