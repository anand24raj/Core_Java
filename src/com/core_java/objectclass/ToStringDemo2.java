package com.core_java.objectclass;

class Student 
{
    private int id;
    private String name;

    @Override
    public String toString() 
    {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class ToStringDemo2 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        IO.println(s1);
    }
}
