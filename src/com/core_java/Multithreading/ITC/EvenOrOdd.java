package com.core_java.Multithreading.ITC;

public class EvenOrOdd 
{
	int num = 1;

	public synchronized void oddNumber() 
	{
		while (num <= 10) 
		{
			if (num % 2 == 0) 
			{
				try 
				{
					wait();
				} 
				catch (Exception e) 
				{
				
				}

			}

			if (num > 10) 
			{
				return;
			}
			System.out.println("Odd number  : = " + num);
			num++;
			notify();
		}
	}

	public synchronized void evenNumber() 
	{
		while (num <= 10) 
		{
			if (num % 2 != 0) 
			{
				try 
				{
					wait();
				} 
				catch (Exception e) 
				{
				
				}

			}

			if (num > 10) 
			{
				return;
			}
			System.out.println("Even number : = " + num);
			num++;
			notify();
		}
	}

	public static void main(String[] args) 
	{
		EvenOrOdd eo = new EvenOrOdd();
		Thread t1 = new Thread(() -> eo.oddNumber());
		Thread t2 = new Thread(() -> eo.evenNumber());
		t1.start();
		t2.start();
	}
}
