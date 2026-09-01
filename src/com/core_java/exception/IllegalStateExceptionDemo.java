/*Ques : 3
=========

IllegalStateException 

-> Create a Java class named IllegalStateExceptionDemo inside the package ELC.

-> Inside this class, define the following static method:

   static void throwIllegalException() {
       try {
           throw new IllegalStateException("MyException");
       } catch (IllegalStateException objA) {
           System.out.println("Caught: " + objA);
       }
   }


-> In the main method Print the message: Calling throwIllegalException from main method:

-> Call the throwIllegalException() method.



TEST CASE 1 :
--------------
Input:
No input required.

Output:
Calling throwIllegalException from main method:
Caught: java.lang.IllegalStateException: MyException


#########################################*/

package com.core_java.exception;

public class IllegalStateExceptionDemo 
{
	   static void throwIllegalException() 
	   {
	       try 
	       {
	           throw new IllegalStateException("MyException");
	       }  
	       catch (IllegalStateException objA) 
	       {
	           IO.println("Caught: " + objA);
	       }
	   }
	    void main()
	    {
	        IO.println("Calling throwIllegalException from main method:");
	        throwIllegalException();
	    }

}
