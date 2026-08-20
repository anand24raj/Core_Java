package com.nit.deep_copy;

public class CustomerDemo {

    public static void main(String[] args) {

        // First Customer object
        Customer c1 = new Customer();

        // Creating another Customer object
        Customer c2 = new Customer(12000);

        // Deep copy: copy the bill of c2 into c1
        c1.setCustomerBill(c2.getCustomerBill());

        // Printing both objects
        IO.println("c1 bill: " + c1.getCustomerBill()); // 12000
        IO.println("c2 bill: " + c2.getCustomerBill()); // 12000

        // Modify the second object
        c2.setCustomerBill(15000);

        IO.println("\nAfter modification:");
        IO.println("c1 bill: " + c1.getCustomerBill()); // 12000
        IO.println("c2 bill: " + c2.getCustomerBill()); // 15000
    }
}

// Customer class
class Customer {

    private double customerBill;

    // Default constructor
    public Customer() {
        this.customerBill = 0;
    }

    // Parameterized constructor
    public Customer(double customerBill) {
        this.customerBill = customerBill;
    }

    // Getter
    public double getCustomerBill() {
        return customerBill;
    }

    // Setter
    public void setCustomerBill(double customerBill) {
        this.customerBill = customerBill;
    }
}
