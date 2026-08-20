/*Q6) Two sum problem.
    int[] arr = {2, 7, 11, 15};
    int target = 9;

    Output : Pair found: 2 , 7*/

package com.nit.Array.PrimitiveType;

public class SumProblem
{	
	void main()
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		IO.print("Element  : ");
		for(int i = 0 ; i < arr.length; i++) 
		{
			IO.print(arr[i]+ " ");
		}
		int target = Integer.parseInt(IO.readln("\nEnter the Target which you want before 17 : "));
		

		for(int i = 0; i < arr.length; i++)
		{	
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					IO.println(" Pair found : " + arr[i] + " , " + arr[j] + " = " + target);
				}
			}
		}
		if(target != -1)
		{
			IO.println(target +" Not found");
		}
	}

}
