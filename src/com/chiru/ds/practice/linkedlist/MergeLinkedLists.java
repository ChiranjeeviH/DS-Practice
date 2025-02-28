package com.chiru.ds.practice.linkedlist;

/*
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}

class CustomLinkedList<E>{
    private Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);
        }
    }

    public ArrayList<Integer> addAll(){

        ArrayList<Integer> allValues = new ArrayList<>();

        Node temp = head;
        while(temp!=null){
            allValues.add(temp.data);
            temp=temp.next;
        }

        return allValues;

    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

}

public class MergeLinkedLists{



    public static void main(String[] args) {

        ArrayList<CustomLinkedList> listOfLists = new ArrayList<>();

        CustomLinkedList list1 = new CustomLinkedList();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        listOfLists.add(list1);

        CustomLinkedList list2 = new CustomLinkedList();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        listOfLists.add(list2);


        CustomLinkedList list3 = new CustomLinkedList();
        list3.add(2);
        list3.add(6);
        listOfLists.add(list3);

        ArrayList<Integer> combineList = new ArrayList<>();

        for(CustomLinkedList linkedList:listOfLists){
            combineList.addAll(linkedList.addAll());
        }

        //Collections.sort(combineList);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<combineList.size();i++){
            for(int j=0;j<combineList.get(i);j++){
                minHeap.offer(combineList.get(j));
            }
        }

        CustomLinkedList sortedLinkedList = new CustomLinkedList();

        for(int value:combineList){
            sortedLinkedList.add(value);
        }

        System.out.println("sorted merged list values are ");
        sortedLinkedList.printList();




    }

}




