/* Problem: Interface Implementation for Musical Instruments


Create an interface named Playable with a method:

play()

Implement this interface in two classes:

Guitar: play() should print "Playing the guitar"

Piano: play() should print "Playing the piano"

Demonstrate interfaces and polymorphism by creating objects of Guitar and Piano and calling their play() methods.

Requirements

Define an interface Playable with an abstract method play().

Implement this interface in Guitar and Piano classes.

Each class should provide its own implementation of play().

In the main method, create objects of Guitar and Piano and test their functionality.
Switch-Case Explanation

Case 1: Play Guitar → call play() on Guitar object → prints "Playing the guitar"
Case 2: Play Piano → call play() on Piano object → prints "Playing the piano"
Default case: Handle invalid input → print "Invalid choice"
Switch-case allows dynamic instrument selection at runtime.*/

package com.nit.interfaces;

interface Playable
{
	 void play();
}

class Guitar implements Playable
{
    public void play()
	{
		IO.println("Playing the guitar");
	}
}
class Piano implements Playable
{
    public void play()
	{
		IO.println("Playing the piano");
	}
}



public class MusicalInstument
{
	void main()
	{
		int x = Integer.parseInt(IO.readln());
		
		switch(x)
		{
		case 1 ->
		{
			Playable P = new Guitar();
			P.play();			
		}
		case 2 ->
		{
			Playable P = new Piano();
			P.play();			
		}
		default -> IO.println("Invalid choice");
		}
	}

}
