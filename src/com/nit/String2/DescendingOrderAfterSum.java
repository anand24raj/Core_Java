package com.nit.String2;
import java.util.Arrays;

public class DescendingOrderAfterSum {

    public static void main(String[] args) {

        String[] words = {"Mango", "banana", "apple", "kiwi", "papaya"};

        int[] sums = new int[words.length];

        System.out.println("Word\t\tASCII Sum");

        // Calculate ASCII Sum
        for (int i = 0; i < words.length; i++) {

            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) 
            {
                sum += words[i].charAt(j);
            }

            sums[i] = sum;

            System.out.println(words[i] + "\t\t" + sum);
        }

        // Sort in Descending Order
        for (int i = 0; i < words.length - 1; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {

                if (sums[i] < sums[j]) {

                    int tempSum = sums[i];
                    sums[i] = sums[j];
                    sums[j] = tempSum;

                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

//        System.out.println("\nAfter Sorting");
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i] + " -> " + sums[i]);
//        }

        System.out.println("\nWords : " + Arrays.toString(words));
 //       System.out.println("Sums  : " + Arrays.toString(sums));
    }
}