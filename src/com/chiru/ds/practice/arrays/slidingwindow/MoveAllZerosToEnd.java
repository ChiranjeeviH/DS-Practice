package com.chiru.ds.practice.arrays.slidingwindow;

/*
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
 */

public class MoveAllZerosToEnd {

    public static void pushZerosToEnd(int[] arr) {
        int lastNonZeroIndex = 0;  // Pointer to track the position to place non-zero elements

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Move non-zero elements to the "lastNonZeroIndex" position
                arr[lastNonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining positions with zero
        while (lastNonZeroIndex < arr.length) {
            arr[lastNonZeroIndex++] = 0;
        }

        System.out.println(arr);
    }


    public static void main(String[] args) {

        MoveAllZerosToEnd.pushZerosToEnd(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
    }
}
