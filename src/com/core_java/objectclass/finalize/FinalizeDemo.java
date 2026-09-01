package com.core_java.objectclass.finalize;

record Product(Integer id, String name) 
{
	@Override
	public void finalize()
	{
		IO.println("Product Object is eligible for Garbage Collector.");
	}
}

public class FinalizeDemo
{
	public static void main(String[] args) 
	{
		Product P = new Product(111, "Laptop");
		IO.println(P);
		
		P = null;
		
		System.gc();
		
		try 
		{
			Thread.sleep(2000);
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		IO.print(P);
	}
}
