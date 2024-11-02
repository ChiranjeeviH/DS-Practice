/*
 * An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.

Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
 * 
 * 
 */
package com.chiru.ds.practice.arrays;

public class PeakElement {
	int output=0;
	
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int output=0;
       if(n ==1) {
			return 1;
		}
		else if(n ==2) {
			if(arr[0] > arr[1]) {
				return 1;
			}else if((arr[0] < arr[1])) {
				return 1;
			}

		}
		else {
			for(int i=0;i<n;i++) {
				if(i==0) {
					if(arr[i]>arr[i+1]) {
						return 1;
					}
				}
				else if(i==n-1) {
					if(arr[i]>arr[i-1]) {
						return 1;
					}
				}
				else {
					if(arr[i]>arr[i+1] & arr[i]>arr[i-1]) {
						return 1;
					}
				}
			}
		}
		
		
		return output;
		
		
	}

	public static void main(String[] args) {
		
		PeakElement pe = new PeakElement();
		int result = pe.peakElement(new int[]{1,2,3},3);
		System.out.println(result);

	}

}
