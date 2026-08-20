/*Q4) Given an array that contains only 1 and 0 return the count of maximum consecutive ones in     the array? 
    Input : 1,1,0,1,1,1,1
    Output : Maximum Consecutive Ones: 4*/

package com.nit.Array.PrimitiveType;

public class MaximumConsecutive
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

	    int currentCount = 0;
	    int maxCount = 0;

	    for(int i = 0; i < size; i++)
	    {
	        if(arr[i] == 1)
	        {
	            currentCount++;
	            if(currentCount > maxCount)
	            {
	                maxCount = currentCount;
	            }
	        }
	        else
	        {
	            currentCount = 0;
	        }
	    }  
	    IO.print("\nMaximum consecutive ones: "+maxCount);
	}
}
