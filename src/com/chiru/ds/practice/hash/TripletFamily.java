package com.chiru.ds.practice.hash;

/*
Given an array arr of integers. Find whether three numbers are such that the sum of two elements equals the third element.

Example:

Input: arr[] = [1, 2, 3, 4, 5]
Output: true
Explanation: The pair (1, 2) sums to 3.
Input: arr[] = [5, 3, 4]
Output: false
Explanation: No triplets satisfy the condition.
Expected Time Complexity: O(n2)
Expected Auxilary Space: O(1)

Constraints:
1 <= arr.size() <= 103
0 <= arr[i] <= 105
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TripletFamily {

    public static boolean findTriplet(int[] arr) {

        Map<Integer, Integer> arrCount = new HashMap<>();

        //Arrays.sort(arr);

        Arrays.stream(arr).forEach(ele -> arrCount.put(ele, ele));

       int i=0, j=1;

       while(i!=arr.length-2){

           if(j==arr.length-1){
               i++;
               j= i+1;
           }
           int sum = arr[i]+arr[j];

           if(arrCount.containsKey(sum)){
               System.out.println("Indexes "+ " i "+i + "  "+ " j "+j);
                return true;
           }
           j++;
       }

       return false;
    }

    public static void main(String[] args) {

        System.out.println(findTriplet(new int[]{1, 9, 6, 3, 2 }));
        System.out.println(findTriplet(new int[]{5,3,4}));
    }
}
