/* Create a program to demonstrate runtime polymorphism using a base class Pet and two subclasses:

Pet (Base Class)
Method play() to be overridden by subclasses.

Dog (Subclass)
Overrides play() to display that the dog is playing fetch.

Cat (Subclass)
Overrides play() to display that the cat is playing with a yarn ball.
In the main method, use a switch–case statement to allow the user to select the type of pet:
Option 1 -> Dog and call play()
Option 2 -> Cat and call play()
Any other input → Display: Invalid pet type!


Use a reference of type Pet to demonstrate runtime polymorphism.
Demonstrate polymorphism by calling play() through a Pet reference for both types of pets.*/

package com.core_java.oops.polymorphism;

public class PetDetail 
{
    void main() 
    {
        int choice = Integer.parseInt(IO.readln()); 

        Pet P; 

        switch (choice) {
            case 1 -> 
            {
                String dogName = IO.readln(); 
                P = new Dog(dogName);
                P.play(); 
            }

            case 2 -> 
            {
                String catName = IO.readln(); 
                P = new Cat(catName);
                P.play(); 
            }

            default -> IO.println("Invalid pet type!");
        }
    }
}

class Pet 
{
    private String name;

    public Pet(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void play() 
    {
     
    }
}

class Dog extends Pet 
{
    public Dog(String name) 
    {
        super(name);
    }

    @Override
    public void play() 
    {
        IO.println("Dog " + getName() + " is playing fetch.");
    }
}

class Cat extends Pet 
{
    public Cat(String name) 
    {
        super(name);
    }

    @Override
    public void play() 
    {
        IO.println("Cat " + getName() + " is playing with a yarn ball.");
    }
}

