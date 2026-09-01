package com.core_java.objectclass.hascode_and_equals;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Product p2) {
            return this.id == p2.id &&
                   this.name.equals(p2.name);
        }
        return false;
    }
}

public class EqualsDemo4 {
    public static void main(String[] args) {

        Product p1 = new Product(111, "Laptop");
        Product p2 = new Product(111, "Laptop");

        IO.println(p1.equals(p2));
        IO.println(p1.hashCode() + " : " + p2.hashCode());
    }
}
