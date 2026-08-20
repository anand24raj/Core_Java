package com.nit.factory_method;

public class FactoryMethodDemo2 
{
    void main() {

        while (true) 
        {
            // Read product details from user
            var id = Integer.parseInt(IO.readln("Enter the Product id: "));
            var name = IO.readln("Enter the Product name: ");
            var price = Double.parseDouble(IO.readln("Enter the Product price: "));

            // Create Product object using factory method
            Product product = Product.getProductObject(id, name, price);

            // Print product details
            IO.println(product);

            // Ask if user wants to continue
            var choice = IO.readln("Do you want more product objects [Yes/no]: ");

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    // Private constructor
    private Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Override toString() to display product info
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    // Static factory method
    public static Product getProductObject(int id, String name, double price) {
        return new Product(id, name, price);
    }
}
