/*In a hospital registration system, every patient must have a valid age.
The valid age range is:
0 to 120 years
If a user enters an invalid age, the system must throw a custom exception called:
InvalidAgeException
Requirements
Create a custom exception class:
InvalidAgeException
The exception message must be:
InvalidAgeException: Age <value> invalid

Write a method validateAge(int age) to check if the age is valid.
If the age is less than 0 or greater than 120:
throw the exception
Handle the exception in the main() method.
Print a success message only if the age is valid.
Input Example
Age = -5

Expected Output
InvalidAgeException: Age -5 invalid*/


package com.core_java.exception.custom_exception;

// Custom Exception Class
class InvalidAgeException extends Exception 
{
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(int age) 
    {
        super("InvalidAgeException: Age " + age + " invalid");
    }
}

// Main Class
public class DuplicateBooking 
{
    public static void validateAge(int age) throws InvalidAgeException 
    {

        if (age < 0 || age > 120) 
        {
            throw new InvalidAgeException(age);
        }
    }

    public static void main(String[] args) 
    {
        int age = Integer.parseInt(IO.readln("Enter the age : "));

        try 
        {
            validateAge(age);
            IO.println("Age is valid. Registration successful.");
        } 
        catch (InvalidAgeException exception) 
        {
            IO.println(exception.getMessage());
        }
    }
}