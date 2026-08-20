package com.nit.Collection.TreeSet;

import java.util.TreeSet;

record Employee(Integer id, String name) implements Comparable<Employee>
{
    @Override
    public int compareTo(Employee e2)
    {
        return this.name().compareTo(e2.name());
    }
}

public class TreeSetDemo3
{
    public static void main(String[] args)
    {
        TreeSet<Employee> ts1 = new TreeSet<>();

        ts1.add(new Employee(333, "Scott"));
        ts1.add(new Employee(111, "Zuber"));
        ts1.add(new Employee(222, "Aryan"));

        for (Employee employee : ts1)
        {
            IO.println(employee);
        }
    }
}