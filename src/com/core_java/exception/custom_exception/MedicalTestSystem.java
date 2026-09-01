/*Invalid Test Result

Simulate a scenario where a medical test result is invalid. If the test value is outside the valid range, a custom exception InvalidTestResultException should be thrown.

A lab technician enters a test result.
If the test value is negative or otherwise invalid, the system should reject it.
Input:
Blood pressure = -20

Expected Output:
InvalidTestResultException: Value -20 invalid


Hints:
Create a custom exception called InvalidTestResultException.
Validate test results against acceptable ranges.
Throw the exception if the value is invalid.
Ensure the exception message clearly shows the invalid test value.*/

package com.core_java.exception.custom_exception;

class InvalidTestResultException extends Exception 
{
    private static final long serialVersionUID = 1L;

    public InvalidTestResultException(int value) 
    {
        super("InvalidTestResultException: Value " + value + " invalid");
    }
}

public class MedicalTestSystem 
{
    public static void validateTestResult(int value) 
            throws InvalidTestResultException 
    {
        if (value < 0) 
        {
            throw new InvalidTestResultException(value);
        }
    }

    public static void main(String[] args)
    {
        int bloodPressure = Integer.parseInt(IO.readln("Enter BP count : ")); // Read input

        try 
        {
            validateTestResult(bloodPressure);
            System.out.println("Test result accepted");  // EXACT expected output
        } 
        catch (InvalidTestResultException exception) 
        {
            System.out.println(exception.getMessage());
        }
    }
}
