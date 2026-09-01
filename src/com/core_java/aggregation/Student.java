package com.core_java.aggregation;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private College college; // HAS-A relation (Aggregation)

    public Student(int studentId, String studentName,
                   String studentAddress, College college) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
               ", studentName=" + studentName +
               ", studentAddress=" + studentAddress +
               ", college=" + college + "]";
    }
}
