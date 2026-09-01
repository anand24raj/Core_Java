package com.core_java.oops.method_overridding;

class Person1
{
    protected int age = 35;

    public int getAge() 
    {
        return age;
    }

    public void printAge() 
    {
        IO.println(this.getAge());
    }
}

class Student1 extends Person1
{
    protected int age = 22;

    public int getAge() 
    {
        return age;
    }
    
    public void printage() 
    {
        IO.println(super.getAge());
    }
}

public class IQ1 
{
    public static void main(String[] args) 
    {
        Person1 person = new Person1();
        person.printAge();
    }
}
