package com.chiru.ds.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumPairs {
	
	public static Map<Integer, Integer> findSumPairs(int[] arr,int sum){
		
		Map<Integer,Integer> allElementsMap = new HashMap<>();
		Map<Integer,Integer> pairsMap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			allElementsMap.put(arr[i], i);	
			
			if(allElementsMap.containsKey(sum-arr[i])) {
				pairsMap.put(sum-arr[i], arr[i]);
			}
		}
		
		
		
		return pairsMap;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findSumPairs(new int[]{1,6,3,7,2,5}, 7));
		
	}

}
