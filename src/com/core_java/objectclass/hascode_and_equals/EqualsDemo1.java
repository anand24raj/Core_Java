package com.core_java.objectclass.hascode_and_equals;

class Customer1 {
    private int id;
    private String name;

    public Customer1(int id, String name) {
        super();
        this.setId(id);
        this.setName(name);
    }

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
}

public class EqualsDemo1 {
    public static void main(String[] args) {

        Customer c1 = new Customer(111, "John");
        Customer c2 = new Customer(121, "John");

        IO.println(c1 == c2);        // false (reference)
        IO.println(c1.equals(c2));  // false (Object.equals)
    }
}