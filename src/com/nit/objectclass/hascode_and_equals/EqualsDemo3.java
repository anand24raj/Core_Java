package com.nit.objectclass.hascode_and_equals;

class Trainer {
    private int id;
    private String name;

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Trainer t2) {
            return this.id == t2.id &&
                   this.name.equals(t2.name);
        }
        return false;
    }
}

class Manager {
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

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EqualsDemo3 {
    public static void main(String[] args) {

        Trainer t3 = new Trainer(333, "Raj");
        Manager m4 = new Manager(333, "Raj");

       IO.println(t3.equals(m4));   // false
        IO.println(t3.equals(null)); // false
    }
}
