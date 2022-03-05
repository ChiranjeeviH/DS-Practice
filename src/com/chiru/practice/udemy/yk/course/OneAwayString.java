package com.chiru.practice.udemy.yk.course;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class OneAwayString {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        //isOneAway("abcde", "abcd");  // should return true
//        isOneAway("abde", "abcde");  // should return true
//        isOneAway("a", "a");  // should return true
//        isOneAway("abcdef", "abqdef");  // should return true
//        isOneAway("abcdef", "abccef");  // should return true
//        isOneAway("abcdef", "abcde");  // should return true
//        isOneAway("aaa", "abc");  // should return false
//        isOneAway("abcde", "abc");  // should return false
//        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        
        List<Character> l1 = new CopyOnWriteArrayList<>();
        List<Character> l2 = new CopyOnWriteArrayList<>();
        for(int i=0;i<s1.length();i++){
            l1.add(s1.charAt(i));
        }
         for(int i=0;i<s2.length();i++){
            l2.add(s2.charAt(i));
        }
        
        for(Character c:s1.toCharArray()){
            for(Character c1:s2.toCharArray()){
                if(c.equals(c1)){
                    l1.remove(c);
                    l2.remove(c);
                    break;
                }
            }
        }
        
        if((l1.size()==0 || l1.size()==1) && (l2.size()==0 || l2.size()==1)){
            return true;
        }
        
        
        return false;
    }
}

