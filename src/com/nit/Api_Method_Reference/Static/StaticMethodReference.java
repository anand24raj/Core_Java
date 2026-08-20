package com.nit.Api_Method_Reference.Static;

@FunctionalInterface
interface Worker 
{
	void work(double salary);
}

public class StaticMethodReference 
{
	 public static void main(String[] args) 
	 {	
	     Worker w1 = Employee::salary;
	     w1.work(45000);
	 }
}

class Employee 
{
	 public static void salary(double salary) 
	 {
	     IO.println("Employee is working with " + salary + " salary ");
	 }
}
