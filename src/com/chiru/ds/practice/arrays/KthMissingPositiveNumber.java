package com.chiru.ds.practice.arrays;

public class KthMissingPositiveNumber {

    public static int kthMissing(int[] arr, int k) {

        int i = 1, j = 0, missing = 0;

        // Loop until we find the kth missing number
        while (j < arr.length) {
            // Check if current number i is missing (i.e., not in arr[j])
            if (arr[j] != i) {
                missing++;
                if (missing == k) {
                    return i;
                }
            } else {
                j++;
            }
            i++;
        }

        // If there are still missing numbers after the array is exhausted
        return arr[arr.length - 1] + (k - missing);
    }

    public static void main(String[] args) {

        System.out.println(KthMissingPositiveNumber.kthMissing(new int[]{2,3,5,6},2));

    }
}
