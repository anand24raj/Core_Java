/*Write a java Program  to filter Palindrome Words from an Array.
->Read the Input from user
->for converting arrays to stream [Arrays.stream(ArrayName)]
->to print as arrayOutput like [name,name] need to create an array

Input: String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
Output: Output : Palindrome Words: [madam, racecar, level]*/

package com.nit.Array.StreamApi.toString;

import java.util.Arrays;

public class PalindromeCheckerWithStream 
{
    public static void main(String[] args)
    {
        int totalWords = Integer.parseInt(IO.readln("Enter the total no of  Words : "));

        String[] words = new String[totalWords];

        for (int index = 0; index < totalWords; index++)
        {
            words[index] = IO.readln("Enter the Words : ");
        }

        String[] palindromeWords = Arrays.stream(words)
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .toArray(String[]::new);

        IO.println("Palindrome words: " + Arrays.toString(palindromeWords));
    }
}
