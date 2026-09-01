package com.core_java.practice;

public class ElectricityBill
{
	public static void main(String[] args) 
	{
		IO.print("Enter your current reading :");
	    int currReading = Integer.parseInt(IO.readln());
	    IO.print("Enter your Previous reading :");
	    int prevReading = Integer.parseInt(IO.readln());

	    int numberOfCall = currReading - prevReading;
	    IO.println("The Current month number of call is :"+numberOfCall);
	    double bill = 0.0;

	    if(numberOfCall <=100)
	    {
	        bill = 360;
	    }
	    else if(numberOfCall <=250)
	    {
	       bill = 360 + (numberOfCall - 100)* 1.0;
	    }
	    else
	    {
	       bill = 360 + 150 + (numberOfCall- 250) * 1.2;
	    }

	    IO.println("You bill for this month is :"+bill);
	}
}