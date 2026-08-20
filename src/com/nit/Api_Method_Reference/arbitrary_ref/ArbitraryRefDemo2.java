package com.nit.Api_Method_Reference.arbitrary_ref;

//Functional Interface
@FunctionalInterface
interface MyFunction<T, U, V, R>
{
	R myApply(T t, U u, V v);
}

//Normal class
class Addition 
{
	public Integer doSum(String x, String y) 
	{
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
}

public class ArbitraryRefDemo2 
{
	public static void main(String[] args) 
	{
		// Using Lambda Expression
		MyFunction<Addition, String, String, Integer> fnLambda =
             (additionObject, value1, value2) ->additionObject.doSum(value1, value2);
             IO.println("Using Lambda: " + fnLambda.myApply(new Addition(), "100", "200"));

     // Using Method Reference
          MyFunction<Addition, String, String, Integer> fnMethodRef =Addition::doSum;
          IO.println("Using Method Reference: " + fnMethodRef.myApply(new Addition(), "100", "200"));
	 }
}
