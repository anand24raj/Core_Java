package com.core_java.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo5 {
    public static void main(String[] args) {

        int num = Integer.parseInt(IO.readln("Enter a number :"));

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> andPredicate = isPositive.and(isEven);

        IO.println("Is the number positive & even : " + andPredicate.test(num));
    }
}
