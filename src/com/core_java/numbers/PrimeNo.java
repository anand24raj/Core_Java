package com.core_java.numbers;

public class PrimeNo
{
    void main()
    {
        int number = Integer.parseInt(IO.readln("Enter the Number : "));
        int count = 0;

        IO.print("Divisible numbers are : ");

        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0)
            {
                IO.print(i+" "); 
                count++;
               
            }
        }

        if(count == 2)
        {
            IO.println("\n"+number + " is a Prime Number.");
            IO.print("Counts of Numbers are : "+ count +" ");
        }
        else
        {
            IO.println("\n"+number + " is NOT a Prime Number.");
            IO.print("Counts of Numbers are : "+ count +" ");
        }
    }
}
