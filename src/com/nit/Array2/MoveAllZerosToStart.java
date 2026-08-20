package com.nit.Array2;

public class MoveAllZerosToStart {

	public static void main(String[] args) 
	{
		int arr[] = {45, 0, 34, 56, 0, 78, 99, 0, 56};
		
		int k = arr.length - 1;
		
		for (int i = arr.length - 1 ; i >= 0; i--) 
		{
			if(arr[i] != 0 )
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k--] = temp;		
			}
		}
		IO.print("Move all zero in Start :");
		for (int i = 0; i < arr.length; i++) 
		{
			IO.print(" " + arr[i]);
		}
	}

}
