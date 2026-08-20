package com.nit.Array2;

import java.util.Arrays;

public class AverageOfArrayElements 
{
	public static void main(String[] args) 
	{
		int arr[] = {45, 34, 56, 78, 99, 56};
		
		int sum = 0;
		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			sum += arr[i];
//		}
//		
//		double avr =(double)sum / arr.length;
//		
//		String formattedAvr = String.format("%.2f", avr);
//		
//		IO.println("With typecasting" + Arrays.toString(arr) +" of the Avarage of Element : " + formattedAvr);

	
	
	for(int i = 0; i< arr.length; i++)
	{
		sum += arr[i];
	}
	
	double avrage = sum/arr.length;
	
	IO.println("Without typecasting" + Arrays.toString(arr) +" of the Avarage of Element : " + avrage);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
