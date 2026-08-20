package com.nit.String2;

final class Employee
{
    private final int id;
    private final String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}

public class UserdefinedImmutableClass
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(101, "Anand");
        
        System.out.println("Id : " + emp.getId());
        System.out.println("Name : " + emp.getName());
    }
}