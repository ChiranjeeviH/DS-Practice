package com.chiru.practice.udemy.yk.course;

public class IsRotation {

	public static boolean areArraysRotated(int[] array, int[] array1) {
		if (array.length != array1.length) {
			return false;
		}
		int key = array[0];
		int key_loc = -1;

		for (int i = 0; i < array1.length; i++) {
			if (key == array1[i]) {
				key_loc = i;
				break;
			}
		}
		if(key_loc==-1) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			int j = (key_loc + i) % array1.length;
			if (array[i] != array1[j]) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		int[] list1 = { 1, 2, 3, 4, 5, 6, 7 };
		// is_rotation(list1, list2a) should return False.
		int[] list3 = { 4, 5, 6, 7, 1, 2, 5 };

		boolean result = areArraysRotated(list1, list3);
		System.out.println(result);

	}

}
