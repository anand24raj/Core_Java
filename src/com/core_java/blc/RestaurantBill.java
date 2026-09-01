package com.core_java.blc;

public class RestaurantBill 
{
    String dishName;
    double quantity;
    double price;
    long mobileNumber;
    double finalBill;

    // Parameterized Constructor
    public RestaurantBill(String dishName, double quantity, double price, long mobileNumber) 
    {
        this.dishName = dishName;
        this.quantity = quantity;
        this.price = quantity * price;
        this.mobileNumber = mobileNumber;
    }

    public void calculateBill()
    {
        finalBill = price + (price * 18 / 100);

        IO.println("Dish name: " + dishName);
        IO.println("Quantity: " + quantity);
        IO.println("Price excluding GST: Rs. " + price);
    }

    public void sendMessage() 
    {
        IO.println("Food prepared. Enjoy your meal");
        IO.println("Hello " + mobileNumber + " Hope you liked the food");
        IO.println("Your bill has been prepared. Kindly pay Rs. " + finalBill);
    }
}
