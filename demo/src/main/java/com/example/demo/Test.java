package com.example.demo;

public class Test {
		
			
//			Interf i= () -> {
//				System.out.println("Implememtation using lambda expression");
//			};
//			
//			i.m1();
			public static void m2() {
				System.out.println("Ïmplementation by method reference");
			}
			public static void main(String[] args) {
				MethodRef m1= Test :: m2;
				m1.m1();
			}
		}

