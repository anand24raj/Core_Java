/*InputAndPrintMatrix

Write a Java program to input a 2D array (3x3 matrix) from the user and display it in matrix form.
This program helps understand the basics of 2D array input and output.

Input:
- 9 integer elements representing a 3x3 matrix

Output:
- Print the matrix in 3 rows and 3 columns

Example:
Input:
1 2 3
4 5 6
7 8 9

Output:
Matrix:
1 2 3
4 5 6
7 8 9*/

package com.nit.Array.TwoDimensional;

public class MatrixDisplay 
{
    public static void main(String[] args) 
    {
        int[][] matrix = new int[3][3];

        // Input
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                matrix[i][j] = Integer.parseInt(IO.readln("Enter Inputs of matrix : ").trim());
            }
        }

        // Output
        IO.println("Matrix: ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                IO.print(matrix[i][j] + " ");
            }
            IO.println("");
        }
    }
}