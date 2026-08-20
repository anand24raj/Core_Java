package com.nit.elc;

import com.nit.blc.RestaurantBill;

public class Restaurant 
{
	public static void main(String[] args) 
	{
		String dishName = IO.readln("Enter dishName : ");
		double quantity = Double.parseDouble(IO.readln("Enter quantity : "));
		double price = Double.parseDouble(IO.readln("Enter price : "));
		long mobileNumber = Long.parseLong(IO.readln("Enter mobileNumber : "));

        RestaurantBill r = new RestaurantBill(dishName, quantity, price, mobileNumber);

		r.calculateBill();
		r.sendMessage();

	}
}