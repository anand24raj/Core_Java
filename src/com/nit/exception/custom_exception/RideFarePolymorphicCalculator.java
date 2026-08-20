/*RideFarePolymorphicCalculator

A cab system calculates fares for multiple rides (array of distances).
 Create checked FareCalculationException. 
 Interface FareService with double calculate(double[] km). 
 Classes CityFare and OutstationFare. 
 Upcast to interface based on choice. 
 Chain: app() → compute() → finalizeFare(). 
 Throw in finalizeFare() if any distance < 0.
*/

package com.nit.exception.custom_exception;

//Step 1: Checked Exception
class FareCalculationException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public FareCalculationException(String message) 
	{
		super(message);
	}
}

//Step 2: Interface
interface FareService 
{
	double calculate(double[] km) throws FareCalculationException;
}

//Step 3: City Fare
class CityFare implements FareService 
{
	public double calculate(double[] km) throws FareCalculationException 
	{
		return finalizeFare(km);
	}

	private double finalizeFare(double[] km) throws FareCalculationException 
	{
		double total = 0;
		for (double distance : km) 
		{
			if (distance < 0) 
			{
				throw new FareCalculationException("Error: Invalid distance");
			}
			total += distance * 10;
		}
		return total;
 	}
}

//Step 4: Outstation Fare
class OutstationFare implements FareService 
{
	public double calculate(double[] km) throws FareCalculationException 
	{
		return finalizeFare(km);
	}

	private double finalizeFare(double[] km) throws FareCalculationException 
	{
		double total = 0;
		for (double distance : km) 
		{
			if (distance < 0) 
			{
				throw new FareCalculationException("Error: Invalid distance");
			}
			total += distance * 15;
		}
		return total;
	}
}

//Step 5: Main Class
public class RideFarePolymorphicCalculator 
{

	public static void app() 
	{
		try 
		{
			compute();
		} 
		catch (FareCalculationException e) 
		{
			IO.println(e.getMessage());
		}
	}

	public static void compute() throws FareCalculationException 
	{
		int choice = Integer.parseInt(IO.readln("Enter the choice : "));
		int n = Integer.parseInt(IO.readln("Enter the number of rides : "));

		double[] distances = new double[n];

		for (int i = 0; i < n; i++) 
		{
			distances[i] = Double.parseDouble(IO.readln("Enter the Distance : "));
		}

		FareService service;

		if (choice == 1) 
		{
			service = new CityFare();
		} 
		else 
		{
			service = new OutstationFare();
		}

		service.calculate(distances);

		IO.println("Total Fare Calculated");
	}

 	public static void main(String[] args) 
 	{
 		app();
 	}
}
