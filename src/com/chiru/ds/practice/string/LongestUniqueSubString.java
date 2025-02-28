package com.chiru.ds.practice.string;

/*
Given a string s, find the length of the longest substring with all distinct characters.

Examples:

Input: s = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest substring with all distinct characters.
Input: s = "aaa"
Output: 1
Explanation: "a" is the longest substring with all distinct characters.
Input: s = "abcdefabcbb"
Output: 6
Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
Constraints:
1<= s.size()<=3*104
All the characters are in lowercase.
 */

public class LongestUniqueSubString {

    public int longestUniqueSubstr(String s) {

        int n = s.length();
        char[] charArray = new char[26];
        char[] stringArray = s.toCharArray();
        int maxDistinctValues = 0;
        int currentMax=0;

        for(int i=0;i<n;i++){

            int currentCharInt = stringArray[i];

            if(charArray[currentCharInt-97]!=0){
                charArray = new char[26];
                maxDistinctValues=Math.max(maxDistinctValues,currentMax);
                currentMax = 0;
                charArray[currentCharInt-97]=stringArray[i];
                currentMax++;
            }else{
                charArray[currentCharInt-97]=stringArray[i];
                currentMax++;
            }

        }

        return maxDistinctValues;
    }

    public static void main(String[] args) {
        System.out.println(new LongestUniqueSubString().longestUniqueSubstr("geeksforgeeks"));
        System.out.println(new LongestUniqueSubString().longestUniqueSubstr("aaa"));
        System.out.println(new LongestUniqueSubString().longestUniqueSubstr("abcdefabcbb"));
    }
}
