package com.core_java.functionalinterface.UnaryOperator;

import java.util.function.UnaryOperator;

public class Lambda15 {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x * x;
        IO.println(square.apply(5));

        UnaryOperator<String> concat = str -> str.concat("base");
        IO.println(concat.apply("Data"));
    }
}
