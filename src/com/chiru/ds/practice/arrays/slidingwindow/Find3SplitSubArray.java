package com.chiru.ds.practice.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3SplitSubArray {

    public static List<Integer> findSplit(int[] arr) {


        int sum = Arrays.stream(arr).sum();

        if(arr.length <3 || sum%3!=0){
            return List.of(-1,-1);
        }

        int currentSum = sum/3;
        int i=0,j=0;
        int prefixSum = 0;

        List<Integer> result = new ArrayList<>();
        while(j<arr.length){
            prefixSum+=arr[j];
            if(prefixSum == currentSum){
                result.add(j);
                i++;
                prefixSum=0;
            }
            j++;
        }

        if(result.size() >=3){
            return result;
        }else{
            return List.of(-1,-1);
        }

    }


    public static void main(String[] args) {

        System.out.println(findSplit(new int[]{1, 3, 4, 0, 4}));

    }
}
