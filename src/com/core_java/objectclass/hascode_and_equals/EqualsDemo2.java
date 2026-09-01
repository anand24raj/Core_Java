package com.core_java.objectclass.hascode_and_equals;

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj instanceof Customer c2) {
            return this.id == c2.id &&
                   this.name.equals(c2.name);
        }
        return false;
    }
}

public class EqualsDemo2 {
    public static void main(String[] args) {

        Customer c1 = new Customer(111, "John");
        Customer c2 = new Customer(111, "John");

        IO.println(c1.equals(c2));                       // true
        IO.println(c1.hashCode() + " : " + c2.hashCode());
    }
}
