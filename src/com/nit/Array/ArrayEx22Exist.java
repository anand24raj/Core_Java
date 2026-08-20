package com.nit.Array;

// Verify whether given element exists in array

public class ArrayEx22Exist
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        int key = 30;

        boolean found = false;

        for (int num : arr) 
        {
            if (num == key) 
            {
                found = true;
                break;
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