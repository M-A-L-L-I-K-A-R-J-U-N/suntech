package com.example.demo;

public interface MethodRef {
public void m1();
}

class Test2{
	public static void m2() {
		System.out.println("Ïmplementation by method reference");
	}
	public static void main(String[] args) {
		MethodRef m1= Test2 :: m2;
		m1.m1();
	}
}
