//Q2) Program to merge to array elements into a single array.

package com.core_java.Array.PrimitiveType;

public class MergeArray 
{
	void main() 
	{
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {11, 12, 13, 14, 15, 16};

        int[] newArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) 
        {
            newArray[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) 
        {
            newArray[arr1.length + j] = arr2[j];
        }

        IO.print("Merged Array : ");
        
        for (int k = 0; k < newArray.length; k++) 
        {
            IO.print(newArray[k] + " ");
        }	
	}
}
