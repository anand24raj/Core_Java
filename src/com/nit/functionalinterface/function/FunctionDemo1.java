package com.nit.functionalinterface.function;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = num -> num * num * num;

        int no = Integer.parseInt(IO.readln("Enter a number :"));
        IO.println("Cube of " + no + " is :" + f1.apply(no));
    }
}
