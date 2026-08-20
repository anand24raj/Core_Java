package com.nit.jvm.staticblock;

class Foo 
{
	Foo()
	{
		System.out.println("No Argument constructor");
	}
	{
		System.out.println("Non static block");
	}
    static
    {
        System.out.println("Static block of Foo");
    }
}

public class StaticBlockDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Method Executed");
        // Foo class is NOT used, so Foo is NOT loaded
    }
}