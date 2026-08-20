/*Develop a scenario based program by using abstract class and abstract method for displaying different kinds of Products like Digital Product and 
Physical Product as well as discount and tax applicable on thses products

We need to develop one program on Hierarchical Inheritance, where Product is the super class and It has two sub classes DigitalProduct and PhysicalProduct.

Validate all the user inputs in constructor and where it is required.

Coding Requirements :
---------------------
Create one BLC class called Product.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------
name : String
price : double 
category : String

Take a parameterized constructor to initialize all the fields.

Methods :

a) Method Name : applyDiscount()
Argument : One argument of type double [double percentage]
Return Type : void
Access modifier : public and abstract


b) Method Name : calculateTax()
Argument : No Argument
Return Type : double
Access modifier : public and abstract


c) Setter and getter for price variable.

d) Generate toString() method to print Object properties. 


Create another class DigitalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
licenseKey : String

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
In this method find out the discount based on the given percentage on the product price.
Update the new price based on the given discount.
Print both Discount and Updated Price.


b)Override calculateTax() method 
In this method you should return 5% tax on the discounted price.

c) Generate toString() to print all the fields


Create another class PhysicalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
shippingWeight : double

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
In this method find out the discount based on the given percentage on the product price.
Update the new price based on the given discount.
Print both Discount and Updated Price.


b)Override calculateTax() method 
In this method you should return 8% tax on the discounted price.

c)
Method Name : calculateShippingCost()
Argument : No argument
Return Type : double
Access modifier : public 

In this method you need to calculate and return shipping cost of the Physical Product. The defined shipping cost is 5 RS per KG.

d) Generate toString() to print all the fields

Create an ELC class called ProductStore.

Inside main method display the following details as a Menu.
Select Product Type:
1. Digital Product
2. Physical Product

Write Switch case with Scanner class to select Digital OR Physical Product
Examples
Example 1:

Input

1 
Java E Book 
1499.89 
Electronics 
E_BUK_0001
Output

Digital Product: 
Product Name: Java E Book 
Category: Electronics 
Price RS:1499.89 
License Key: E_BUK_0001 
Discount applied :149.989 
New Price :1349.901 
Tax RS :67.49505
Example 2:

Input

2 
Laptop 
112000 
Electronics 
2.9
Output

Physical Product: 
Product Name: Laptop 
Category: Electronics 
Price RS:112000.0 
Shipping Weight: 2.9 kg 
Discount applied :16800.0 
New Price :95200.0 
Tax RS :7616.0 
Shipping Cost RS :14.5*/

package com.nit.abstraction;

//ELC Class
public class ProductStore {
 void main() {
     try {
         int x = Integer.parseInt(IO.readln().trim());

         switch (x) {
             case 1 -> { // Digital Product
                 String name = IO.readln().trim();
                 double price = Double.parseDouble(IO.readln().trim());
                 String category = IO.readln().trim();
                 String licenseKey = IO.readln().trim();
                 double discount = Double.parseDouble(IO.readln().trim());

                 if (name.isEmpty() || category.isEmpty() || licenseKey.isEmpty() || price < 0 || discount < 0) {
                     IO.println("Error Invalid Input.");
                     return;
                 }

                 DigitalProduct dp = new DigitalProduct(name, price, category, licenseKey);

                 IO.println("Digital Product: ");
                 IO.println("Product Name: " + name);
                 IO.println("Category: " + category);
                 IO.println("Price RS:" + price);
                 IO.println("License Key: " + licenseKey);

                 dp.applyDiscount(discount);
                 IO.println("Tax RS :" + dp.calculateTax());
             }

             case 2 -> { // Physical Product
                 String name = IO.readln().trim();
                 double price = Double.parseDouble(IO.readln().trim());
                 String category = IO.readln().trim();
                 double shippingWeight = Double.parseDouble(IO.readln().trim());
                 double discount = Double.parseDouble(IO.readln().trim());

                 if (name.isEmpty() || category.isEmpty() || price < 0 || shippingWeight < 0 || discount < 0) {
                     IO.println("Error Invalid Input.");
                     return;
                 }

                 PhysicalProduct pp = new PhysicalProduct(name, price, category, shippingWeight);

                 IO.println("Physical Product: ");
                 IO.println("Product Name: " + name);
                 IO.println("Category: " + category);
                 IO.println("Price RS:" + price);
                 IO.println("Shipping Weight: " + shippingWeight + " kg");

                 pp.applyDiscount(discount);
                 IO.println("Tax RS :" + pp.calculateTax());
                 IO.println("Shipping Cost RS :" + pp.calculateShippingCost());
             }

             default -> IO.println("Invalid choice!");
         }
     } catch (Exception e) {
         IO.println("Error Invalid Input.");
     }
 }
}

//Abstract Product class
abstract class Product {
 private String name;
 private String category;
 private double price;

 public Product(String name, double price, String category) {
     if (name == null || name.isEmpty() || category == null || category.isEmpty() || price < 0)
         throw new IllegalArgumentException("Invalid Input.");
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public abstract void applyDiscount(double percentage);
 public abstract double calculateTax();

 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }

 public String getName() { return name; }
 public String getCategory() { return category; }

 @Override
 public String toString() {
     return "Product Name: " + name + "\nCategory: " + category + "\nPrice RS:" + price;
 }
}

//Digital Product class
class DigitalProduct extends Product {
 private String licenseKey;

 public DigitalProduct(String name, double price, String category, String licenseKey) {
     super(name, price, category);
     if (licenseKey == null || licenseKey.isEmpty())
         throw new IllegalArgumentException("Invalid Input.");
     this.licenseKey = licenseKey;
 }

 @Override
 public void applyDiscount(double percentage) {
     double discountAmount = getPrice() * percentage / 100;
     double newPrice = getPrice() - discountAmount;
     setPrice(newPrice);
     IO.println("Discount applied :" + discountAmount);
     IO.println("New Price :" + newPrice);
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.05;
 }

 @Override
 public String toString() {
     return super.toString() + "\nLicense Key: " + licenseKey;
 }
}

//Physical Product class
class PhysicalProduct extends Product {
 private double shippingWeight;

 public PhysicalProduct(String name, double price, String category, double shippingWeight) {
     super(name, price, category);
     if (shippingWeight < 0) throw new IllegalArgumentException("Invalid Input.");
     this.shippingWeight = shippingWeight;
 }

 @Override
 public void applyDiscount(double percentage) {
     double discountAmount = getPrice() * percentage / 100;
     double newPrice = getPrice() - discountAmount;
     setPrice(newPrice);
     IO.println("Discount applied :" + discountAmount);
     IO.println("New Price :" + newPrice);
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.08;
 }

 public double calculateShippingCost() {
     return shippingWeight * 5;
 }

 @Override
 public String toString() {
     return super.toString() + "\nShipping Weight: " + shippingWeight + " kg";
 }
}



