package com.chiru.practice.udemy.yk.course;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElements {
	public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        //mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
//        int[] array2 = {3, 3, 1, 3, 2, 1};
//        // mostFrequent(array3) should return null.
//        int[] array3 = {};
//        // mostFrequent(array4) should return 0.
//        int[] array4 = {0};
//        // mostFrequent(array5) should return -1.
//        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        
        mostFreqent(array1);
    }

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
    	Integer maxItem = null;
    	int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0;i<givenArray.length;i++){
           if(hm.containsKey(givenArray[i])){
               hm.put(givenArray[i],hm.get(givenArray[i])+1);
           }else {
        	   hm.put(givenArray[i],1);
           }
          
       }	
       for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
          if(max < entry.getValue()) {
        	  max = entry.getValue();
        	  maxItem = entry.getKey();
          }
       }
       System.out.println(maxItem);
        return maxItem;
    }

}
