package com.nit.functionalinterface.BinaryOperator;

import java.util.function.BinaryOperator;

public class Lambda16 {
    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        IO.println(add.apply(3, 5));

        BinaryOperator<String> concat =
                (x, y) -> x.toUpperCase() + y.toLowerCase();

        IO.println(concat.apply("java", "world"));
    }
}
