package com.nit.functionalinterface.BiPredicate;

import java.util.function.BiPredicate;

public class Lambda11 {
    public static void main(String[] args) {

        BiPredicate<String, Integer> filter =
                (x, y) -> x.length() == y;

        boolean result = filter.test("Ravi", 4);
        IO.println(result);

        result = filter.test("Hyderabad", 10);
        IO.println(result);
    }
}
