package com.nit.lambda;

@FunctionalInterface
interface Length {
    int getLength(String str);
}

public class LambdaDemo3 {
    public static void main(String[] args) {

        Length length = str -> str.length();

        String city = IO.readln("Enter your city Name : ");

        IO.println("The length of " + city + " is : " + length.getLength(city));
    }
}