package com.core_java.Array_new;

import java.util.Arrays;

public class SumOfTwoArray {

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 5, 7};
		int []arr1 = {8, 9, 5, 6, 10};
		
		 int result[] = new int[arr.length];
		 
		 for (int i = 0; i < arr.length; i++)
		 {
			result [i] = arr[i] + arr1[i];
		}
		 IO.println("Sum of " + Arrays.toString(arr) + " and " + Arrays.toString(arr1) + " is " + Arrays.toString(result)) ;

	}

}
