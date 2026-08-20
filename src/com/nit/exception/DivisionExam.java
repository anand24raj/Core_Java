/*Handling ArithmeticException 

Objective:
Write a Java program that demonstrates how to handle ArithmeticException. 
The program should include a method that performs division and throws an ArithmeticException if division by zero occurs. 
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named DivisionExample:

-> Implement a static method performDivision :
   Takes two integer parameters: dividend and divisor.
   Access Modifier : public
   Non-Access Modifier : static
   return type : int
   parameters : int, int

-> Performs division operation (dividend / divisor).
   Throws an ArithmeticException if divisor is zero.

-> Implement the main method:
   Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
   Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision method.
   Print an appropriate error message when division by zero occurs.



TEST CASE 1 :
------------
Input as : 
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division : 5


TEST CASE 2 : 
-------------
Input as : 
Enter dividend : 5
Enter divisor : 0

Output :
ArithmeticException caught: Division by zero: dividend=5, divisor=0


Input:
10
2
Output:
Result of division: 5*/

package com.nit.exception;

public class DivisionExam
{

	void main()
{
	try
		{
		    int dividend = Integer.parseInt(IO.readln("Enter Dividend : "));
		    int divisor = Integer.parseInt(IO.readln("Enter Divisor : "));
		        
		    int result = DivisionExample.performDivision(dividend, divisor);

		    IO.println("Result of division: "+result);
		}
		catch (ArithmeticException e)
		{
		    IO.println(e.getMessage());
		}
	}
}		
class DivisionExample
{
	public static int performDivision(int dividend, int divisor)		    
	{
		if(dividend <= 0 || divisor == 0 )
		{
		    throw new  ArithmeticException("ArithmeticException caught: Division by zero: dividend="+dividend + ", divisor="+divisor);
		}
		else
		{
		    return dividend / divisor;
		}
    }
}