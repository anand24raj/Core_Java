package com.nit.method_overridding;

class Animal {
	public void eat() {
		IO.println("Generic Animal is eating");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		IO.println("Dog is eating");
	}
}

class Puppy extends Dog {
	@Override
	public void eat() {
		IO.println("Puppy is eating");
	}
}

public class MethodOverridingDemo1 {
	public static void main(String[] args) {

		Animal animal = new Dog();
		animal.eat();

		IO.println("................");

		animal = new Puppy();
		animal.eat();
	}
}
