package com.nit.Collection.HashMap;

import java.util.HashMap;
import java.util.Objects;

class Customer
{
    private Integer id;
    private String name;

    public Customer(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Customer [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) 
        	return true;
        
        if (obj == null || getClass() != obj.getClass()) 
        	return false;

        Customer other = (Customer) obj;
        return Objects.equals(id, other.id) &&
               Objects.equals(name, other.name);
    }
}

public class HashMapInternalDemo1
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer(111, "Scott");
        Customer c2 = new Customer(111, "Scott");

        HashMap<Customer, String> map = new HashMap<>();

        map.put(c1, "Hyd");
        map.put(c2, "Vizag");

        IO.println(map);
        IO.println(map.size());
    }
}