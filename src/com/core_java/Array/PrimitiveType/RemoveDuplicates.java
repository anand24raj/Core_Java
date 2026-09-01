//Q1) WAP to Remove Duplicates from array.
    
package com.core_java.Array.PrimitiveType;

public class RemoveDuplicates
{
	void main() 
	{
		int arr[] = {1, 2, 1,4,5,2,3,4,6,7,8,6,9,8};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = -1;
				}
			}
			if(arr[i] != -1)
			{
				System.out.print(arr[i]+ " ");
			}
			
		}		
	}

}
