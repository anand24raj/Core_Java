package com.nit.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {

        Predicate<Integer> p1 = age -> age >= 18;

        int myAge = Integer.parseInt(IO.readln("Enter your age :"));
        IO.println("Are you eligible for vote : " + p1.test(myAge));
    }
}

