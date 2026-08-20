package com.nit.aggregation;

public class AggregationDemo {
    public static void main(String[] args) {

        College clg1 = new College("VIT", "Vellore");
        College clg2 = new College("NIT", "Hyderabad");

        Student s1 = new Student(1, "Scott", "Ameerpet", clg1);
        IO.println(s1);

        Student s2 = new Student(2, "Smith", "S R Nagar", clg2);
        IO.println(s2);
    }
}
