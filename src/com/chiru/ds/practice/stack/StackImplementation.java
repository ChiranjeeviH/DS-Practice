package com.chiru.ds.practice.stack;

public class StackImplementation {

	int si[];
	int top=-1;

	StackImplementation() {
		si = new int[10];
	}

	StackImplementation(int size) {
		si = new int[size];
	}
	
	
	public void push(int value) {
		
		if(top != si.length-1) {
			si[++top] = value;
		}else {
			System.out.println("Stack is full");
		}
		
		
		
	}
	
	public int pop() {
		
		if(top>=0) {
			int temp = top+1;
			top--;
			
			return temp;
		}else {
			System.out.println("Stack is empty");
		}
		
		
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		StackImplementation s = new StackImplementation(2);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		 s.pop();
		 s.pop();
		 s.pop();
		
		
		//System.out.println(popValue);
		
	}

}
