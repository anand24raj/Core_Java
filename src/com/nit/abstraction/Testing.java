/*Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:

1. abstract class Food with the following properties:

double proteins
double fats
double carbs
double tastyScore
void getMacroNutrients [Abstract Method]

2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 

Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros) 

Input :-
1
Bread
getType
getMacros
getTaste
Output :-

Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8*/

package com.nit.abstraction;

abstract class Food {
    protected double protiens;
    protected double fats;
    protected double carbs;
    protected int tastyScore;

    abstract void getMacroNutrients();
}

class Egg extends Food {
    String type = "non-vegetarian";

    Egg(double protiens, double fats, double carbs) {
	this.protiens = protiens;
	this.fats = fats;
	this.carbs = carbs;
	this.tastyScore = 7;
    }

    void getType() {
	IO.println("Egg is " + type);
    }

    @Override
    void getMacroNutrients() {
	IO.println("An egg has " + protiens + " gms of protein, " + fats + " gms of fats and " + carbs
		+ " gms of carbohydrates.");
    }

    void getTaste() {
	IO.println("Taste: " + tastyScore);
    }
}

class Bread extends Food {
    String type = "vegetarian";

    Bread(double protiens, double fats, double carbs) {
	this.protiens = protiens;
	this.fats = fats;
	this.carbs = carbs;
	this.tastyScore = 8;
    }

    void getType() {
	IO.println("Bread is " + type);
    }

    @Override
    void getMacroNutrients() {
	IO.println("A slice of bread has " + protiens + " gms of protein, " + fats + " gms of fats and " + carbs
		+ " gms of carbohydrates.");
    }

    void getTaste() {
	IO.println("Taste: " + tastyScore);
    }
}

public class Testing {
    void main() {
	int n = Integer.parseInt(IO.readln());
	String type = IO.readln();
	String getType = IO.readln();
	String getMacros = IO.readln();
	String getTaste = IO.readln();

	if (type.equalsIgnoreCase("egg")) {
	    Egg E = new Egg(6.3, 5.0, 0.6);
	    E.getType();
	    E.getMacroNutrients();
	    E.getTaste();
	} else {
	    Bread B = new Bread(4.0, 1.1, 13.8);
	    B.getType();
	    B.getMacroNutrients();
	    B.getTaste();
	}
    }
}
