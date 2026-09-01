package com.core_java.functionalinterface.BiPredicate;

import java.util.function.BiPredicate;

public class Lambda12 {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isSumEven =
                (a, b) -> (a + b) % 2 == 0;

        IO.println(isSumEven.test(2, 3));
        IO.println(isSumEven.test(5, 7));
    }
}
