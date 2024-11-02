package com.chiru.ds.practice.arrays;

/*
Given an unsorted array arr of size n that contains only non negative integers, find a sub-array (continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.

Examples:

Input: arr[] = [1,2,3,7,5], n = 5, s = 12
Output: 2 4
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1,2,3,4,5,6,7,8,9,10], n = 10, s = 15,
Output: 1 5
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [7,2,1], n = 3, s = 2
Output: 2 2
Explanation: The sum of elements from 2nd to 2nd position is 2.
Input: arr[] = [5,3,4], n = 3, s = 2
Output: -1
Explanation: There is no subarray with sum 2
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:

0 <= arr[i] <= 109
1 <= n <= 105
0 <= s <= 109
 */

import java.util.ArrayList;

public class IndexOfSubArraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> res = new ArrayList<>();

        int start = 0;
        int end = 0;
        int sum = 0;

        while(end < n){

            sum += arr[end];//expanding the window

            while(sum > s && start < end){//shrinking the window until it's size smaller than target
                sum -= arr[start];
                start++;
            }

            if(sum == s){
                res.add(start+1);
                res.add(end+1);
                return res;
            }

            end++;//moving forward the window

        }

        res.add(-1);
        return res;
    }


    public static void main(String[] args) {

        System.out.println(subarraySum(new int[]{1,2,3,7,5},5,12));

        System.out.println(subarraySum(new int[]{1,2,3,4,5,6,7,8,9,10},10,15));

        System.out.println(subarraySum(new int[]{5,3,4},3,2));

        System.out.println(subarraySum(new int[]{7,2,1},3,2));

        System.out.println(subarraySum(new int[]{1,0},2,0));
    }
}
