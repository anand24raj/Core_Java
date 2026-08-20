/*creating a Java program to model different animal sounds using abstract classes and subclasses. Follow the instructions below to complete the program:

Start by defining an abstract class called Animal with an abstract method:

sound(): This method should represent the sound that the animal makes.
Create a subclass named Lion that extends the Animal class. Implement the sound() method to print:

"Lion roars: Roaaar!"
Create another subclass named Tiger that also extends the Animal class. Implement the sound() method to print:

"Tiger growls: Grrrrr!"
In the Main class, write a main method to accomplish the following:

Create an instance of the Lion class.
Call the sound() method on the lion instance.
Create an instance of the Tiger class.
Call the sound() method on the tiger instance.
Ensure that your program output displays the unique sounds of both the lion and the tiger.

Write the Java program according to the instructions above and include it in your response.*/

package com.nit.abstraction;

public class AnimalSound
{
    void main()
    {
        Animal L = new Lion();
        L.sound();
        Animal T = new Tiger();
        T.sound();

    }
}

abstract class Animal
{
    abstract void sound();
}

 class Lion extends Animal
 {
    @Override
    void sound()
    {
    IO.println("Lion roars: Roaaar!");   
    }
 }
 class Tiger extends Animal
 {
    @Override
    void sound()
    {
    IO.println("Tiger growls: Grrrrr!");
    }
 }
