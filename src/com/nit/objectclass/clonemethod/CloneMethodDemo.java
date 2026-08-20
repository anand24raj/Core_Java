package com.nit.objectclass.clonemethod;

class Customer implements Cloneable
{
	private int id;
	private String name;
	
	public Customer(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}

public class CloneMethodDemo
{
	 void main() 
	 {
		 try 
		 {
			 Customer C = new Customer(111, "Anand");
			 
			 Customer C1 = (Customer) C.clone();
			 IO.println(C);
			 IO.println(C1);
			 
			 IO.println("Modifying first Object : ");
			 C1.setId(222);
			 C1.setName("Ravi");
			 
			 IO.println(C);
			 IO.println(C1);			
		 }
		 catch (CloneNotSupportedException e) 
		 {
			 e.printStackTrace();
		 }

	 }
}
