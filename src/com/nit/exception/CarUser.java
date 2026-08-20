/*Implement a Java program that simulates various car-related exceptions using custom exception classes (CarStopped, CarPuncture, CarHeat). 
The program should handle different scenarios and test cases using the CarTest class and demonstrate exception handling through static methods.

-> Create CarStoppedException class : extends Exception
   Purpose: This class is used for raise the exception if car is stops for reasons other than puncture or overheating.

-> Constructor:
   Parameterized Constructor with String as parameter

---------------------------------------

-> Create CarPunctureException class: extends Exception
   This class is used for raise the exception if car is punctured.

-> Constructor:
   Parameterized Constructor with String as parameter

---------------------------------------

-> Create CarHeatException class: extends Exception
   This class is used for raise the exception if the car engine is more than 50 degrees Celsius

-> Constructor:
   Parameterized Constructor with String as parameter

---------------------------------------

-> Create CarTest class:
   Contains static methods to simulate car operations and throw exceptions based on certain conditions.

-> Instance Variables:
   No Instance Variables

-> Methods:
   Stop(String): void: static
   This class throws CarStoppedException. If the string is  stop  throw new exception and get the message or else message is Car not stall


-> Methods:
   puncture(String): void: static: public
   This class throws CarPunctureException. If the string is puncture  throw new exception and get the message line  Car is punctured  or else message is Car not stall.

-> Methods:
   carHeat(int): void: static : public
   This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it throw new exception and get the message line  Car is heated more the 50 degrees  or else message is Car not stall.

---------------------------------------

-> Create ELC class CarUser :-
   Invoke stop, puncture, and carHeat methods with appropriate messages or temperatures to test different scenarios.
   Ensure that exceptions are properly thrown and caught where applicable.

Input:
Enter action for car stop (stop/go): 
stop
Output:
Car stopped for some reason.*/

package com.nit.exception;

import java.util.Scanner;

public class CarUser 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter choice (1 - 3): ");
        int choice = sc.nextInt();  
        sc.nextLine(); 

        try 
        {
            if (choice == 1) 
            {
            	IO.print("Enter action for car stop (stop/go): ");
                String action = sc.nextLine();
                CarTest.stop(action);
            } 
            else if (choice == 2) 
            {
            	IO.print("Enter Condition for car puncture (puncture / move): ");
                String condition = sc.nextLine();
                CarTest.puncture(condition);
            } 
            else if (choice == 3) 
            {
            	IO.print("Enter Temperature for car in celsius (0  - 100 ): ");
                int temp = sc.nextInt();
                CarTest.carHeat(temp);
            }
        }
        catch (CarStoppedException e) 
        {
            IO.println(e.getMessage());
        }
        catch (CarPunctureException e) 
        {
            IO.println(e.getMessage());
        }
        catch (CarHeatException e) 
        {
            IO.println(e.getMessage());
        }

        sc.close();
    }
}

class CarStoppedException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public CarStoppedException(String message) 
    {
        super(message);
    }
}

class CarPunctureException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public CarPunctureException(String message) 
    {
        super(message);
    }
}

class CarHeatException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public CarHeatException(String message) 
    {
        super(message);
    }
}

class CarTest 
{
    public static void stop(String action) throws CarStoppedException 
    {
        if (action.equalsIgnoreCase("stop")) 
        {
            throw new CarStoppedException("Car stopped for some reason.");
        } 
        else 
        {
            IO.println("Car not stalled.");
        }
    }

    public static void puncture(String condition) throws CarPunctureException 
    {
        if (condition.equalsIgnoreCase("puncture")) 
        {
            throw new CarPunctureException("Car is punctured.");
        } 
        else 
        {
            IO.println("Car not punctured.");
        }
    }

    public static void carHeat(int temperature) throws CarHeatException 
    {
        if (temperature > 50) 
        {
            throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
        } 
        else 
        {
            IO.println("Car temperature normal.");
        }
    }
}