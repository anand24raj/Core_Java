/*Ques : 1
=========

Exception and Messages 

-> Write a program to create an ELC class SimpleExceptionDemo ,which contains main method.

-> This program should read two integer numbers for the variables a and b from console using Scanner class.

-> If you enter any other character except number (0 - 9) then the error is caught by InputMisMatchException object.

-> After that using following methods print the information about the error occurring causes in the console.
 getMessages(),  printStackTrace(), println(),  toString().



TEST CASE 1 :
-------------
Input :
Enter the first integer (a): 10
Enter the second integer (b): 20

Output:
You entered a = 10 and b = 20


TEST CASE 2 :
-------------
Input :
Enter the first integer (a): abc

Output:
getMessage():=> null

toString():=> java.util.InputMismatchException

println():=> InputMismatchException occurred. Please enter only integer numbers.

printStackTrace():=> 
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at com.testing.SimpleExceptionDemo.main(SimpleExceptionDemo.java:15)


TEST CASE 3 :
-------------
Enter the first integer (a): 10
Enter the second integer (b): abc

Output :
getMessage():=> null

toString():=> java.util.InputMismatchException

println():=> InputMismatchException occurred. Please enter only integer numbers.

printStackTrace():=> 
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at com.testing.SimpleExceptionDemo.main(SimpleExceptionDemo.java:18)



#########################################*/

package com.nit.exception;

public class SimpleExceptionDemo 
{
	void main()
	{
		try
		{
			int a = Integer.parseInt(IO.readln("Enter the first integer (a):"));
			int b = Integer.parseInt(IO.readln("Enter the second integer (b):"));
			
			IO.println("You entered a = " + a + " and b = " + b);
			
			
		}
		catch (NumberFormatException e)
		{
			IO.println("\ngetMessages(): => "+ e.getMessage());
	
			IO.println("\ntoString(): => "+ e.toString());
			
			IO.println("\nprintln():=> InputMismatchException occurred. Please enter only integer numbers.");
			
			IO.println("\nprintStackTrace():=> ");
			e.printStackTrace();
		}	
		
	}

}
