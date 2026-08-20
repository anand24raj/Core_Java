package com.nit.functionalinterface.function;

import java.util.function.Function;

public class FunctionDemo3 {
    public static void main(String[] args) {

        Function<String, Boolean> fn3 = name -> name.equalsIgnoreCase("Raj");

        IO.println("Are you Raj :" + fn3.apply("raj"));
    }
}
