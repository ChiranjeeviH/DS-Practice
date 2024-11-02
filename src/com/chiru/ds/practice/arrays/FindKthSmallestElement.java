package com.chiru.ds.practice.arrays;

import java.util.PriorityQueue;

public class FindKthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:arr){
            minHeap.offer(i);
        }
        int result = -1;
        for(int i=0;i<k;i++){
            result = minHeap.poll();
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{7, 10, 4, 3, 20, 15},3));
        System.out.println(kthSmallest(new int[]{2, 3, 1, 20, 15},4));
    }
}
