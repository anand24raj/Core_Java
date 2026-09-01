/*Name must not be empty

A simple application needs to display a greeting message to the user.
To ensure that the interface contains only one abstract method, it must be annotated with @FunctionalInterface.

You are required to:
Create a functional interface using @FunctionalInterface
Implement it using a lambda expression
Display a greeting message

Rules
Create an interface GreetingService
Annotate it with @FunctionalInterface
Declare only one abstract method:
void greet(String name);
Implement the interface using a lambda expression
Call the method to print a greeting message

input Format
User Name

Output Format
Print a greeting message for the user*/

package com.core_java.lambda;

import java.util.Scanner;

@FunctionalInterface
interface GreetingService 
{
    void greet(String name);
}

public class GreetingMessage
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter Name : ");
        String name = sc.nextLine();

        GreetingService greeting = n -> 
        {
            if (n == null || n.trim().isEmpty()) 
            {
                System.out.println("Name must not be empty");
            } else 
            {
                System.out.println("Hello " + n + ", Welcome!");
            }
        };

        greeting.greet(name);
        sc.close();
    }
}
