package com.nit.generics;

record Employee(Integer id, String name) {}

class Box<T> 
{
    private T data;

    public Box(T data) 
    {
        this.data = data;
    }

    public T getData() 
    {
        return data;
    }
}

public class Test14 
{
    public static void main(String[] args) 
    {
        Box<Integer> intType = new Box<>(12);
        IO.println("Integer type is :" + intType.getData());

        Box<Double> doubleType = new Box<>(12.90);
        IO.println("Double type is :" + doubleType.getData());

        Box<Employee> empType = new Box<>(new Employee(12, "Scott"));
        IO.println("Employee type is :" + empType.getData());

        Box<Character> charType = new Box<>('A');
        IO.println("Character type is :" + charType.getData());
    }
}