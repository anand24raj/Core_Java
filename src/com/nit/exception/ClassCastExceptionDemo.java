/*
Handling ClassCastException in Java
Note:-printStcakStrace() is not working in this platform so, you can run this method in eclipse and for this Question taking HardCorded values
RUN TEST CASES WITH MANUAL INPUT;
Objective:
You are required to write a Java program that intentionally causes a ClassCastException and properly handles it using a try-catch block. 
The program should attempt to cast objects of different types to an incompatible type (String), and upon encountering a ClassCastException, 
it should gracefully handle the error and display an appropriate message along with the stack trace.

Instructions:
------------

-> Create a class named ClassCastExceptionDemo.

-> Implement a static method handleClassCastException:
   Access Modifier : public
   Non-Access Modifier : static
   return type : void
   parameters : No-Param

-> Within the handleClassCastException method:

   Declare and initialize an array of type Object with a variety of object types (e.g., String, Integer, Double, Character, Boolean).

   Iterate through the array and attempt to cast each element to String inside a try block.

   Catch any ClassCastException and:

         Display a user-friendly error message indicating the failed cast.

         Print the stack trace for debugging purposes.

-> In the main method:

   Call the handleClassCastException method to test the exception handling behavior.


TEST CASE 1 :
-------------
Input:
Objects: {"Hello", "World", "Java"}

Expected Output:
Casting successful: Hello
Casting successful: World
Casting successful: Java


TEST CASE 2 :
-------------
Input:
Objects: {"Hello", 123, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Integer to String.
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:14)
    at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)


TEST CASE 3 :
-------------
Input:
Objects: {"Hello", true, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Boolean to String.
java.lang.ClassCastException: java.lang.Boolean cannot be cast to java.lang.String
    at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:14)
    at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)
Casting successful: Java

Examples
Example 1
Input:
-
Output:
-*/

package com.nit.exception;

public class ClassCastExceptionDemo 
{

    public static void handleClassCastException() 
    {

        int n = Integer.parseInt(IO.readln("Enter number of objects: "));

        Object[] objects = new Object[n];

        for (int i = 0; i < n; i++) 
        {
            String input = IO.readln("Enter object " + (i + 1) + ": ");

            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) 
            {
                objects[i] = Boolean.parseBoolean(input);
            } else 
            {
                try 
                {
                    objects[i] = Integer.parseInt(input);
                }
                catch (NumberFormatException e1) 
                {
                    objects[i] = input;
                }
            }
        }

       
        for (Object obj : objects) 
        {
            try 
            {
                String value = (String) obj;
                System.out.println("Casting successful: " + value);
            } catch (ClassCastException e) 
            {
                System.out.println(
                    "ClassCastException: Cannot cast " +obj.getClass().getName() + " to String." );
                e.printStackTrace();
            }
        }
    }

    
    public static void main(String[] args) 
    {
        handleClassCastException();
    }
}
