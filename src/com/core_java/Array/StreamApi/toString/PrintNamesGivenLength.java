/*Write a Java Program  to print all the names from String array where the length of the  name must be greater than 3.
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]
->to print as arrayOutput like [name,name] need to create an array


Input: String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
Output : [Rohit, Smirti, Richa]*/

package com.core_java.Array.StreamApi.toString;

import java.util.Arrays;

public class PrintNamesGivenLength 
{
	public static void main(String[] args)
    {
        int totalNames = Integer.parseInt(IO.readln("Enter the Total No of Names : "));

        String[] names = new String[totalNames];

        for (int index = 0; index < totalNames; index++)
        {
            names[index] = IO.readln("Enter the Names : ");
        }

        String[] filteredNames = Arrays.stream(names)
                .filter(name -> name.length() > 3)
                .toArray(String[]::new);

        IO.println("Names with length > 3: " + Arrays.toString(filteredNames));
    }

}
