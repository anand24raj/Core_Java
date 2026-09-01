package com.core_java.oops.abstraction.linked_list;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo ();
}
abstract class Beta extends Alpha
{
	@Override
	public void show() //+ demo);
	{
		IO. println("show method is overridden in Beta class");
	}
}

class Gamma extends Beta
{
	@Override
	public void demo ()
	{
		IO. println("demo method is overridden in Gamma class");
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Gamma gamma = new Gamma ();
		gamma. demo (); gamma. show();
	}
}

/*
Note : All the abstract methods declared in the super class must be overridden in sub classes
class final -> Inheritance is not possible
Method final -> Overriding is not possible
Field is final -> re-assignemnt is not possible*/

