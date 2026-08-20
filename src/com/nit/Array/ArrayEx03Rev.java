package com.nit.Array;

public class ArrayEx03Rev
{
	//printing the array elements in reverse order.(User input)	
    public static void main(String[] args) 
    {
    	int size = Integer.parseInt(IO.readln("Enter the size of the Array :"));
       	int[] arr = new int[size];
        

        //Initializing the array elements using for loop.
        
       	for (int i = 0; i < size; i++) 
        {
            arr[i] = Integer.parseInt(IO.readln("Enter the array element at :" + i + "th index :"));
        }

        IO.println("Printing the array element in the Reverse order :");

        for (int i = arr.length - 1; i >= 0; i--)
            IO.print(arr[i] + " ");
     
        /*  
         * use without sorting   	
    	int[] arr = {1, 4, 7, 48, 89, 90, 56, 99};

    	for (int i = arr.length - 1; i >= 0; i--) 
    	{
    	    IO.print(arr[i] + " ");
    	}
        */    
        
        
    }
}