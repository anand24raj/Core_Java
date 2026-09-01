package com.core_java.inner_class;

class Person {
    private String name;
    private int age;
    private Heart heart;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.heart = new Heart();
    }

    public void describe() {
        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("Heart beats per minute: " + heart.getBeatsPerMinute());
    }

    // Inner class
    private class Heart {
        private int beatsPerMinute = 72;

        public int getBeatsPerMinute() {
            return beatsPerMinute;
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        Person person = new Person("Virat", 30);
        person.describe();
    }
}

