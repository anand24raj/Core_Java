/*Company Training – Custom Exception

You are required to simulate a Company Training Session System 
that validates whether a training session is valid based on its duration.
The program must use a custom exception to handle invalid training durations and
ensure that company training standards are followed.
Program Design Requirements

1. Class Design
Create a custom exception class named TrainingInvalidException.
Create a main class to handle user input and training validation logic.

2. Instance Variable
int duration
→ Represents the duration of the training session in hours.

3. Method Responsibility
Read the training duration from the user.
Validate the duration based on company rules.
Throw a custom exception if the duration is invalid.
Print a success message if the duration is valid.

4. Exception Handling Logic
If duration < 2, explicitly throw TrainingInvalidException.
Catch the custom exception and display an appropriate error message.
This design helps separate business rule validation from normal execution flow.

Input Format
--------------------
A single integer representing the training duration (in hours).

Output Format
-----------------------
If the training duration is valid:  */

package com.core_java.exception.custom_exception;
import java.util.Scanner;

class TrainingInvalidException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public TrainingInvalidException(String message) 
    {
        super(message);
    }
}
public class CompanyTraining 
{
    int duration;

    public static void main(String[] args) 
    {
        CompanyTraining obj = new CompanyTraining();
        Scanner sc = new Scanner(System.in);

        try 
        {
            obj.duration = sc.nextInt();

            if (obj.duration < 2) 
            {
                throw new TrainingInvalidException("Training duration too short");
            }

            IO.println("Training completed successfully"); 

        } 
        catch (TrainingInvalidException e) 
        {
            IO.println(e.getMessage());
        } 
        catch (Exception e) 
        {
            IO.println("Invalid input type");
        } 
        finally 
        {
            sc.close();
        }
    }
}