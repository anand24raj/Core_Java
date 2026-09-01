/*package com.nit.Array2;

public class LongestSubArrayWithSum {

	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4, 1, 1, 1, 2, 1};

		int target = 6;
		int lengthMax = 0;
		
		
		  for(int i=0;i<arr.length;i++)
		  {
			  int c=0;
			  int sum=0;
			  for(int j=i;j<arr.length;j++)
			  {
				   sum+=arr[j]; //1+2+3
				   c++;
				   if(target==sum)
				   {
					   if(c>lengthMax)  
					   {
						   lengthMax=c;
					   }
				   }
			  }
		  }
		System.out.println(lengthMax);
		
		IO.println();
		
//		IO.print("Sub Array of " + target + " are : ");
//		for (int i = 0; i < arr.length; i++) 
//		{
//			
//			for (int j = i; j < arr.length; j++) 
//			{
//				int sum = 0;
//				sum += arr[j];
//				
//				if(sum == target)
//				{
//					
//					IO.print(length + " ");
//					
//					if(length > lengthMax)
//					{
//						lengthMax = length;
//					}
//				}
//			}
//		}
//		IO.println("\nThe Longest length of Sum " + target +  " are : " + lengthMax);
	}

}
*/



package com.core_java.Array_new;

public class LongestSubArrayWithSum {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 1, 1, 1, 2, 1};

		int target = 6;
		int lengthMax = 0;
		int start = -1;
		int end = -1;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = i; j < arr.length; j++) {

				sum += arr[j];

				if (sum == target) {
					int length = j - i + 1;

					if (length > lengthMax) {
						lengthMax = length;
						start = i;
						end = j;
					}
				}
			}
		}

		System.out.println("Longest Length : " + lengthMax);

		System.out.print("Subarray : ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}