package com.nit.this_keyword;

public class Product {

    private int id;
    private String name;

    public void setProductData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayProductData() {
        IO.println("Product Id is: " + this.id);
        IO.println("Product Name is: " + this.name);
    }
}
