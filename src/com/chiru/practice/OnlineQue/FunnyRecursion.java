package com.chiru.practice.OnlineQue;

public class FunnyRecursion {
	
	public void print(int n) {
		
		if(n<1) {
			return ;
		}else {
			print(n-1);
			System.out.print(n);
		}
		
	}

	public static void main(String[] args) {
		
		new FunnyRecursion().print(3);

	}

}
