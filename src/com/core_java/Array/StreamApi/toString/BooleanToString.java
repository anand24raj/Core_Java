/*Write a  java Program to convert boolean value to "Yes" or "No"
->No test cases take direct values?

Input: Boolean[] flags = {true, false, true, false, true};
Output: Yes/No Values: [Yes, No, Yes, No, Yes]*/

package com.core_java.Array.StreamApi.toString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BooleanToString 
{
    public static void main(String[] args) 
    {
        Boolean[] flags = {true, false, true, false, true};

        List<String> yesNoValues = Arrays.stream(flags)
                .map(flag -> flag ? "Yes" : "No")
                .collect(Collectors.toList());

        IO.println("Yes/No Values: " + yesNoValues);
    }

}
