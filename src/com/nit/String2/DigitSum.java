package com.nit.String2;

public class DigitSum {

    public static void main(String[] args) {

        String[] str = { "abc", "123", "456", "efg" };

        int sum = 0;

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length(); j++) {

                char ch = str[i].charAt(j);

                if (Character.isDigit(ch)) {
                    sum += ch - '0';
                }
            }
        }

        System.out.println("Sum = " + sum);
    }
}