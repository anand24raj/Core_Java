/*Sort Colors

Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, 
respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Use Dutch National Flag Algorithm: maintain three pointers for 0,1,2 and 
swap accordingly.*/

package com.nit.Array.TwoDimensional;

public class SortColors 
{
    public static void sortColors(int[] nums) 
    {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) 
        {
            if (nums[mid] == 0) 
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } 
            else if (nums[mid] == 1) 
            {
                mid++;

            } 
            else 
            { // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) 
    {
        int n = Integer.parseInt(IO.readln("Enter size for input ( 0, 1, and 2)  : ").trim());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
        {
            nums[i] = Integer.parseInt(IO.readln("Enter the integers 0, 1, and 2 to represent the color : ").trim());
        }

        sortColors(nums);

        for (int i = 0; i < n; i++) 
        {
            IO.print(nums[i] + " ");
        }
    }
}