package com.nit.objectclass.FinalKeyword;

final class Test 
{
    private int data;

    public Test(int data) 
    {
        this.setData(data);
        IO.println("Data value is: " + data);
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

public class FinalClassEx1 
{
    public static void main(String[] args) 
    {
        Test t1 = new Test(200);
    }
}