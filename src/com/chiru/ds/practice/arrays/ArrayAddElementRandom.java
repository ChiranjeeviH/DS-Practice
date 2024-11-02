package com.chiru.ds.practice.arrays;

public class ArrayAddElementRandom {
	
	public static void main(String[] args) {
		int[] arr = new int[6];

		int randomIndex = 3;
		int randomIndexValue=10;
		
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=arr.length-1;i>randomIndex;i--) {
			arr[i] = arr[i-1];
		}
		arr[randomIndex] = randomIndexValue;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Item in index "+i +" is "+arr[i]);
		}
		
		
	}

}
