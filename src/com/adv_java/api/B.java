package com.adv_java.api;

//B.java
class B {
	static int a = m1();
	static int m1(){
		System.out.println("B SV:a");
		return 10;
	}

	int x = m2();
	int m2(){
		System.out.println("B NSV:x");
		return 20;
	}

	static {
		System.out.println("B SB");
	}

	{
		System.out.println("B NSB");
	}
	
	B(){
		System.out.println("B NPC");
	}
	
	B(int x){
		System.out.println("B IPC");
		this.x = x;
	}

	public static void main(String[] args){
		System.out.println("B main");
	}

	static void m3(){
		System.out.println("B SM m3(np)");
	}

	static int m3(String s){
		System.out.println("B SM m3(String) "+ s);
		return 5;
	}
	
	void m4(){
		System.out.println("B NSM m4(np)");
	}

	String m4(float f){
		System.out.println("B NSM m4(float)");
		return "a";
	}

}