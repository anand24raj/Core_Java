/*Write a java program to convert all the names of String array into uppercase 
use nextLine() readln not work for reading

Input: String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
Output: Output : [VIRAT, SANJU, ROHIT, BUMRAH]*/

package com.core_java.Array.StreamApi.toString;

import java.util.Arrays;

public class NamesToCapitals 
{
    public static void main(String[] args) 
    {
        int totalNames = Integer.parseInt(IO.readln("Enter total numbers of Name : "));

        String[] names = new String[totalNames];

        for (int index = 0; index < totalNames; index++) 
        {
            names[index] = IO.readln("Enter the Names : ");
        }

        IO.println("Original Array: " + Arrays.toString(names));

        String[] upperCaseNames = Arrays.stream(names)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        IO.println("NAMES: " + Arrays.toString(upperCaseNames));
    }
}