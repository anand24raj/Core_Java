package com.core_java.oops.abstraction;

abstract class Animal1 {
    protected String name;

    public Animal1(String name) {
        super();
        this.name = name;
    }

    public abstract void healthCheckup();
}

class Lions extends Animal1 {

    public Lions(String name) {
        super(name);
    }

    @Override
    public void healthCheckup() {
        IO.println(name + " lion is going for regular health check up");
    }
}

class Elephant extends Animal1 {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void healthCheckup() {
        IO.println(name + " is going for regular health check up");
    }
}

public class AbstractDemo5 {

    public static void main(String[] args) {

        Lions[] lions = {
            new Lions("Simba"),
            new Lions("Mufasa"),
            new Lions("Raja")
        };

        healthCheckupCamp(lions);

        IO.println(".................");

        Elephant[] elephants = {
            new Elephant("Haathi"),
            new Elephant("Gaja")
        };

        healthCheckupCamp(elephants);
    }

    public static void healthCheckupCamp(Animal1... animals) {
        for (Animal1 animal : animals) {
            animal.healthCheckup();
        }
    }
}
