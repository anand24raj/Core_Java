//Q1) Given an array of n integers, return true if the array is sorted in non-decreasing order or else false?

package com.nit.Array.PrimitiveType;

public class SortedIncreasing
{
	void main()
	{
	    int size = Integer.parseInt(IO.readln("Enter the size of element : "));
	    int[] arr = new int[size];

	    for(int i = 0; i < size; i++)
	    {
	        arr[i] = Integer.parseInt(IO.readln("Enter the Elements : "));
	    }

	    IO.print("Given Array: ");

	    for(int i = 0; i < size; i++)
	    {
	        IO.print(arr[i]+ " ");
	    }

	    boolean issorted = true;

	    for(int i = 0; i < size - 1; i++)
	    {
	        if(arr[i] > arr[i + 1])
	        {
	            issorted = false;
	            break;
	        }
	    }   
	    IO.print("\nIs sorted? "+issorted);
	}
}

