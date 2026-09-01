package com.core_java.jvm.heap_stack;

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        super();
        this.setName(name);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class CustomerDemo {
    void main() {

       // int val = 100;   // primitive (not used further)

        Customer c = new Customer("Ravi", 2);
        m1(c);

        // Only 1 object (Rahul, 9) becomes eligible for GC
        System.out.println(c.getId());
    }

    public static void m1(Customer cust) {
        cust.setId(5);   // modifies original object (Ravi)

        cust = new Customer("Rahul", 7); // new object created
        cust.setId(9);

        System.out.println(cust.getId());
    }
}
