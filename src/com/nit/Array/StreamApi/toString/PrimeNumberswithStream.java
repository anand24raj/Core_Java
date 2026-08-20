/* Write a java program  to print all the Prime Numbers from an Integer Array. using
method calling as boolean method method name IsPrime(int number)
public static boolean isPrime(int num);
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]
->to print as arrayOutput like [name,name] need to create an array

Input: Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
Output : Prime Numbers: [2, 3, 5, 7, 11]*/

package com.nit.Array.StreamApi.toString;

import java.util.Arrays;

public class PrimeNumberswithStream 
{
    public static void main(String[] args)
    {
        int totalNumbers = Integer.parseInt(IO.readln("Enter the Total No of Numbers : "));

        Integer[] numbers = new Integer[totalNumbers];

        for (int index = 0; index < totalNumbers; index++)
        {
            numbers[index] = Integer.parseInt(IO.readln("Enter the Numbers : "));
        }

        IO.println("Original Array: " + Arrays.toString(numbers));

        Integer[] primeNumbers = Arrays.stream(numbers)
                .filter(PrimeNumberswithStream::isPrime)
                .toArray(Integer[]::new);

        IO.println("Prime Numbers: " + Arrays.toString(primeNumbers));
    }

    private static boolean isPrime(int num)
    {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }
}