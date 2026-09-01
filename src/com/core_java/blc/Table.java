package com.core_java.blc;

public class Table
{
	public static void printTable (int num)
	{
		for(int i=1; i<=10; i++)
		{
			IO.println(num+" X "+i+" = "+(num*i));
		}
	}
}
