package com.chiru.ds.practice.Arrays;

public class ArrayDuplicateZero {
	
	private int[] shiftArrEle(int[] arr , int indexZeroOccurence) {
		for(int i=arr.length-1;i>indexZeroOccurence;i--) {
			arr[i]=arr[i-1];
		}
			return arr;
		
	}
	
	public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				shiftArrEle(arr, i);
				arr[i+1]=0;
				i++;
			}
			
		}
    }

	public static void main(String[] args) {
		
		//int[] arr = {1,0,2,3,0,4,5,0};
		
		int[] arr = {1,2,3};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				new ArrayDuplicateZero().shiftArrEle(arr, i);
				arr[i+1]=0;
				i++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Item in index "+i +" is "+arr[i]);
		}
		
	}

}
