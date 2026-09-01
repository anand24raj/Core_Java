package com.core_java.oops.method_overridding;

class Person {
	protected int age = 35;

	public int getAge() {
		return age;
	}

	public void printAge() {
		IO.println(this.getAge());
	}
}

class Student extends Person {
	protected int age = 22;

	@Override
	public int getAge() {
		return age;
	}
}

public class IQ {
	public static void main(String[] args) {

		Person person = new Student();
		person.printAge();
	}
}
