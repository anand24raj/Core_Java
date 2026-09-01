package com.core_java.Array_new;

public class NthLargestElement 
{
	public static void main(String[] args) 
	{
		int arr[] = { 11, 59, 7, 88, 88 };

		int largest = Integer.parseInt(IO.readln("nth largest element : "));
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			
			for (int j = 0; j < arr.length; j++) 
			{
				boolean bool = false;// 88 >59
				
				if (arr[j] > arr[i]) 
				{
					for (int k = 0; k < j; k++) 
					{
						if (arr[k] == arr[j]) 
						{
							bool = true;
							break;
						}
					}
					if (!bool) 
					{
						count++;
					}
				}
			}
			if (count == largest - 1) // 1==1
			{
				IO.println(arr[i] + " ");
				break;
			}
		}
	}

}
