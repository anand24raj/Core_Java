/*Q3) You are given an array of integers, your task is to move all the zeros in the array to       the end.
    Input : [0, 1, 3, 4, 0, 9, 5]
    Output : [1, 3, 4, 9, 5, 0, 0]*/

package com.nit.Array.PrimitiveType;

public class MoveAllZeroLast
{
	void main()
	{
	    int size = Integer.parseInt(IO.readln("Enter the size of element : "));
	    int[] arr = new int[size];

	    for(int i = 0; i < size; i++)
	    {
	        arr[i] = Integer.parseInt(IO.readln("Enter the Elements : "));
	    }

	    IO.print("Original Array: ");
	    for(int i = 0; i < size; i++)
	    {
	        IO.print(arr[i] + " ");
	    }

	    int position = 0;
	    for(int i = 0; i < size; i++)
	    {
	        if(arr[i] != 0)
	        {
	            arr[position] = arr[i];
	            position++;
	        }
	    }

	    while(position < size)
	    {
	        arr[position] = 0;
	        position++;
	    }
	    IO.print("\nArray After Moving Zeros to End: ");
	    for(int i = 0; i < size; i++)
	    {
	        IO.print(arr[i] + " ");
	    }
	    IO.println();
	}
}
