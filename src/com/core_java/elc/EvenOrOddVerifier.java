package com.core_java.elc;

import com.core_java.blc.EvenOrOdd;
public class EvenOrOddVerifier
{
	void main()
	{
		var id = Integer.parseInt(IO.readln("Enter a Number: "));
		boolean isEven = EvenOrOdd.getEvenOrOdd(id);
		
		if(isEven)
			{
			IO.println(id+" is an even number ");
			}
		else
			{
			IO.println(id+" is an odd number ");
			}
	}
}