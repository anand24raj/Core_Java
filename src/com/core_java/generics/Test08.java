package com.core_java.generics;

abstract class Animal {
    public abstract void checkup();
}

class Dog1 extends Animal {
    @Override
    public void checkup() {
	IO.println("Dog checkup");
    }
}

class Cat extends Animal {
    @Override
    public void checkup() {
	IO.println("Cat checkup");
    }
}

class Bird extends Animal {
    @Override
    public void checkup() {
	IO.println("Bird checkup");
    }
}

public class Test08 {
    public static void checkAnimals(Animal... animals) {
	for (Animal animal : animals) {
	    animal.checkup();
	}
    }

    public static void main(String[] args) {
	Dog1[] dogs = { new Dog1(), new Dog1() };
	Cat[] cats = { new Cat(), new Cat(), new Cat() };
	Bird[] birds = { new Bird(), new Bird() };

	checkAnimals(dogs);
	checkAnimals(cats);
	checkAnimals(birds);
    }
}