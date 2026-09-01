package com.core_java.constructor;

public class Product {

    private int id;
    private String name;
    private double price;

    // Constructor with validation
    public Product(int id, String name, double price) {

        if (id <= 0) {
            System.err.println("Error: Id is invalid. It must be positive");
            System.exit(0);
        }

        if (name == null || name.equals("null") || name.isBlank()) {
            System.err.println("Error: Name cannot be null or empty");
            System.exit(0);
        }

        if (price <= 0) {
            System.err.println("Error: Price cannot be negative or zero");
            System.exit(0);
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
