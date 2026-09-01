package com.core_java.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {

        Predicate<String> p2 = name -> name.equalsIgnoreCase("Anand");

        String myName = IO.readln("Enter your Name :");
        IO.println("Are you Anand : " + p2.test(myName));
    }
}
