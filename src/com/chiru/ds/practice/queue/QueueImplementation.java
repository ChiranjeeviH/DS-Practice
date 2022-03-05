package com.chiru.ds.practice.queue;

public class QueueImplementation {
	
	int[] qi;
	
	int front=-1,rear=-1;
	
	public QueueImplementation() {
		qi = new int[5];
	}
	
	public QueueImplementation(int size) {
		qi = new int[size];
	}
	
	
	public void enqueue(int value) {
		if(rear!=qi.length-1) {
			qi[++rear]=value;
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		
		int temp=0;
		
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			 temp = qi[front+1];
			front+=1;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		QueueImplementation qi = new QueueImplementation(5);
		
		qi.enqueue(1);
		qi.enqueue(2);
		qi.enqueue(3);
		qi.enqueue(4);
		qi.enqueue(5);
		qi.enqueue(6);
		
		
		int dequeued = qi.dequeue();
		qi.dequeue();
		qi.dequeue();
		qi.dequeue();
		qi.dequeue();
		qi.dequeue();
		System.out.println(dequeued);
	}

}
