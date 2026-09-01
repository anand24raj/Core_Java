	package com.core_java.Array_new;

import java.util.Arrays;

public class MoveAllZerosToEnd 
{
	public static void main(String[] args) 
	{
		int arr[] = {45, 0, 34, 56, 0, 78, 99, 0, 56};
		
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] != 0)
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
			}
		}
		IO.println("Move all zero in last :" + Arrays.toString(arr));
		
		
/*		
 * for(int i = 0; i < arr.length; i ++)
		{
			if(arr[i] != 0)
			{
				arr[k] = arr[i];
				k++;
			}
		}
		IO.print("2nd method Move all zero in last :");
		for (int i = k; i < arr.length; i++) 
		{
			arr[i] = 0;
		}
		IO.println(Arrays.toString(arr));
 */

	}
}
