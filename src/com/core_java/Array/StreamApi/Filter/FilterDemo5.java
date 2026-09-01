package com.core_java.Array.StreamApi.Filter;

import java.util.Arrays;

// Q5) WAP to filter all the prime number from the given array.
public class FilterDemo5 
{
    public static void main(String[] args) 
    {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};

        // Filtering prime numbers
        int[] primeNumbers = Arrays.stream(numbers)
                .filter(num -> isPrime(num))
                .toArray();

        IO.println("Prime Numbers: " + Arrays.toString(primeNumbers));
    }

    // Method to check if a number is prime [Helper method]
    private static boolean isPrime(int num) 
    {
        if (num < 2) 
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }

        return true;
    }
}