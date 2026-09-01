//Q4) Find the second largest element in the array.

package com.core_java.Array.PrimitiveType;

import java.util.Arrays;

public class SecondLargest 
{
	void main()
	{
		int[] arr= {15, 52, 73, 94, 25, 86};
		
	// 1st Method -- Normal 	
		
		int temp = 0;
		
		for (int i = 0; i <arr.length; i++)
		{
			for (int j = i + 1; j <arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}
		}
		
		IO.println("Sorting data : " + Arrays.toString(arr));
		IO.println("2nd Largest No. is "+ arr[1]);     
		
	// 2nd Method 
		
	/*	Arrays.sort(arr);
       
        int largest = arr[arr.length-1];  //largest = 90
        int secondLargest = -1;
       
        for(int i= arr.length-2; i>=0; i--)
        {
            if(arr[i] !=largest)          //87  != 90
            {
                secondLargest = arr[i];
                break;
            }
        }      
        IO.println("Second largest element is :"+secondLargest);		
																	*/
	// 3rd Method  -- Straem API
			
/*		IO.print("Second largest element is : ");
		
			Arrays.stream(arr)
              .distinct()
              .boxed()
              .sorted((a,b)-> b.compareTo(a))
              .skip(1)
              .findFirst().ifPresent(IO::println);    
																*/
	}
}
