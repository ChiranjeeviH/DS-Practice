package com.chiru.practice.OnlineQue;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
	
	static boolean isTwoStringsAnagram(String s, String s1) {
		
		Map<Character,Integer> sMap = new HashMap<>();
		
		
		for(char c:s.toCharArray()) {
			
			if(!sMap.containsKey(c)) {
				sMap.put(c, 1);
			}else {
				sMap.put(c, sMap.get(c)+1);
			}
		}
		
		for(char c:s1.toCharArray()) {
			if(sMap.containsKey(c)) {
				sMap.put(c, sMap.get(c)-1);
			}
		}
		
		return !sMap.entrySet().stream().anyMatch(e -> e.getValue()>0);
		
		
		//return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isTwoStringsAnagram("Hello", "loeHl"));

	}

}
