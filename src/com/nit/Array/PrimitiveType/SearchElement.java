/*Q3) WAP to search an element in the existing array.*/

package com.nit.Array.PrimitiveType;

public class SearchElement
{

    public static void main(String[] args) 
    {
        // Sorted array (Binary Search requires sorted array)
        int[] arr = {10, 20, 30, 40, 50, 60};

        int key = 30;

        int startIndex = 0;
        int endIndex = arr.length - 1;

        boolean found = false;

        // Binary Search logic
        while (startIndex <= endIndex) 
        {
            int middleIndex = (startIndex + endIndex) / 2;

            if (arr[middleIndex] == key) 
            {
                found = true;
                break;
            } 
            else if (key < arr[middleIndex]) 
            {
                endIndex = middleIndex - 1;   // Search left half
            } 
            else 
            {
                startIndex = middleIndex + 1; // Search right half
            }
        }

        if (found) 
        {
            IO.println("Element Found");
        } 
        else 
        {
            IO.println("Element Not Found");
     
       }   
   }
    
}
