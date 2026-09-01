package com.core_java.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerDemo 
{
    public static void main(String[] args) 
    {

        Consumer<String> c1 = str -> IO.println("String type is :" + str);
        c1.accept("Java");

        Consumer<Integer> c2 = num -> IO.println("Integer Type is :" + num);
        c2.accept(12);

        Consumer<Customer> c3 = cust -> IO.println("Customer type is :" + cust);
        c3.accept(new Customer());
    }
}

class Customer {
    @Override
    public String toString() {
        return "Customer Object";
    }
}
