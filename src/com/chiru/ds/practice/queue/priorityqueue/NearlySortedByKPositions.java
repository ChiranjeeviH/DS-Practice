package com.chiru.ds.practice.queue.priorityqueue;

import java.util.PriorityQueue;

public class NearlySortedByKPositions {

    public static void nearlySorted(int[] arr, int k) {
        // code

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;



        for(int i=0;i<k;i++){
            minHeap.offer(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            minHeap.offer(arr[i]);
            arr[index]=minHeap.poll();
            index++;
        }

        while(!minHeap.isEmpty()){
            arr[index]= minHeap.poll();
            index++;
        }

    }

    public static void main(String[] args) {

        //int arr[] = new int[]{6, 5, 3, 2, 8, 10, 9};
        int arr[] = new int[]{1, 4, 5, 2, 3, 6, 7, 8, 9, 10};

        NearlySortedByKPositions.nearlySorted(arr,3);;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
