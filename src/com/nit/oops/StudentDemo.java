package com.nit.oops;
//ELC

public class StudentDemo {

   void main() {

        Student raj = new Student();
        raj.studentName = "Raj Gourav";
        raj.rollNumber = 101;
        raj.studentHeight = 5.9;

        raj.talk();
        raj.writeExam();

        IO.println("................");

        Student priya = new Student();
        priya.studentName = "Priya";
        priya.rollNumber = 201;
        priya.studentHeight = 5.7;

        priya.talk();
        priya.writeExam();
    }
}
