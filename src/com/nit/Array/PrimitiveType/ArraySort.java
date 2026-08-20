/*Q2) How to sort Array elements using nested for loop.*/

package com.nit.Array.PrimitiveType;

public class ArraySort 
{
    public static void main(String[] args) 
    {
        int[] numbers = {45, 12, 78, 34, 23};
        int lengthOfArray = numbers.length;

        for (int outerIndex = 0; outerIndex < lengthOfArray; outerIndex++) 
        {
            for (int innerIndex = outerIndex + 1; innerIndex < lengthOfArray; innerIndex++) 
            {
                if (numbers[outerIndex] > numbers[innerIndex]) 
                {
                    int temporaryValue = numbers[outerIndex];
                    numbers[outerIndex] = numbers[innerIndex];
                    numbers[innerIndex] = temporaryValue;
                }
            }
        }

        IO.println("Array after Simple Sort:");
        for (int value : numbers) 
        {
            IO.print(value + " ");
        }
    }
}
