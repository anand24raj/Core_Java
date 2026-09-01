package com.core_java.objectclass.FinalKeyword;

class Student 
{
    private final int rollNumber;
    private final String studentName;

    public Student(final int rollNumber, final String studentName) 
    {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    @Override
    public String toString() 
    {
        return "Roll is: " + this.rollNumber +
               " Name is: " + this.studentName;
    }
}

public class FinalVarEx1 
{
    public static void main(String[] args) 
    {
        final Student s1 = new Student(111, "Scott");
        IO.println(s1);

        // ❌ Not allowed
        // s1 = new Student(222, "Allen");
    }
}