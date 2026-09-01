package com.core_java.Array_new;

public class MaximumConsecutiveOnes {

	public static void main(String[] args)
	{
		int arr[] = {1, 1, 2, 3, 30, 34, 56, 78, 99};

		int count = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == 1)	
			{
				count++;
					
				if(count > max)
				{
					max = count;
				}
			}
			else
			{
				count = 0;
			}
		}
		IO.println("Print Maximum Consecutive : " + max);
	}

}
