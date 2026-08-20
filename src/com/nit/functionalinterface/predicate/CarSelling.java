/*Develop a scenario based program by using Functional interface to check whether a Car is eligible for sale or not.

Input:
Enter the brand name of the Car :Naxon
Enter the price of the Car :450000
Enter the mileage of the Car :22

Output:
Naxon is eligible for sale
Explanation:
Create one blc called Car. 
Components : brand : String 
price : Double 
mileage : Integer 
Take an ELC class CarSelling with main method. 
Using IO class data input, 
Create the object for Car class. 
In the ELC class write a Predicate<T> to verify whether Car is eligible for sale or not based on the following criteria. 
a) Car price should be less or equal to 5 lac. 
b) Car mileage must be greater or equal than 20.*/


package com.nit.functionalinterface.predicate;

import java.util.function.Predicate;

class Car
{
    String brand;
    double price;
    int mileage; 

    public Car(String brand, double price, int mileage)
    {
        this.brand = brand;
        this.price = price;
        this.mileage = mileage;
    }
} 
 
public class CarSelling
{
    void main()
        {
            String brand = IO.readln("Enter Car Brand Name : ");
            double price = Double.parseDouble(IO.readln("Enter Car Price : "));
            int mileage = Integer.parseInt(IO.readln("Enter Car Mileage : "));
            
         // Creating Car object
            Car car = new Car(brand, price, mileage);

            // Predicate to check eligibility
            Predicate<Car> isEligibleForSale =
                    c -> c.price <= 500000 && c.mileage >= 20;

            // Checking condition
            if (isEligibleForSale.test(car)) {
                IO.println(car.brand + " is eligible for sale");
            } else {
                IO.println(car.brand + " is not eligible for sale");
            }
            
        }
    
}

