package com.nit.functionalinterface.function;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        Function<String, Integer> fn2 = city -> city.length();

        String cityName = IO.readln("Enter your City Name :");
        Integer cityLength = fn2.apply(cityName);

        IO.println("The length of " + cityName + " is :" + cityLength);
    }
}
