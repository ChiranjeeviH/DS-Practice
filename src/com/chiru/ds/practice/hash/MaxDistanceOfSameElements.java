package com.chiru.ds.practice.hash;

/*
Given an array arr[] with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note: You may assume that every input array has repetitions.

Examples:

Input: arr = [1, 1, 2, 2, 2, 1]
Output: 5
Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max distance is 5.
Input: arr = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
Output: 10
Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
Expected Time Complexity :  O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 109
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxDistanceOfSameElements {

    public static int maxDistance(int[] arr) {
        // Code here

        Map<Integer,ArrayList<Integer>> mapOfArrays = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(mapOfArrays.containsKey(arr[i])){
                mapOfArrays.get(arr[i]).add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                mapOfArrays.put(arr[i], list);
            }
        }

        int max = 0;

        for (Map.Entry<Integer, ArrayList<Integer>> set :
                mapOfArrays.entrySet()) {

            if(set.getValue().size() >1){

                max = Math.max(max, (set.getValue().get(set.getValue().size()-1) - set.getValue().get(0)));
            }
        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}));
    }
}
