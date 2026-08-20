package com.nit.Array2;

public class SecondLargest {

	public static void main(String[] args) {
/*		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 121, 1634 };
		int max = Integer.MIN_VALUE;
		int secLar = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) 
			{
				secLar = max;
				max = arr[i];
			}
			else if (secLar <=  arr[i] && arr[i] != max) 
			{
				secLar = arr[i];
			}
		}
		IO.println(secLar);*/
		
		
		
		
		int arr[] = {20, 25, 10, 5, 25};
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				secMax = max;
				max = arr[i];
			}
			else if(arr[i] > secMax && arr[i] != max )			
			{
				secMax = arr[i];
			}
		}
		IO.print(secMax);
	}

}
