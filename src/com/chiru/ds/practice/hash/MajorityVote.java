package com.chiru.ds.practice.hash;

import java.util.*;
import java.util.stream.Collectors;

/*
You are given an array of integer nums[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return -1.

Examples:

Input: nums = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
Input: nums = [1, 2, 3, 4, 5]
Output: [-1]
Explanation: no candidate occur more than n/3 times.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraint:
1 <=  nums.size()  <= 106
-109 <= nums[i] <= 109
 */
public class MajorityVote {

    // Function to find the majority elements in the array
    public static List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.

        final int size = nums.size();

        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> numMap = new HashMap<>();

        for(Integer num:nums){
            numMap.put(num,numMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> mapEntry:numMap.entrySet()){
             if(mapEntry.getValue() > size/3){
                 result.add(mapEntry.getKey());
             }
        }

        if(result.isEmpty()){
            result.add(-1);
        }

        result.sort(Comparator.reverseOrder());

        return result;

    }

    public static void main(String[] args) {

        System.out.println(findMajority(Arrays.asList(2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6)));
        System.out.println(findMajority(Arrays.asList(1,2,3,4,5)));
    }
}
