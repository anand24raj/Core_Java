/*Create a program to demonstrate runtime polymorphism using a base class Machine and two subclasses:

Machine (Base Class)
Method operate(String documentName) to be overridden by subclasses.

Printer (Subclass)
Overrides operate(String documentName) to print that the printer is printing documents.

Scanner (Subclass)

Overrides operate(String documentName) to print that the scanner is scanning documents.

The program should choose the machine's operation based on the type of machine selected.
In the main method, use a switch–case statement to allow the user to select the type of machine:
Option 1 -> Printer and call operate(String documentName)
Option 2 -> Scanner and call operate(String documentName)
For any other input display Invalid machine type!
Use a reference of type Machine to demonstrate runtime polymorphism.

Accept the document name as input from the user.**/

package com.nit.polymorphism;

public class MachineDetail
{
	void main()
	{		
		int x = Integer.parseInt(IO.readln());

		Machine  M;
    switch (x)
    {
        case 1 ->
        {
            String documentName = IO.readln();
            M = new Printer(documentName);
            M.operate();
        }

        case 2 ->
        {
            String documentName = IO.readln();
            M = new Scanner(documentName);
            M.operate();
        }

        case 3 ->
        {
            IO.println("Invalid machine type!");
        }
    }
}

}

class Machine 
{
    private String documentName;

	public Machine(String documentName) 
	{
		this.documentName = documentName;
	}

	public void prepare() 
    { 
		
	}

	public String getDocumentName() 
	{
		return documentName;
	}
    public void operate() 
    {

    }

}

class Printer extends Machine
{
	Printer(String documentName)
    {
		super(documentName);
	
	}
    @Override
    public void operate()
    {
        IO.println("Printer is printing the document: "+getDocumentName());
    }
}


class Scanner extends Machine
{
	Scanner(String documentName)
    {
		super(documentName);
	
	}
    @Override
    public void operate()
    {
        IO.println("Scanner is scanning the document: "+getDocumentName());
    }
}
