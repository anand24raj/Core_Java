package com.adv_java.api;

import java.lang.reflect.InvocationTargetException;

//Below program shows read, load, instantiating
//user defined and predefined classes dynamically
//by reading class name from keyboard 
//by using Java 25v class IO

public class Test01DynamicLoading {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
	    IllegalAccessException, InvocationTargetException, NoSuchMethodException {

	// reading class from keyboard
	String clsName = IO.readln("Enter classname: ");

	// loading the given class dynamically
	Class<?> cls = Class.forName(clsName);
	System.out.println("class " + clsName + " is loaded");

	// creating new object from the loaded class
	Object obj = cls.getDeclaredConstructor().newInstance();
	System.out.println("class " + clsName + " is instantiated");

	// printing object reference
	System.out.println("obj: " + obj);

    }
}

/*
 * >javac Test01_DynamicLoading.java >java Test01_DynamicLoading Enter
 * classname: A O/P
 * 
 * 
 * >java Test01_DynamicLoading Enter classname: B O/P
 * 
 * >java Test01_DynamicLoading Enter classname: C O/P
 * 
 * >java Test01_DynamicLoading Enter classname: java.lang.String O/P
 * 
 * TestCases : 1. Remove A.class and execute this program O/P: Exception
 * java.lang.ClassNotFoundException
 * 
 * 2. In class A, comment NPC, save it compile it, then run this program O/P:
 * class is loaded, after loading the class newInstance() method throws
 * Exception InstantiateException newInstance() creates object by calling NPC
 * 
 * 3. In class A, uncomment NPC, declare it as private, save class A compile it,
 * then run this program O/P: newInstance() method throws Exception
 * IllegalAccessException
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
