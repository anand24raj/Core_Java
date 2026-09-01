package com.core_java.Api_Method_Reference;

@FunctionalInterface
interface Worker 
{
	void work();
}

public class MethodReferenceDemo1 
{
	 public static void main(String[] args) 
	 {	
	     // Lambda Expression
	     Worker w1 = () -> IO.println("Worker is working");
	     w1.work();
	
	     // Method reference
	     Worker w2 = new Employee()::work;
	     w2.work();
	 }
}

class Employee 
{
	public void work() 
	{
		IO.println("Employee is working ");
	}
}
