package com.nit.Array2;

public class SumOfArrayElement 
{
	public static void main(String[] args) 
	{
		int arr[] = {45, 34, 56, 78, 99, 56};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum += arr[i];
		}
		IO.println("Sum of Arrays are " + sum );
	}

}
