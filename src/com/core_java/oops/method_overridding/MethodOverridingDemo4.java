package com.core_java.oops.method_overridding;

class Super {
	private void m1() // This method is only available in the super class
	{
		IO.println("Super class m1()");
	}
}

class Sub extends Super {
	public void m1() // sub class own method but not an overridden method [Error]
	{
		IO.println("Sub class m1()");
	}
}

public class MethodOverridingDemo4 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.m1(); // Calls Sub class method
		
	}
}
