/*Financial Transaction Validation

Objective:
Write a Java program that validates and processes financial transaction data entered by a user. 
Use a multi-catch block to handle exceptions related to input validation and processing.

Instructions:
-------------
-> Create a BLC class named FinancialTransaction.

-> Implement a processTransaction method that:
   Method name : processTransaction
   Access Modifiers : public
   Return type : void
   Parameters : double, long

   Accepts user input for transaction details such as transaction amount and account number.
   Validate the transaction amount and account number.
   Throw an IllegalArgumentException if the transaction amount is negative or zero. otherwise print appropriate messages for successful transaction

-> Uses a multi-catch block to handle exceptions:
   NumberFormatException for invalid numeric inputs.
   IllegalArgumentException for invalid transaction amount (negative or zero).
   RuntimeException for other unexpected errors during processing.
   
-> Implement the main method in an ELC class.

   Create an instance of FinancialTransaction.
   Prompt the user to input transaction details.
   Call the processTransaction method with user inputs and test different scenarios.



TEST CASE 1 :
-------------- 
Transaction amount: 500
Account number: 1234567890
Expected Output:
Processing transaction...
Transaction successful: Amount Rs.500.0 transferred to account 1234567890


TEST CASE 2 :
-------------- 
Transaction amount: -100
Account number: 9876543210
Expected Output:
Error processing transaction: Transaction amount must be positive.


TEST CASE 3 :
-------------- 
Transaction amount: abc
Account number: 4567890123
Expected Output:
Invalid input: Please enter a valid number for transaction amount.


Examples
Example 1
Input:
Transaction amount: 500
Account number: 1234567890
Output:
Processing transaction...
Transaction successful: Amount Rs.500.0 transferred to account 1234567890*/

package com.core_java.exception;

public class FinancialTransactionValidation 
{
	void main()
	{
	    try
	    {
	    double transactionAmount = Double.parseDouble(IO.readln("Enter Transaction Ammount : "));
	    long accountNo = Long.parseLong(IO.readln("Enter Account Number : "));
	    
	    finance f = new finance();
	    f.process(transactionAmount, accountNo); 
	    }
	    catch(NumberFormatException z)
	    {
	    IO.println("Invalid input: Please enter a valid number for transaction amount.");
	    }
	    catch(Exception e)
	    {
	        IO.println("Error processing transaction: "+e.getMessage());
	    }    
	}

	class finance
	{
	    public void process(double transactionAmount, long accountNo) throws Exception
	    {
	        if(transactionAmount<=0)
	        {
	            throw new Exception("Transaction amount must be positive.");
	        }
	        else
	        {
	            IO.println("Processing transaction...");
	            IO.println("Transaction successful: Amount Rs."+ transactionAmount + " transferred to account " + accountNo);
	        }
	    }
	}

}
