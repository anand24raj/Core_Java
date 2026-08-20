package com.nit.lambda;

//Generic BLC class
class Box<T> {
 private T data;

 public Box(T data) {
     this.data = data;
 }

 public T getData() {
     return data;
 }
}

//Student class
class Student {
 @Override
 public String toString() {
     return "Student object";
 }
}

//ELC class
public class TypeParameter {
 public static void main(String[] args) {

     Box<Integer> intType = new Box<>(15);
     IO.println("Integer Object is : " + intType.getData());

     Box<Double> doubleType = new Box<>(12.0);
     IO.println("Double Object is : " + doubleType.getData());

     Box<String> stringType = new Box<>("India");
     IO.println("String Object is : " + stringType.getData());

     Box<Student> studType = new Box<>(new Student());
     IO.println("Student object is : " + studType.getData());
 }
}

