package com.nit.Api_Method_Reference.Constructor;

import java.util.function.Function;

class Student 
{
    private Integer id;
    private String name;

    public Student(Integer id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class ConstructorReferenceDemo4 
{
    public static void main(String[] args) 
    {
        // Create Student array using constructor reference
        Function<Integer, Student[]> fn3 = Student[]::new;

        Integer size = Integer.valueOf(IO.readln("Enter the size of the array : "));
        Student[] students = fn3.apply(size);

        for (int i = 0; i < students.length; i++) 
        {
            Integer id = Integer.valueOf(IO.readln("Enter the id of the student : "));
            String name = IO.readln("Enter the name of the student : ");
            students[i] = new Student(id, name);
        }
        IO.println("Printing Student Data");
        
        for (Student student : students) 
        {
            IO.println(student);
        }
    }
}