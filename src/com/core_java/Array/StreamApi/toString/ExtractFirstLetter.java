/*WAP to extract First Letter of Each Word from String Array


Input: String []names = {"James", "Aryan", "Vibha", "Aniket"};
Output:First Letters: [J, A, V, A]*/

package com.core_java.Array.StreamApi.toString;

import java.util.Arrays;

public class ExtractFirstLetter
{
	public static void main(String[] args) 
    {
        String[] names = {"James", "Aryan", "Vibha", "Aniket"};
        IO.println("Original Array: " + Arrays.toString(names));

        Object[] array = Arrays.stream(names)
                .map(name -> name.charAt(0))
                .toArray();

        IO.println("First Letters: " + Arrays.toString(array));
    }
}
