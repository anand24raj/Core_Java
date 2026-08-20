package com.nit.interfaces;

public interface Printer 
{
	public abstract void print(); 
}
class PrinterDemo
{
	public Printer getPrinter()
	{
		return new Printer() 
		{
			@Override
			public void print()
			{
				IO.print("Printer is Printing something...");
			}
		};
	}
	
}
