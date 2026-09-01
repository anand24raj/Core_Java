/*Array Access with Multiple Catch

Write a program to search for an element in an array.
First, take the size of the array.
Then, input the elements of the array.
Finally, input the index to search.
If the index is invalid, catch ArrayIndexOutOfBoundsException.
If the input type is invalid, catch InputMismatchException.

Input Format
--------------------
Integer n -> size of the array.
n integers -> array elements.
Integer index -> position to search.

Output Format
------------------------
If index is valid:
Element at index <index>: <value>
If index is invalid:
Index out of range
If input type is invalid:
Invalid input type  */

package com.core_java.exception.Array;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArraySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try {
            // Take size of array
            int n = sc.nextInt();

            // Create array
            int[] arr = new int[n];

            // Input array elements
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }

            // Input index to search
            int index = sc.nextInt();

            // Access element
            IO.println("Element at index " + index + ": " + arr[index]);

        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            IO.println("Index out of range");
        } 
        catch (InputMismatchException e) 
        {
            IO.println("Invalid input type");
        } 
        finally 
        {
            sc.close();
        }
    }
}