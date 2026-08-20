package com.nit.numbers;

public class ArmstrongNo {

    public static void main(String[] args) {

    	int number = Integer.parseInt(IO.readln("Enter number: "));
    	int temp = number;
    	int sum = 0;
    	int digits = 0;
    	int d = 0;

    	// count digits
    	int t = number;
    	while (t != 0) {
    	    digits++;
    	    t /= 10;
    	   
    	}

    	// armstrong logic
    	while (number != 0) {
    	    d = number % 10;
    	    sum += Math.pow(d, digits);
    	    number /= 10;
    	}
    	
    	IO.println("Numbers of digits are : " + digits);

    	if (sum == temp)
    	{
    	    IO.println(temp +" is Armstrong Number");
    	}
    	else
    	{ 
    		IO.println(temp +" is Not Armstrong");
    	}
    }
}
