/* Create a program to demonstrate runtime polymorphism using a base class Food and two subclasses:
Food (Base Class)
Method serve() to be overridden by subclasses.

Pizza (Subclass)
Overrides serve() to display that the pizza is served hot with toppings.

Burger (Subclass)
Overrides serve() to display that the burger is served with fries.

Demonstrate polymorphism by calling serve() through a Food reference for both food items.
Ask the user to choose a food type:
1. Pizza
2. Burger


Use a switch–case statement to:
Create a Pizza object when option 1 is selected
(read pizza name from user)

Create a Burger object when option 2 is selected
(read burger name from user)

Store the created object in a Food reference variable.
Call the serve() method through the Food reference to demonstrate runtime polymorphism.
If the user enters an invalid option, display:Invalid food type!*/

package com.nit.polymorphism;

public class FoodDetails
{
    void main() 
    {		
        int x = Integer.parseInt(IO.readln());

        Food1 F; 

        switch (x) {
            case 1 -> {
                String pizzaName = IO.readln(); 
                F = new Pizza(pizzaName);
                F.serve(); 
            }

            case 2 -> {
                String burgerName = IO.readln();
                F = new Burger(burgerName);
                F.serve();
            }

            default -> IO.println("Invalid food type!");
        }
    }
}

class Food1 {
    private String name;

    public Food1(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void serve() 
    {
    }
}

class Pizza extends Food1 
{
    public Pizza(String name) 
    {
        super(name);
    }

    @Override
    public void serve() 
    {
        IO.println("Pizza " + getName() + " is served hot with toppings.");
    }
}

class Burger extends Food1 
{
    public Burger(String name) 
    {
        super(name);
    }

    @Override
    public void serve() 
    {
        IO.println("Burger " + getName() + " is served with fries.");
    }
}

