package com.core_java.exception;

public class TryDemo {
    public static void main(String[] args) {

        IO.println("Main method started!!!");

        try {
            int x = Integer.parseInt(IO.readln("Enter first Number : "));
            int y = Integer.parseInt(IO.readln("Enter second Number : "));
            int result = x / y;

            IO.println("Result is : " + result);
            IO.println("End of try block");
        }
        catch (Exception e) {
            IO.println("Inside Catch block");
            System.err.println(e.toString());
        }

        IO.println("Main method ended!!!");
    }
}