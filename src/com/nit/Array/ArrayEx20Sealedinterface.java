package com.nit.Array;

// Sealed Interface Example

sealed interface Animal  
{
    void roam();
}

non-sealed class Bird implements Animal 
{
    @Override
    public void roam() 
    {
        IO.println("Bird is roaming");
    }
}

final class Lion implements Animal 
{
    @Override
    public void roam() 
    {
        IO.println("Lion is roaming");
    }
}

public class ArrayEx20Sealedinterface 
{
    public static void main(String[] args) 
    {
        Animal[] animals = new Animal[2];

        animals[0] = new Bird();
        animals[1] = new Lion();

        getAnimal(animals);
    }

    public static void getAnimal(Animal[] animals) 
    {
        for (Animal animal : animals) 
        {
            animal.roam();
        }
    }
}