package com.core_java.oops.pass_by_value;

public class PassByValueDemo3 {

    void main() {

        Product p1 = new Product();
        IO.println("Price is: " + p1.getPrice()); // 15000

        accept(p1); // modify object

        IO.println("Price is: " + p1.getPrice()); // 18000
    }

    // Method that modifies the object field
    static void accept(Product prod) {
        prod.setPrice(18000); // modifies the original object
    }
}

// Product class
class Product {

    private double price = 15000;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
