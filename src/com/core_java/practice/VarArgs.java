// 1. Write a method using varargs to calculate the sum of numbers.
package com.core_java.practice;

public class VarArgs 
{
    static int Sum(int... number) 
    {
        int sum = 0;

        for (int num : number) 
        {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) 
    {
        IO.println("Sum are = " + Sum(10, 20, 30));
    }
}