package com.core_java.Array_new;

public class FindMissingNumberFrom1toN {

	public static void main(String[] args) {
		int arr[] = {2, 5, 7};
		
		int n = 7;
		
		IO.print("Missing Number: ");
		
		for (int i = 1; i <= n; i++) 
		{
			boolean found = false;
			
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j] == i)
				{
					found = true;
					break;
				}
			}
            if (!found)
            {
                IO.print(i + " ");
            }
		}
	}

}
