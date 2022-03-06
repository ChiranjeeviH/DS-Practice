package com.chiru.ds.practice.Arrays;

public class LargestAndSmallest {

	public static int[] findLargestAndSmallestNumbers(int[] arr) {

		int min = 0, max = 0;
		int[] result = new int[2];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		result[1] = max;
		min=max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		result[0] = min;

		return result;
	}

	public static void main(String[] args) {

		int[] arr = findLargestAndSmallestNumbers(new int[] { 2, 4, 1, 5, 6, 3 });

		System.out.println("Smallest number :" + arr[0] + " Largest number :" + arr[1]);

	}

}
