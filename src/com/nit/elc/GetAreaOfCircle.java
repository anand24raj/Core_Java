package com.nit.elc;

import com.nit.blc.Circle;
public class GetAreaOfCircle
{
	void main()
	{
		double radius = Double.parseDouble (IO.readln("Enter the value of radius: "));
		
		Circle.getAreaOfCircle (radius);
	}
}
