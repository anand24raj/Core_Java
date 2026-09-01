package com.core_java.exception;

public class CustomerDemo {
    public static void main(String[] args) {

        IO.println("Welcome to my Application :");

        try {
            int firstValue = Integer.parseInt(IO.readln("Enter First Value : "));
            int secondValue = Integer.parseInt(IO.readln("Enter Second Value : "));

            int result = firstValue / secondValue;
            IO.println("Result is : " + result);
        }
        catch (Exception e) {
            System.err.println("Don't put zero here");
        }

        IO.println("Thank you for visiting my Application !");
    }
}
