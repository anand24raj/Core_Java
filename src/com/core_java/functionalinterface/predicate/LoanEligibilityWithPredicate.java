/*Develop a scenario based program by using Functional interface to check whether a customer is eligible for loan or not.

Input:
Enter Customer Name: Ravishankar
Enter Salary: 30000
Enter Credit Score: 720
Enter Age: 18
Output:
Ravishankar is NOT Eligible for Loan...

Explanation:
: No parameter 
Return Type : boolean 
Access modifier : public 
In this method by using Predicate<Customer> verify whether a customer is eligible for loan or not by using following criteria : 
a) Customer salary should be > 25000 
b) Credit Score should be > 700 
c) Age must be > 21 By using Logical AND operator verify all the criteria and return true/false. 
Take an ELC class LoanEligibilityWithPredicate with main method, With the help of IO class create the input data, 
create the object for Customer class and verify whether the customer is eligible for loan or not.*/

package com.core_java.functionalinterface.predicate;

import java.util.function.Predicate;

record Customer(String name, Double salary, Double creditScore, Integer age) {

}

public class LoanEligibilityWithPredicate {
	void main() {
		String name=IO.readln("Enter Name : ");
		double salary = Double.parseDouble(IO.readln("Enter Salary : "));
		double creditScore = Double.parseDouble(IO.readln("Enter Credit Score : "));
		int age = Integer.parseInt(IO.readln("Enter age : "));
		
		Customer cust=new Customer(name, salary, creditScore, age);
		
		
		Predicate<Customer> custPredicate=(cobj)->{
			
			if(cobj.salary()>25000 && cobj.creditScore()>700  && cobj.age()>21) {
				return true;
			}
			return false;
		};
		
		
		
		if(custPredicate.test(cust)) {
			IO.println(name+" is Eligible for Loan...");
		}
		else {
			IO.println(name+" is NOT Eligible for Loan...");
			
		}
	}

}
