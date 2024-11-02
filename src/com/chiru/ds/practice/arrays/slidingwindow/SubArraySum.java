package com.chiru.ds.practice.arrays.slidingwindow;

/*
Given an unsorted array of integers arr[], and a target tar, determine the number of subarrays whose elements sum up to the target value.

Examples:

Input: arr[] = [10, 2, -2, -20, 10] , tar = -10
Output: 3
Explanation: Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10].
Input: arr[] = [1, 4, 20, 3, 10, 5] , tar = 33
Output: 1
Explanation: Subarray with sum 33 is: [20,3,10].
Expected Time Complexity: O(n)
Expected Auxilary Space: O(n)

Constraints:
1 <= arr.size() <= 106
-105 <= arr[i] <= 105
-105 <= tar <= 105
 */

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static int subArraySum(int[] arr, int target){

        Map<Integer, Integer> mapCount = new HashMap<>();
        int count = 0;

        for(int i=0;i<arr.length;i++){

            if(target - mapCount.get(arr[i]) ==0){
                count++;
            }else{
                mapCount.put(arr[i],arr[i]);
            }
        }

        return 1;
    }


    public static void main(String[] args) {

    }
}
