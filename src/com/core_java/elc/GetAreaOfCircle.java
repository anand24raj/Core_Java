package com.core_java.elc;

import com.core_java.blc.Circle;
public class GetAreaOfCircle
{
	void main()
	{
		double radius = Double.parseDouble (IO.readln("Enter the value of radius: "));
		
		Circle.getAreaOfCircle (radius);
	}
}
