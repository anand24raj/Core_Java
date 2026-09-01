package com.core_java.oops.pass_by_value;

public class PassByValueDemo4 {

    void main() {

        Student raj = new Student();
        IO.println("Raj marks is: " + raj.getMarks()); // 85

        accept(raj);

        IO.println("Raj marks is: " + raj.getMarks()); // 85
    }

    // This method creates a new object. Original is not affected
    static void accept(Student s1) {
        s1 = new Student(); // new object
        s1.setMarks(95);    // modifies only the new object
    }
}

// Student class
class Student {

    private double marks = 85;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
