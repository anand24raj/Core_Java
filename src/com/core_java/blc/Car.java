package com.core_java.blc;


public class Car {

    String name;
    int model;
    String color;

    public void setCarInformation() 
    	{
    	name = IO.readln("Enter Car Name:");
    	model = Integer.parseInt(IO.readln("Enter Car Model :"));
    	color = IO.readln("Enter Car Color :");
    	}


    public void getCarInformation() {
        IO.println("Car Name is: " + name);
        IO.println("Car Model is: " + model);
        IO.println("Car Color is: " + color);
    }
}
