/*Write a java program to print all the unique numbers from the Array.
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]
->to print as arrayOutput like [name,name] need to create an array

Input: Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
Output: Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]*/

package com.nit.Array.StreamApi.toString;

import java.util.Arrays;

public class UniqueElementsWithStream 
{
	public static void main(String[] args)
    {
        int totalNumbers = Integer.parseInt(IO.readln("Enter the Total No of integers :"));

        Integer[] numbers = new Integer[totalNumbers];

        for (int index = 0; index < totalNumbers; index++)
        {
            numbers[index] = Integer.parseInt(IO.readln("Enter the integers :"));
        }

        Integer[] uniqueNumbers = Arrays.stream(numbers)
                .distinct()
                .toArray(Integer[]::new);

        IO.println("Unique Numbers: " + Arrays.toString(uniqueNumbers));
    }

}
