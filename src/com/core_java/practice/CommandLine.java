package com.core_java.practice;

public class CommandLine 
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int max,min=0;

		if (n1 > n2) 
		{
			max = n1;
			min = n2;
		} 
		else 
		{
			max = n2;
			min = n1;
		}

		IO.println("Maximum no. : " + max);
		IO.println("Minimum no. : " + min);
	}
}