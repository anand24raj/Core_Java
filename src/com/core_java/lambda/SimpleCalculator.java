/*Simple Calculator Operation

A basic calculator application performs a single arithmetic operation on two numbers.
To ensure that the calculator logic is represented using only one abstract method, the interface must be annotated with @FunctionalInterface.

You are required to:
Define a functional interface using @FunctionalInterface
Implement it using a lambda expression
Perform an addition operation

Rules
Create an interface Calculator
Annotate it with @FunctionalInterface
Declare only one abstract method:
int calculate(int a, int b);
Implement the interface using a lambda expression
Display the result of the calculation

Input Format
----------------------
First number
Second number

Output Format
------------------------
Display the calculated result*/

package com.core_java.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Calculators 
{
    int calculate(int a, int b);
}

public class SimpleCalculator
{
     void main() {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter first Number : ");
        int num1 = sc.nextInt();
        IO.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        Calculators add = (a, b) -> a + b;

        int result = add.calculate(num1, num2);

        IO.println("Result = "+ result);
        sc.close();
    }
}



