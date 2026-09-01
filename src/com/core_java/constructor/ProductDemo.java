package com.core_java.constructor;

public class ProductDemo {

    void main() {
    	
        String name = IO.readln("Enter Product Name: ");
        int id = Integer.parseInt(IO.readln("Enter Product Id: "));
        double price = Double.parseDouble(IO.readln("Enter Product Price: "));

        // Create Product object
        Product p1 = new Product(id, name, price);

        // Print product details
        IO.println("\nProduct Details:");
        IO.println(p1);
    }
}
