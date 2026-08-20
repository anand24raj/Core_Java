package com.nit.functionalinterface.supplier;

import java.util.function.Supplier;

class Customer {
    private int id;
    private String name;
    private double bill;

    public Customer(int id, String name, double bill) {
        this.id = id;
        this.name = name;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
    }
}

public class SupplierDemo2 {
    public static void main(String[] args) {

        Supplier<Customer> s2 = () -> new Customer(1, "John", 18000);

        Customer customer = s2.get();
        IO.println(customer);
    }
}
