/* Longest Consecutive Sequence

Given an unsorted array of integers nums, 
return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Example 3:
Input: nums = [1,0,1,2]
Output: 3

Track consecutive sequences by checking for the start of a sequence and count length.*/

package com.core_java.Array.TwoDimensional;

import java.util.HashSet;


public class LongestConsecutiveSequence 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(IO.readln("Enter the size of element : "));

        if (n <= 0) 
        {
            IO.println(0);
            return;
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
        {
            nums[i] = Integer.parseInt(IO.readln("Enter the  elements : "));
        }

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : nums) 
        {
            set.add(num);
        }

        int longestLength = 0;

        for (int num : set) 
        {

            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) 
            {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) 
                {
                    currentNum++;
                    currentLength++;
                }

                longestLength = Math.max(longestLength, currentLength);
            }
        }

        IO.println(longestLength);
    }
}
