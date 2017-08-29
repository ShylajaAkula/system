package com.ojas.exam;

public class Question2 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.equals(b);
		b=null;
		a=null;
		System.out.println("start completed");
	}
}
