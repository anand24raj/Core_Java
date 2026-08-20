/*Q2) Given an array of N integers, left rotate the array by one place.? 
    Input : 1,2,3,4,5
    Output :2 3 4 5 1 */

package com.nit.Array.PrimitiveType;

public class LeftRotate
{
	void main()
	{
	    int size = Integer.parseInt(IO.readln("Enter the size of element : "));
	    int[] arr = new int[size];

	    for(int i = 0; i < size; i++)
	    {
	        arr[i] = Integer.parseInt(IO.readln("Enter the Elements : "));
	    }

	    if(size > 0)
	    {
	        int firstElement = arr[0];   
	        for(int i = 0; i < size - 1; i++)
	        {
	            arr[i] = arr[i + 1];
	        }
	        arr[size - 1] = firstElement;
	    }

	    IO.println("Array after left rotation:");
	    
	    for(int i = 0; i < size; i++)
	    {
	        IO.print(arr[i] + " ");
	    }
	}
}
