/*Write a java program  to convert Integer Array to String Representation
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]
->to print as arrayOutput like [name,name] need to create an array

Input: Integer[] numbers = {10, 20, 30, 40, 50};
Output: Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]*/

package com.nit.Array.StreamApi.toString;

import java.util.Arrays;

public class IntegerToString
{
    public static void main(String[] args)
    {
        int totalNumbers = Integer.parseInt(IO.readln("Enter the total No of Integer Array : "));

        Integer[] numbers = new Integer[totalNumbers];

        for (int index = 0; index < totalNumbers; index++)
        {
            numbers[index] = Integer.parseInt(IO.readln("Enter the Integer Array : "));
        }

        IO.println("Original Integer Array: " + Arrays.toString(numbers));

        String[] convertedStrings = Arrays.stream(numbers)
                .map(number -> "Number: " + number)
                .toArray(String[]::new);

        IO.println("Converted Strings: " + Arrays.toString(convertedStrings));
    }
}