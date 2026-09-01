package com.core_java.StreamApi.To_Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

record Product(Integer id, String name) {}

public class ToMapDemo3 {
    public static void main(String[] args) {

        Product p1 = new Product(111, "Camera");
        Product p2 = new Product(222, "Laptop");
        Product p3 = new Product(222, "Mobile"); // duplicate key

        ArrayList<Product> listOfProduct = new ArrayList<>();
        listOfProduct.add(p1);
        listOfProduct.add(p2);
        listOfProduct.add(p3);

        // ❌ Will throw exception
        Map<Integer, String> collect = listOfProduct
                .stream()
                .collect(Collectors.toMap(Product::id, Product::name));

        IO.println(collect);
    }
}