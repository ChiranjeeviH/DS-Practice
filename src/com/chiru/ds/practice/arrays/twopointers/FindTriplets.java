package com.chiru.ds.practice.arrays.twopointers;

/*
Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k.

Examples:

Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
Output: 4
Explanation: Two triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
Input: arr[] = [-2, 0, 1, 1, 5], target = 1
Output: 0
Explanation: There is no triplet whose sum is equal to 1.
Constraints:
3 ≤ arr.size() ≤ 103
-105 ≤ arr[i], target ≤ 105
 */

import java.util.HashMap;
import java.util.Map;

public class FindTriplets {

    public int countTriplets(int[] arr, int target) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // Count how many times the complementary sum has been seen so far
                count += countMap.getOrDefault(target - sum, 0);
            }

            // Now update the countMap with the current element arr[i]
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(new FindTriplets().countTriplets(new int[]{-3, -1, -1, 0, 1, 2}, -2));
    }
}
