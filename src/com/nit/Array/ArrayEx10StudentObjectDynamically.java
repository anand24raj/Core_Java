package com.nit.Array;

import java.util.Arrays;

// WAP to create Student array Object dynamically using user input

record Student2(Integer id, String name) 
{
	
}

public class ArrayEx10StudentObjectDynamically 
{
    public static void main(String[] args) 
    {
        int size = Integer.parseInt(IO.readln("Enter the size of the Student : "));

        Student2 students[] = new Student2[size];

        // Initialize student array dynamically
        for (int i = 0; i < size; i++) 
        {
            int id = Integer.parseInt(IO.readln("Enter student Id : "));
            String name = IO.readln("Enter student Name : ");

            students[i] = new Student2(id, name);
        }

        IO.println("Printing the Student Objects :");
        IO.println(Arrays.toString(students));
    }
}