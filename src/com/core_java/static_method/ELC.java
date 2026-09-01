package com.core_java.static_method;

public class ELC {

    public static void main(String[] args) {

        // Calling static methods of interface
        double sum = Calculator.doSum(12, 12);
        IO.println("The sum is : " + sum);

        double cube = Calculator.getCube(5);
        IO.println("Cube is : " + cube);
    }
}

