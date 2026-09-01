package com.core_java.functionalinterface.predicate;

import java.util.function.Predicate;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.setId(id);
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class PredicateDemo4 {
    public static void main(String[] args) {

        // Marks > 65 → Pass
        Predicate<Student> p4 = std -> std.getMarks() > 65;

        Student[] students = new Student[5];
        students[0] = new Student(1, "Scott", 60);
        students[1] = new Student(2, "Smith", 72);
        students[2] = new Student(3, "John", 75);
        students[3] = new Student(4, "Alen", 68);
        students[4] = new Student(5, "Raj", 62);

        for (Student student : students) {
            if (p4.test(student)) {
                IO.println(student.getName() + " is Pass");
            } else {
                IO.println(student.getName() + " is Fail");
            }
        }
    }
}
