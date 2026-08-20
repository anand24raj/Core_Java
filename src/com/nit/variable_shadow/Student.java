package com.nit.variable_shadow;

public class Student {
	private int roll = 101;                   // instance variable
	public static String collegeName = "NIT"; // static variable

	void main() {
		accept(roll);
	}

	public void accept(int roll) {
		this.roll = 201;                // local variable shadows instance variable
		String collegeName = "JNTU";    // local variable shadows static variable

		IO.println("Local Roll : " + roll);
		IO.println("Instance Roll : " + this.roll);    // prints local roll → 201

		IO.println("Local College : " + collegeName);   // prints local collegeName → JNTU
		IO.println("Static College : " + Student.collegeName);
	}
}
