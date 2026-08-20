package com.nit.functionalinterface.BiFunction;

import java.util.function.BiFunction;

public class Lambda14 {
    public static void main(String[] args) {

        // Concatenate two strings
        BiFunction<String, String, String> concatenateStrings =
                (str1, str2) -> str1.toUpperCase() + str2.toUpperCase();

        String result = concatenateStrings.apply("Hello", "Java");
        IO.println(result);

        // Find total length of two strings
        BiFunction<String, String, Integer> calculateLength =
                (str1, str2) -> str1.length() + str2.length();

        Integer result1 = calculateLength.apply("Hello", "Java");
        IO.println(result1);
    }
}
