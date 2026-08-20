package com.nit.lambda;

@FunctionalInterface
interface Calculator {
    void doSum(int x, int y);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

        Calculator calc = (c, d) -> System.out.println("Sum is : " + (c + d));

        int num1 = Integer.parseInt(IO.readln("Enter first number : "));

        int num2 = Integer.parseInt(IO.readln("Enter second number : "));

        calc.doSum(num1, num2);
    }
}

