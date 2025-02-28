package com.chiru.ds.practice.arrays.twopointers;

/*
Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle.

A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.

Examples:

Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.
Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
Output: 6
Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]
Input: arr[] = [1, 2, 3]
Output: 0
Explanation: No triangles are possible.
 */

import java.util.Arrays;

public class FindPossibleTriangles {

    static int countTriangles(int arr[]) {

        Arrays.sort(arr);  // Sort the array
        int n = arr.length;
        int count = 0;

        // Iterate over the array, fixing the largest side (arr[k])
        for (int k = 2; k < n; k++) {
            int i = 0;
            int j = k - 1;

            // Use two pointers to find pairs (arr[i], arr[j]) such that arr[i] + arr[j] > arr[k]
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i); // All pairs (i, i+1, ..., j-1) form valid triangles with arr[k]
                    j--;  // Move the right pointer to find other valid pairs
                } else {
                    i++;  // Move the left pointer to try and form a valid pair
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println(countTriangles(new int[]{4,6,3,7}));

        System.out.println(countTriangles(new int[]{10, 21, 22, 100, 101, 200, 300}));

        System.out.println(countTriangles(new int[]{1, 2, 3}));

        System.out.println(countTriangles(new int[]{28, 4, 33, 38, 0, 45}));

        System.out.println(countTriangles(new int[]{9,22,15,33,34,47,7,42,10}));
    }
}
