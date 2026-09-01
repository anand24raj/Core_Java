package com.core_java.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {

        Supplier<String> s1 = () -> 15 + 15 + "Java" + 90 + 90;

        String data = s1.get();
        IO.println(data);
    }
}
