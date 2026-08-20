package com.nit.StreamApi.To_Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

record Customer(Integer id, String name, Double bill) {}

public class ToMapDemo1
{
    public static void main(String[] args) 
    {
        ArrayList<Customer> listOfCustomers = new ArrayList<>();

        listOfCustomers.add(new Customer(111, "Scott", 25789D));
        listOfCustomers.add(new Customer(222, "Smith", 23789D));
        listOfCustomers.add(new Customer(333, "Alen", 27789D));

        Map<Integer, String> map = listOfCustomers
                .stream()
                .collect(Collectors.toMap(cust -> cust.id(), cust -> cust.name()));

        map.forEach((k, v) -> IO.println(k + " : " + v));
    }
}