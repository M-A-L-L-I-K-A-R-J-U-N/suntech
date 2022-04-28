package com.example.practice;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.example.demo.A;

public class B extends A {

	public static void main(String[] args) {
//		A a=new A();
//		a.m1();
		/*
		 * B b=new B(); b.m1(); A c=new B();
		 */
//		c.m1();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(9);
		a1.add(4);
		a1.add(6);
		a1.add(9);
		a1.add(3);
		a1.add(9);
		a1.add(2);
		a1.add(1);
		
//		a1.forEach(System.out :: println);
		
		Consumer<Integer> em= e -> System.out.println(e);
		a1.forEach(e -> System.out.println(e));
	
	}

}
