/*Write A JAVA Program  to remove Negative Numbers from an Integer Array.and Print Positive Numbers?
->to convert Array into Streams using Arrays.stream(ArrayName);

Input:Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
Output : Positive Numbers: [5, 10, 15]*/

package com.core_java.Array.StreamApi.toString;

import java.util.Arrays;

public class RemoveNegativeElement
{
    public static void main(String[] args)
    {
        int totalNumbers = Integer.parseInt(IO.readln("Enter the Total No of Numbers : "));

        Integer[] numbers = new Integer[totalNumbers];

        for (int index = 0; index < totalNumbers; index++)
        {
            numbers[index] = Integer.parseInt(IO.readln("Enter the Numbers : "));
        }

        Integer[] positiveNumbers = Arrays.stream(numbers)
                .filter(number -> number > 0)
                .toArray(Integer[]::new);

        IO.println("Positive Numbers: " + Arrays.toString(positiveNumbers));
    }
}