package com.nit.shallow_copy;

public class ShallowCopyExample {

    void main() {

        // Original Laptop
        Laptop lap1 = new Laptop(86000);
        IO.println("Laptop price is: " + lap1.getPrice());

        // Shallow copy (both references point to same object)
        Laptop lap2 = lap1;

        // Modify price using lap2
        lap2.setPrice(90000);

        IO.println("\nAfter Modification:");
        IO.println("Laptop price (lap1) is: " + lap1.getPrice()); // 90000
        IO.println("Laptop price (lap2) is: " + lap2.getPrice()); // 90000
    }
}

// Laptop class
class Laptop {

    private double price;

    public Laptop(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
