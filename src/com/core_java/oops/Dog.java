package com.core_java.oops;

public class Dog {

    private String name;
    private int age;
    private double height;
    private String color;

    public Dog(String name, int age, double height, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age +
               ", height=" + height + ", color=" + color + "]";
    }
}
