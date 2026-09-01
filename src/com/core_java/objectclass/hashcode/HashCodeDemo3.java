package com.core_java.objectclass.hashcode;

class Student {
    private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

public class HashCodeDemo3 {
    public static void main(String[] args) {

        Student s1 = new Student(111, "Alex");
        Student s2 = new Student(222, "Allen");

        IO.println(s1.hashCode());
        IO.println(s2.hashCode());
    }
}