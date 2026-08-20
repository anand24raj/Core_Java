package com.nit.Api_Method_Reference.Constructor;

import java.util.function.Function;

class Product 
{
    private Double price;

    public Product(Double price) 
    {
        this.price = price;
    }

    @Override
    public String toString() 
    {
        return "Product [price=" + price + "]";
    }
}

public class ConstructorReferenceDemo2 
{
    public static void main(String[] args) 
    {
        Function<Double, Product> fn1 = Product::new;
        Product product = fn1.apply(15D);
        IO.println(product);
    }
}
