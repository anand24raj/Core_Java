/*Create a program to demonstrate runtime polymorphism using a base class Food and two subclasses VegFood and NonVegFood.

Class Details
Food (Base Class)
Method:
prepare(String itemName)
This method must be overridden by subclasses.

VegFood (Subclass)
Overrides prepare() to display:
Preparing vegetarian dish: <itemName>.
NonVegFood (Subclass)
Overrides prepare() to display:
Preparing non-vegetarian dish: <itemName>.

Task
In the main() method, use a switch–case statement to select the type of food to prepare:

Option 1 → Create a VegFood object and call
prepare("Paneer Butter Masala")

Option 2 → Create a NonVegFood object and call
prepare("Chicken Biryani")

For any other input, display:
Invalid choice!

Use a reference of type Food to demonstrate runtime polymorphism. */

package com.core_java.oops.polymorphism;

public class FoodDetail 
{
	void main()
	{
		int x = Integer.parseInt(IO.readln());

        Food F;
        switch (x)
        {
            case 1 ->
            {
                String itemName = IO.readln();
                F = new VegFood(itemName);
                F.prepare();
            }

            case 2 ->
            {
                String itemName = IO.readln();
                F = new NonVegFood(itemName);
                F.prepare();
            }

            case 3 ->
            {
                IO.println("Invalid choice!");
            }
        }
	}

}

class Food
{
	private String itemName;
    
    public Food(String itemName) 
    {
        this.itemName = itemName;
    }

    public String getItemName() 
    {
        return itemName;
    }

    public void prepare() 
    {

    }

}

class VegFood extends Food
{
	VegFood(String itemName)
    {
		super(itemName);
	
	}
    @Override
    public void prepare()
    {
        IO.println("Preparing vegetarian dish: "+getItemName()+".");
    }
}

class NonVegFood extends Food
{
	NonVegFood(String itemName)
    {
		super(itemName);
	
	}
    @Override
    public void prepare()
    {
        IO.println("Preparing non-vegetarian dish: "+getItemName()+".");
    }
}
