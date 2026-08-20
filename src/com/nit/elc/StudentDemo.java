package com.nit.elc;

import com.nit.blc.Student;

public class StudentDemo 
{
    void main() {

        // First student
        Student raj = new Student();
        raj.setStudentData(101, "Raj", "Ameerpet");
        String rajDetails = raj.getStudentDetails();
        IO.println(rajDetails);

        IO.println("--------------------------------------------------------------------------------");

        // Second student
        Student priya = new Student();
        priya.setStudentData(201, "Priya", "S R Nagar");
        String priyaDetails = priya.getStudentDetails();
        IO.println(priyaDetails);
    }
}
