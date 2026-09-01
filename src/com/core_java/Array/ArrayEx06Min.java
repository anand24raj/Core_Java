package com.core_java.Array;

import java.util.Scanner;

// Find the minimum element in the array

class FindMinimum 
{
    public static void minValue(int[] arr) 
    {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
        	 if (min > arr[i])
             {
                 min = arr[i];
             }
        }
        System.out.println("Minimum value of the array is :" + min);
    }
}

public class ArrayEx06Min {
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = Integer.parseInt(sc.nextLine());

            int arr[] = new int[size];
            
          //Initialize the array elements

            for (int i = 0; i < size; i++) 
            {
                System.out.print("Enter element at position " + i + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            FindMinimum.minValue(arr);
            sc.close();
        } 
        catch (NegativeArraySizeException e) 
        {
            System.err.println("Array size must be positive integer");
        } 
        catch (Exception e) 
        {
            System.err.println("Input is Invalid");
        }
        
    }
}