package com.nit.blc;

public class Student {
    int rollNumber;
    String studentName;
    String studentAddress;
    static String collegeName = "NIT";
    static String courseName = "Java";

    // Setter method
    public void setStudentData(int roll, String name, String address) 
    {
        rollNumber = roll;
        studentName = name;
        studentAddress = address;
    }

    // Method to get student details
    public String getStudentDetails() 
    {
        return "[Roll Number is: " + rollNumber
               + ", Student Name is: " + studentName
               + ", Student Address is: " + studentAddress
               + ", College Name is: " + collegeName
               + ", Course Name is: " + courseName + "]";
    }
}
