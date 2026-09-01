/*
 Assignment 02
--------------
Develop a Program on Factory Method where method return type is interface.

Coding Requirement :
---------------------
Take a Functional interface Printer which contains a print() method.

Methods :

1) Method Name     : print()
   Parameter       : No Parameter
   Return Type     : void
   Access Modifier : public
   Modifier   : abstract

Take another class PrinterDemo.

1) Method Name     : getPrinter()
   Parameter       : No Parameter
   Return Type     : Printer [Factory Method (Factory Design Pattern)]
   Access Modifier : public
 
   In this method override the print() method of Printer interface, using anonymous inner class WITHOUT REFERENCE and return the anonymous inner class object.
   
Take an ELC class InterfaceImplementationByUsingAnonymous.
Create the PrinterDemo object and call the print method. */

package com.core_java.interfaces;

public class InterfaceImplementationByUsingAnonymous
{
	void main()
	{
		PrinterDemo pdemo = new PrinterDemo();
		Printer pr = pdemo.getPrinter();
		pr.print();
	}

}
