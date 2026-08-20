package com.nit.blc;

public class EvenOrOdd
{
    public static boolean getEvenOrOdd(int num) {
        if (num <= 0) {
            IO.println("Error: Number must be positive");
            System.exit(0);
        }
        return num % 2 == 0;
    }
}

