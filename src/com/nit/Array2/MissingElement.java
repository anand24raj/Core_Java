package com.nit.Array2;

public class MissingElement {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,5};
		
		int num = 5;
		
		int actulSum = num * (num + 1) / 2;
		
		 int expSum = 0;
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 expSum += arr[i];
		 }
		 
		 IO.println("Missing Element : " + (actulSum - expSum));
	}

}
