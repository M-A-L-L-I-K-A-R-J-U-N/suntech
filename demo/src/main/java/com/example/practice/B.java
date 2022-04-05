package com.example.practice;

import com.example.demo.A;

public class B extends A {

	public static void main(String[] args) {
		A a=new A();
//		a.m1();
		B b=new B();
		b.m1();
		A c=new B();
//		c.m1();
		
		
	}

}
