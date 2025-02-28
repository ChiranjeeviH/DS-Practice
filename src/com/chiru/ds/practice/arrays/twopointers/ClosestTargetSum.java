package com.chiru.ds.practice.arrays.twopointers;

/*
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target.
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
Constraints:
1 <= arr.size() <= 2*105
0 <= target<= 2*105
0 <= arr[i] <= 105
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestTargetSum {

    public List<Integer> sumClosest(int[] arr, int target) {

        if (arr.length < 2) return new ArrayList<>();

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        int i = 0;
        int j = arr.length - 1;
        List<Integer> result = new ArrayList<>();

        while (i < j) {

            int sum = arr[i] + arr[j];

            int diff = Math.abs(target - sum);

            if (diff < minDiff) {
                minDiff = diff;
                result = List.of(arr[i], arr[j]);
            } else if (diff == minDiff && Math.abs(arr[j] - arr[i]) > (result.get(1) - result.get(0))) {
                result = List.of(arr[i], arr[j]);
            }

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                break;
            }

        }

        return result;
    }

    public static void main(String[] args) {

        Long timeInSec = System.nanoTime();

        System.out.println(new ClosestTargetSum().sumClosest(new int[]{10, 30, 20, 5}, 25));

        Long timeInSecAfter = System.nanoTime();

        System.out.println(timeInSecAfter-timeInSec);
    }
}
