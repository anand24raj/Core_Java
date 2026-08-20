//Q5) Find the second largest element in the array where array contains duplicate elements.

package com.nit.Array.PrimitiveType;

public class SecondLargestDuplicate
{
	public static void main(String[] args) 
	{
		int element = Integer.parseInt(IO.readln("Enter the Elements : "));
		int[] arr = new int[element];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    IO.println("Duplicate element is : " + arr[j]);
                }
            }
        }
	}
}
