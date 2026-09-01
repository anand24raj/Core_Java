package com.core_java.functionalinterface;

import java.util.function.Function;

public class FunctionalInterfaceExample
{
	public static void main(String[] args) 
	{
		Function<String, String> fun = str -> str.substring(2,5);
		System.out.println(fun.apply("Hyderabad"));
	}
}
