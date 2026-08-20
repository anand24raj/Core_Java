/*Assignment 01 :
---------------
Develop a scenario based program using interface for Payment Processing and apply discount using Factory Method.

Coding Requirements :
----------------------
Take an interface called Payment.

Methods :

1) Method Name     : processPayment()
   Parameter       : No Parameter
   Return Type     : void
   Access Modifier : public
   Modifier	   : abstract


2) Method Name     : applyDiscount()
   Parameter       : No Parameter
   Return Type     : void
   Access Modifier : public
     Modifier	   : abstract


Take two implementer classes CreditCardPayment and UPIPayment and override both the abstract methods.
[See the Test Cases for Output]


Take another BLC class PaymentGateway

Methods :

1) Method Name     : initiatePayment()
   Parameter       : paymentType of type String
   Return Type     : Payment [Factory Method]
   Access Modifier : public
     
In this method, With the help of parameter variable paymentType, receive the string value CreditCardPayment and UPIPayment, return CreditCardPayment object OR UPIPayment object based on the String value passed by the user from the ELC class [Factory Method] with some message like "Initiating Credit Card payment" OR "Initiating UPI payment" [See Test Cases for Details] 


Take an ELC class called PaymentGatewayUsingInterface with main method. Take IO class and PaymentGateway class object so user can pass either CreditCard OR UPI as a String text and get that type of object from Factory method.


Test Cases for Output :
------------------------
Test Case 1 :
-------------
Enter Payment Type [CreditCard / UPI]: 
creditcard
Initiating Credit Card payment
Processing Credit Card payment...
Applying 10% discount for Credit Card payment

Test Case 2:
-------------
Enter Payment Type [CreditCard / UPI]: 
UPI
Initiating UPI payment
Processing UPI payment...
Applying 5% discount for UPI payment

Test Case 3:
------------
Enter Payment Type [CreditCard / UPI]: 
debitcard
Invalid payment type selected!
-------------------------------------------------------------------------*/

package com.nit.interfaces;

public class PaymentGatewayUsingInterface
{
	
	void main()
	{
		PaymentGateway pay=new PaymentGateway();
		
		String P = IO.readln("Enter the Payment type : ");
		
		pay.initiatePayment(P);
	}

}
