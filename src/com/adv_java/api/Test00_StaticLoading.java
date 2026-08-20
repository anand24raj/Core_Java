package com.adv_java.api;

//Identify whether below program is static or dynamic in 
//creating different classes objects?

public class Test00_StaticLoading {
    public static void main(String[] args) {
	Object obj = new A();
	System.out.println(obj);
    }
}

//Above code is static nature because for creating object of 
//different classes, we must modify source code 
//for changing the class name A to another class name B or C, 
//then recompile and execute

//To load & instantiate diff classes dynamically at runtime
//we must use 'Scanner' and Reflection API class 'Class'
// -> Scanner/IO class is for reading class name from keyboard
// -> Reflection API is for loading and instantiating the given class