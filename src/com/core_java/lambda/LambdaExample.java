package com.core_java.lambda;

@FunctionalInterface
interface Predictable {
    boolean verify(int num);
}

public class LambdaExample {
    public static void main(String[] args) {

        Predictable p1 = num -> num % 2 == 0;
        
        int no = Integer.parseInt(IO.readln("Enter a number : "));

        boolean isEven = p1.verify(no);
        IO.println("Is " + no + " even number : " + isEven);
    }
}

