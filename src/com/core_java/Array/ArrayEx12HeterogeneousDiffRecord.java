package com.core_java.Array;

// Object array using new keyword with different record types (Heterogeneous)

record Manager(Integer id, String name) 
{
	
}

record Trainer(String name, int experience) 
{
	
}

record SalesMan(Integer id, String name, Double totalSale) 
{
	
}

public class ArrayEx12HeterogeneousDiffRecord
{
    public static void main(String[] args) 
    {
        Object arr[] = new Object[3];

        arr[0] = new Manager(111, "Scott");
        arr[1] = new Trainer("Smith", 10);
        arr[2] = new SalesMan(101, "Alen", 45000D);

        IO.println("Printing Heterogeneous Objects :");

        for (Object obj : arr) 
        {
            IO.println(obj);
        }
    }
}