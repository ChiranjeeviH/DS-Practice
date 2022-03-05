package com.chiru.practice.udemy.yk.course;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your solution.
		Character s = nonRepeating("aabbdbc"); // should return 'c'
		System.out.println(s);
		//nonRepeating("abab"); // should return null
		//nonRepeating("aabbbc"); // should return 'c'
		//nonRepeating("aabbdbc"); // should return 'd'
	}

	// Implement your solution below.
	public static Character nonRepeating(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + ":" + entry.getValue());
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return null;
	}

}
