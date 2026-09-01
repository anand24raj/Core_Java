/*Create a program on abstract class to display Cake details with message and without
event message.

Coding Requirements :
--------------------
Create a BLC class called Cake with following attributes :

Attributes/Properties/Fields: [Access modifier is private for all the fields]

Attribute Name : shape String
Attribute Name :flavor String
Attribute Name :quantity int
public static double price = 400;

Create a Parameterized Constructor to initialize only shape, flavor and quantity.
[Don't initialize price through Constructor, Manual Initialization]

Methods :
  1) Define setters and getters for all non static fields
  2) Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task : It must return the data as per below format/example.
     "A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0"
     
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following Attributes
Attributes: [private for all the fields]
Attribute name : message String

Constructors:(3 only)
   1) No argument Constructor : Ensure shape is Round, flavour is Vanilla,
      qty is 1 kg and price is 400. [see the output test cases]
   2) Parameterized public Constructor : For shape,flavor,quantity
   3) Parameterized public Constructor : For shape,flavor,quantity and message.
   Price is to be dynamically changed @400 per Kg.
Methods :
Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task :Print the following if message is not null 
    "A Square Pineapple Cake of 3KG is Ready with Happy Birthday message @ Rs.1200.0".
      Otherwise display the message from superclass.
      
      
Create an ELC class CakeOrderMain to display cake details with price and message.*/

package com.core_java.oops.abstraction;

import java.util.*;
abstract class Cake 
{
    protected String shape;
    protected String flavor;
    protected int quantity;
    protected static final double PRICE_PER_KG = 400.0;
    public Cake(String shape, String flavor, int quantity) 
    {
        this.shape = shape;
        this.flavor = flavor;
        this.quantity = quantity;
    }
    protected double calculatePrice() 
    {
        return PRICE_PER_KG * quantity;
    }
    
    @Override
    public String toString() 
    {
        return "A " + shape + " " + flavor +
                " Cake Of " + quantity +
                " KG is Ready @ Rs." + calculatePrice();
    }
}
class OrderedCake extends Cake 
{
    private String message;
    private boolean isDefault;  
    public OrderedCake() 
    {
        super("Round", "Vanila", 1);
        isDefault = true;
    }
    public OrderedCake(String shape, String flavor, int quantity) 
    {
        super(shape, flavor, quantity);
        isDefault = false;
    }
    public OrderedCake(String shape, String flavor, int quantity, String message) 
    {
        super(shape, flavor, quantity);
        this.message = message;
        isDefault = false;
    }
    @Override
    public String toString() 
    {
        String prefix = isDefault ? "A  " : "A ";
        if (message != null && !message.isEmpty()) 
        {
            return prefix + shape + " " + flavor +
                    " Cake Of " + quantity +
                    "KG is Ready with " + message +
                    " message @ Rs." + calculatePrice();
        }
        
        return prefix + shape + " " + flavor +
                " Cake Of " + quantity +
                " KG is Ready @ Rs." + calculatePrice();
    }
}
public class CakeOrderMain 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        while (sc.hasNext()) 
        {
            input.add(sc.next());
        }
        try 
        {
            if (input.size() == 1) 
            {
                IO.println(new OrderedCake());
            }
            else if (input.size() == 4) 
            {
                int qty = Integer.parseInt(input.get(3));
                if (qty <= 0) throw new Exception();
                IO.println(new OrderedCake(input.get(2), input.get(1), qty));
            }
            else if (input.size() >= 5) 
            {
                int qty = Integer.parseInt(input.get(3));
                if (qty <= 0) throw new Exception();
                String message = String.join(" ", input.subList(4, input.size()));
                IO.println(new OrderedCake(input.get(2), input.get(1), qty, message));
            }
            else 
            {
                throw new Exception();
            }
        } catch (Exception e) 
        {
            IO.println("Invalid input. All fields must be provided, and quantity must be > 0.");
        }
        sc.close();
    } 
}