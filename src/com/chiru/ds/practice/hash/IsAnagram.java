package com.chiru.ds.practice.hash;

/*
Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "listen", s2 = "silent"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergic"
Output: false
Explanation: Characters in both the strings are not same, so they are not anagrams.
Input: s1 = "g", s2 = "g"
Output: true
Explanation: Character in both the strings are same, so they are anagrams.
Constraints:
1 ≤ |s1.size()|,|s2.size()| ≤ 105
 */

import java.util.Map;
import java.util.stream.Collectors;

public class IsAnagram {

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }

        Map<Character, Long> mapCount = s1.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c->c,Collectors.counting()));

        for(int i=0;i<s2.length();i++){
            char character = s2.charAt(i);
            Long value = mapCount.get(character);

            if(value!=null && value >=0){
                mapCount.put(character,value-1);

            }else{
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));
        System.out.println(isAnagram("chiru","chiru1"));
    }

}
