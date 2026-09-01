package com.core_java.Array_new;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		int arr[]= {11,59,7,88,88};
		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			boolean duplicate = false;
//			
//			for (int j = i + 1; j < arr.length; j++) 
//			{
//				if(arr[i]==arr[j]) 
//				{
//					duplicate = true;
//					break;
//				}
//			}
//			if(!duplicate) 
//			{
//				IO.print(arr[i] + " ");
//			}
//		}
		
		for(int i=0;i<arr.length;i++)
        {
            if(i==0 || arr[i]!=arr[i-1])
            {
                IO.print(arr[i]+" ");
            }
        }
	}
}
