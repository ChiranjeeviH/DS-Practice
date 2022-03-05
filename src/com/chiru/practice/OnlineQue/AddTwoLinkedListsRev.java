package com.chiru.practice.OnlineQue;
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	Example 1:
	Input: l1 = [2,4,3], l2 = [5,6,4]
	Output: [7,0,8]
	Explanation: 342 + 465 = 807.
	
	Example 2:

	Input: l1 = [0], l2 = [0]
	Output: [0]
	
	Example 3:
	
	Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
	Output: [8,9,9,9,0,0,0,1]
	
	Constraints:
	
	The number of nodes in each linked list is in the range [1, 100].
	0 <= Node.val <= 9
	It is guaranteed that the list represents a number that does not have leading zeros.
 */


class LinkedList {
	int data;
	LinkedList next;

	LinkedList() {
	}

	LinkedList(int value) {
		this.data = value;
	}

	LinkedList(int value, LinkedList next) {
		this.data = value;
		this.next = next;
	}

}

public class AddTwoLinkedListsRev {
	
	public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
		
		LinkedList resultList = new LinkedList();
		int sum =0;
		int rem =0;
		int add =0;
		
		do {
			add = l1.data+l2.data;
			if(add > 9) {
				sum = (add+rem)%10;
				rem = add/10;
			}else {
				sum = add+rem;
			}
			resultList = new LinkedList(sum,resultList);
			l1 = l1.next;
			l2= l2.next;
			
			
		}while(l1.next!=null && l2.next!=null);
		
		
		
		return resultList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		int[] array = {2,4,3};
		int[] array1 = {5,6,4};
		
		for(int i=0;i<array.length;i++) {
			l1 = new LinkedList(array[i],l1);
			l2 = new LinkedList(array1[i],l2);
		}
		
		LinkedList result = new AddTwoLinkedListsRev().addTwoNumbers(l1, l2);
		do {
			System.out.println("Linked list values are :"+result.data);
			result= result.next;
		}while(result.next!=null);
		
		

	}

}
