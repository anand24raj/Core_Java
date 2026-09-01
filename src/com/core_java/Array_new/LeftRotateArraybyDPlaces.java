package com.core_java.Array_new;

public class LeftRotateArraybyDPlaces 
{
	public static void main(String[] args) 
	{
//		int arr[] = {45, 34, 56, 78, 99, 56};
//		
//		int n = 2;
//		
//		for (int i = 0; i < n; i++) 
//		{
//			int temp = arr[i];
//			
//			for (int j = 0; j < arr.length - 1; j++) 
//			{
//				arr[j] = arr[j + 1];
//			}
//			
//			arr[arr.length - 1] = temp; 
//			
//		}
//		for (int i = 0; i < arr.length; i++) 
//		{
//			IO.print(arr[i] + " ");
//		}
	

/*Q2) Given an array of N integers, left rotate the array by one place.? 
Input : 1,2,3,4,5
Output :2 3 4 5 1 */

		int[] arr = {1,2,3,4,5};

        int firstElement = arr[0];   
        for(int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;

    IO.println("Array after left rotation:");
    
    for(int i = 0; i < arr.length; i++)
    {
        IO.print(arr[i] + " ");
    }
}

}


