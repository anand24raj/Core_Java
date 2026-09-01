package com.core_java.Api_Method_Reference.Constructor;

import java.util.function.BiFunction;

class Customer 
{
    private Integer id;
    private String name;

    public Customer(Integer id, String name) 
    {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}

public class ConstructorReferenceDemo3 
{
    public static void main(String[] args) 
    {
        BiFunction<Integer, String, Customer> fn2 = Customer::new;
        Customer customer = fn2.apply(101, "Scott");
        IO.println(customer);
    }
}