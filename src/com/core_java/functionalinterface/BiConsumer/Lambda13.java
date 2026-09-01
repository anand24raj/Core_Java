package com.core_java.functionalinterface.BiConsumer;

import java.util.function.BiConsumer;

public class Lambda13 {
    public static void main(String[] args) {

        BiConsumer<Integer, String> updateVariables =
                (num, str) -> {
                    num = num * 2;
                    str = str.toUpperCase();
                    IO.println("Updated values: " + num + ", " + str);
                };

        int number = 15;
        String text = "nit";

        updateVariables.accept(number, text);

        IO.println("Original values: " + number + ", " + text);
    }
}
