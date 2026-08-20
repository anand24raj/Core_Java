package com.nit.oops;
//BLC

public class Student {

    // Non-static fields (Object properties)
    int rollNumber;
    String studentName;
    double studentHeight;

    // Object behavior
    public void talk() {
        IO.println("Hello Everyone, My name is: " + studentName);
        IO.println("My roll number is: " + rollNumber);
        IO.println("And my height is: " + studentHeight);
    }

    public void writeExam() {
        System.out.println("Every Saturday, I need to write exam.");
    }
}

