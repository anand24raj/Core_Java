/*Q1) WAP to modify the value of an array.[Change Array Element] */

package com.core_java.Array.PrimitiveType;

import java.util.Arrays;
import java.util.Scanner;

public class ValueModify
{
	void main()
	{
		Scanner sc = new Scanner(System.in);
		 
		  int size=Integer.parseInt(IO.readln("Enter the size of array ..."));
		  int a[]=new int[size];
		  
		  for(int i=0;i<size;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  
		  System.out.println("Before Modify ");
		  System.out.println(Arrays.toString(a));
		  int modifyVal=Integer.parseInt(IO.readln("Enter the mod ele ..."));
		  // 
		  int t=a[0];
		  for(int i=0;i<size;i++)
		  {
			
				  a[size/2]=modifyVal;
			  
		  }
		  System.out.println("After modification our array are ...");
		  System.out.println(Arrays.toString(a));
		  sc.close();
	}

}
