/*Greeting users in a personalized way improves user experience in applications.
Using an interface allows standardizing the greeting behavior, while different classes can implement it differently.

Question Requirements
Create an interface Greeting with a method:
void sayHello(String name);
Create a class FriendlyGreeting that implements the Greeting interface.

Implement the sayHello(String name) method to print a personalized greeting, e.g.:
Hello, John! Welcome!

In the main program, create a FriendlyGreeting object and greet at least two users by calling sayHello() with different names.*/

package com.core_java.interfaces;

interface Greeting
{
    void sayHello(String name);
}

class FriendlyGreeting implements Greeting
{
    public void sayHello(String name)
    {
        IO.println("Hello, " + name + "! Welcome!");
    }
}

public class GreetingApp
{
    public static void main(String[] args)
    {
        FriendlyGreeting greet = new FriendlyGreeting();

        for(int i = 1; i <= 2; i++)
        {
            String name = IO.readln().trim();
            if(name.isEmpty())
                IO.println("Name cant be empty!");
            else
                greet.sayHello(name);
        }
    }
}

