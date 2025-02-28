package com.chiru.ds.practice.arrays.slidingwindow;

/*
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].

Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 103
0 <= target <= 109
 */

import java.util.ArrayList;

public class SubArraySumArrayRange {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        int i = 0;
        int j = 0;

        int n = arr.length;

        int prefixSum = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (j < n) {

            prefixSum += arr[j];


            while (prefixSum > target && i < j) {
                prefixSum -= arr[i];
                i++;
            }

            if (prefixSum == target) {
                result.add(i + 1);
                result.add(j + 1);

                return result;
            }

            j++;

        }

        result.add(-1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5},12));
        System.out.println(subarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},15));
        System.out.println(subarraySum(new int[]{5, 3, 4},2));
    }
}
