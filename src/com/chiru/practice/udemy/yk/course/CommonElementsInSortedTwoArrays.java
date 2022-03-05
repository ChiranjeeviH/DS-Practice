package com.chiru.practice.udemy.yk.course;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInSortedTwoArrays {
	
	public static void main(String[] args) {
		
				int[] i = {1, 3, 4, 6, 7, 9};
				int[] j = {1, 2, 4, 5, 9, 10};
				
				Integer[] result = solution(i, j);
				for(int k:result) {
					System.out.println(k);
				}
	}
	
	static Integer[] solution(int[] array1, int[] array2) {
		Integer[] resultInArray = null;
		
		List<Integer> arrayList = new ArrayList<>();
		int p1=0,p2=0;
		while(p1<array1.length && p2<array2.length) {
			
			if(array1[p1] == array2[p2]) {
				arrayList.add(array1[p1]);
				p1++;
				p2++;
			}else if(array1[p1] > array2[p2]) {
				p2++;
			}else {
				p1++;
			}
		}
		resultInArray = new Integer[arrayList.size()];
		resultInArray = arrayList.toArray(resultInArray);
		
		return resultInArray;
	}

}
