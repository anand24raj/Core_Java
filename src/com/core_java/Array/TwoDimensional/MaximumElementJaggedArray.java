/*MaximumElementJaggedArray

Find and print the maximum element in a jagged array.

[[1], [2,3], [4,5,6]] ->6
[[10], [20,30], [40,50,60]] ->60
Examples


Input Enter number of rows: 
3 
Enter number of elements in row 1: 
1 
Enter elements: 
1 
Enter number of elements in row 2: 
2 
Enter elements: 
2 3 
Enter number of elements in row 3: 
3 
Enter elements: 
4 5 6

Output  Maximum element = 6


Iterate each element; compare to find maximum*/

package com.core_java.Array.TwoDimensional;

public class MaximumElementJaggedArray 
{
    public static void main(String[] args) 
    {
        int rows = Integer.parseInt(IO.readln("Enter number of rows : "));

        // ✅ Check for invalid input
        if (rows <= 0) 
        {
            IO.println("Invalid input");
            return;
        }

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) 
        {
            int cols = Integer.parseInt(IO.readln("Enter number of columns : "));
            jaggedArray[i] = new int[cols];

            for (int j = 0; j < cols; j++) 
            {
                jaggedArray[i][j] = Integer.parseInt(IO.readln("Enter elements : "));
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < jaggedArray.length; i++) 
        {
            for (int j = 0; j < jaggedArray[i].length; j++) 
            {
                if (jaggedArray[i][j] > max) 
                {
                    max = jaggedArray[i][j];
                }
            }
        }

        IO.println("Maximum element = " + max);
    }
}
