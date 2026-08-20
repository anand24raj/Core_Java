package com.nit.String2;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String []arr = {"flower", "flow", "flight"};

        String prefix = "";

        // Traverse each character of the first string
        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            // Compare with all other strings
            for (int j = 1; j < arr.length; j++) {

                // If index exceeds length or characters don't match
                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    System.out.println("Prefix = " + prefix);
                    return;
                }
            }

            // If all strings have the same character
            prefix += ch;
        }

        System.out.println("Prefix = " + prefix);
    }
}