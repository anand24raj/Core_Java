package com.core_java.Collection.TreeSet;

import java.util.TreeSet;

record Student(Integer id, String name) {}

public class TreeSetDemo4
{
    public static void main(String[] args)
    {
        TreeSet<Student> students = new TreeSet<>((s1, s2) -> s2.id().compareTo(s1.id()));

        students.add(new Student(222, "Raj"));
        students.add(new Student(111, "Zuber"));
        students.add(new Student(333, "Aryan"));

        students.forEach(std -> IO.println(std));
    }
}