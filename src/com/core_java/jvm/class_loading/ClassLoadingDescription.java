package com.core_java.jvm.class_loading;

class Employee {}
class Customer {}
class Student {}

public class ClassLoadingDescription {

    void main() {
    	
        Class<?> cls = Employee.class;
        IO.println(cls.getName());

        cls = Customer.class;
        IO.println(cls.getName());

        cls = Student.class;
        IO.println(cls.getName());
    }
}
