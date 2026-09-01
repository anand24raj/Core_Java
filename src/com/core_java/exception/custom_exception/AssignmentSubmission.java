/*Simulate a scenario where a student submits an assignment after the due date. If the submission date is past the deadline, a custom exception AssignmentDeadlineMissedException should be thrown.

A student attempts to submit an assignment.
If the submission date is later than the assignment due date, the submission fails.

Input:
Assignment due date = 01-01-2025
Submission date = 02-01-2025
Expected Output:
AssignmentDeadlineMissedException: Assignment submission past due date

Hints:
Create a custom exception called AssignmentDeadlineMissedException.
Compare submission date with the assignment due date.
Throw the exception if the submission is late.
Ensure the exception message clearly indicates the missed deadline.*/


package com.core_java.exception.custom_exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Step 1: Custom Exception
class AssignmentDeadlineMissedException extends Exception 
{
    private static final long serialVersionUID = 1L;

    public AssignmentDeadlineMissedException() 
    {
        super("AssignmentDeadlineMissedException: Assignment submission past due date");
    }
}

// Step 2: Main Class
public class AssignmentSubmission 
{
    // Method to check submission date
    public static void checkSubmission(LocalDate dueDate, LocalDate submissionDate)
            throws AssignmentDeadlineMissedException 
    {
        if (submissionDate.isAfter(dueDate)) 
        {
            throw new AssignmentDeadlineMissedException();
        }
    }

    // Main method
    public static void main(String[] args) 
    {
        // Input Dates
        String due = IO.readln("Enter Assignment due date(dd-MM-yyyy) : ");
        String submitted = IO.readln("Enter Assignment Submitted date (dd-MM-yyyy) : ");

        // Date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dueDate = LocalDate.parse(due, formatter);
        LocalDate submissionDate = LocalDate.parse(submitted, formatter);

        try 
        {
            checkSubmission(dueDate, submissionDate);
            System.out.println("Assignment submitted successfully.");
        } 
        catch (AssignmentDeadlineMissedException exception) 
        {
            System.out.println(exception.getMessage());
        }
    }
}