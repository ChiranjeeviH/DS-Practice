package com.chiru.ds.practice.arrays.slidingwindow;

/*
Problem Statement
Given an array of positive numbers and a positive number 'k,' find the maximum sum of any contiguous subarray of size 'k'.

Example 1:

Input: arr = [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
Example 2:

Input: arr = [2, 3, 4, 1, 5], k=2
Output: 7
Explanation: Subarray with maximum sum is [3, 4].
 */

public class KsizeMaxSum {

    public static int maxSumSubArray(int[] arr, int k){

        if(arr.length < k){
            return 0;
        }

        int left = 0;

        int right = 0;

        int maxSum = 0;
        int currentSum = 0;

        while(right < arr.length){

            if(right < k){
                currentSum+=arr[right];
            }else{
                currentSum = (currentSum+arr[right])-arr[left];
                left++;
            }

            right++;

            maxSum = Math.max(maxSum,currentSum);

        }

        return maxSum;

    }


    public static void main(String[] args) {

        System.out.println(maxSumSubArray(new int[]{2, 1, 5, 1, 3, 2},3));
        System.out.println(maxSumSubArray(new int[]{2, 3, 4, 1, 5},2));

    }
}
