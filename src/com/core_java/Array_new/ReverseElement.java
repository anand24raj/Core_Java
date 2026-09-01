package com.core_java.Array_new;

import java.util.Arrays;

public class ReverseElement {

	public static void main(String[] args) 
	{	
		int arr[] = {45, 34, 56, 78, 99, 56};
		
		IO.print(Arrays.toString(arr) +" of Reverse Element : ");
				
		for (int i = arr.length - 1; i >= 0; i--) 
		{
			IO.print(arr[i] + " ");
		}	
	}
}
