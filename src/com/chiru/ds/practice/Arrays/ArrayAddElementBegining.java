package com.chiru.ds.practice.Arrays;

public class ArrayAddElementBegining {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		int intEle = 10;
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = i+1;
		}
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=intEle;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Item in index "+i +" is "+arr[i]);
		}
		
		

	}

}
