package com.chiru.practice.OnlineQue;

public class MaxOnesInBinarySubStrings {
	
	public int countOnes(String s, int len) {

		int strLen = s.length();
		int sLen = strLen;
		int pointer = 0;
		int strCap = strLen;
		StringBuilder ss = new StringBuilder();
		while (sLen > 0) {
			if (strCap > len) {
				ss.append(s.substring(pointer, pointer + len));
				ss.append(',');
				pointer = pointer + len;
				strCap -= len;
			} else {
				ss.append(s.substring(pointer, strLen));
				sLen = 0;
			}

		}
		String[] strArray = ss.toString().split(",");
		int max = 0;
		for (int i = 0; i < strArray.length; i++) {
			int count = 0;
			for (int j = 0; j < strArray[i].length(); j++) {
				if (strArray[i].charAt(j) == '1') {
					count += 1;
				}
			}
			if (count > max) {
				max = count;
			}
		}

		return max;

	}

	public static void main(String[] args) {

		String s = "111100100011";
		int len = 5;

		int maxOnes = new MaxOnesInBinarySubStrings().countOnes(s, len);
		System.out.println(maxOnes);

	}

}
