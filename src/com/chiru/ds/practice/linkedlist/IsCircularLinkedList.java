/*
package com.chiru.ds.practice.linkedlist;


import java.util.LinkedList;

public class IsCircularLinkedList {

    public static boolean isCircularLinkedList(Node head){

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                // Cycle found
                Node<Integer> firstNode = slow; // This node is part of the cycle
                Node<Integer> secondNode = firstNode.next; // The next node in the cycle

                // We need to find the last node that connects to the first node
                Node<Integer> current = head;
                while (current.next != firstNode) {
                    current = current.next;
                }
                System.out.println("Cycle found between nodes " + current.data + " and " + firstNode.data);
                return true;  // The list is circular
            }
        }


        return false;

    }


    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(5);
        Node<Integer> node3 = new Node<>(7);
        Node<Integer> node4 = new Node<>(8);
        Node<Integer> node5 = new Node<>(10);

        // Linking the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1;

        System.out.println(isCircularLinkedList(node1));

    }
}
*/
