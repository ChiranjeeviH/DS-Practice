package com.chiru.ds.practice.hash;

/*
Given an unsorted array arr and a number k which is smaller than size of the array. Find if the array contains duplicates within k distance.

Examples:

Input: arr[] = [1, 2, 3, 4, 1, 2, 3, 4] and k = 3
Output: false
Explanation: All duplicates are more than k distance away.
Input: arr[] = [1, 2, 3, 1, 4, 5] and k = 3
Output: true
Explanation: 1 is repeated at distance 3.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ k < arr.size()
1 ≤ arr[i] ≤ 105
 */

import java.util.HashMap;
import java.util.Map;

public class KthDistanceDuplicate {

    public static boolean checkDuplicatesWithinK(int[] arr, int k) {

        Map<Integer, Integer> mapDup = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(mapDup.containsKey(arr[i])) {

                Integer value = mapDup.get(arr[i]);

                if (value != null && i - value <= k) {
                    return true;
                }
            }
            mapDup.put(arr[i],i);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkDuplicatesWithinK(new int[]{1, 2, 3, 4, 1, 2, 3, 4},3));
        System.out.println(checkDuplicatesWithinK(new int[]{1, 2, 3, 1, 4, 5},3));

        System.out.println(checkDuplicatesWithinK(new int[]{6331,18486,11245,25027,14080,17913,21550,673,3269,3020,23692,20030,9474,22042,14297,13307,6692,23530,28171,21697,7938,1029,3287,322,5138,30043,1665,28033,31965,1699,29426,15764,27056,20802,26379,20392,10645,27502,22073,26439,22657,3475,12873,7638,7631,9973,15742,15458,12013,9624,17121,25244,27222,30045,10457,7969,7872,31341,4603,23807,21142,2778,35,19061,8104,11140,11716,7419,30498,5178,4476,22146,25018,16162,16364,28669,4142,1883,8134,3360,20462,6880,9255,7528,14357,17328,296,3675,8862,19500,3760,29457,17877,704,19852,17651,523,8389,17089,8643,65
        },65));
    }
}
