package com.chiru.practice.oops;

public class MethodOverloadingVsMethodOverriding {
	
	public static void main(String[] args) {
		A a = new A();
		a.m1(null);
		
		B b = new B();
		//b.m1(null);
	}
	

}

class A{
	
	public void m1(int a) {
		
		System.out.println("Class A metood m1 with one parameter "+a);
		
	}
	public void m1(int a, int b) {
		
		System.out.println("Class A metood m1 with two parameters "+a+" "+b);
	}
	
	public void m1(String s) {
		System.out.println("String in class A");
	}
	
	
	public void m1(Object s) {
		System.out.println("String Object in class A");
	}
}

class B extends A{
	
	public void m1(int a) {
		
		System.out.println("Class B metood m1 with one parameter");

	}

	public void m1(int a, int b) {
		
		System.out.println("Class B metood m1 with two parameters "+a+" "+b);

	}
	
//	public void m1(Object s) {
//		System.out.println("String Object in class B");
//	}
	
	public void m1(Integer s) {
		System.out.println("String in class A");
	}
}
