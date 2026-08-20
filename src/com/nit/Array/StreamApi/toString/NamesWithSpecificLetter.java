/*Write a Java program to print all the names from String array which contains 
    letter 'a' in the name.
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]


Input:String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
Output: Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]*/

package com.nit.Array.StreamApi.toString;

import java.util.Arrays;

public class NamesWithSpecificLetter
{
    public static void main(String[] args)
    {
        int totalNames = Integer.parseInt(IO.readln("Enter the Total No of Names : "));

        String[] names = new String[totalNames];

        for (int index = 0; index < totalNames; index++)
        {
            names[index] = IO.readln("Enter the Names : ");
        }

        IO.println("Original Array: " + Arrays.toString(names));

        String[] namesWithA = Arrays.stream(names)
                .filter(name -> name.toLowerCase().contains("a"))
                .toArray(String[]::new);

        IO.println("Names Containing 'A' or 'a': " + Arrays.toString(namesWithA));
    }
}