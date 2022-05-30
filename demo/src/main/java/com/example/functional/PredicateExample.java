package com.example.functional;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = i -> i % 2 == 0;
	static Predicate<Integer> p2 = i -> i % 5 == 0;
	static Predicate<String> checkIsEqual=t -> t.equals("Administrator");
	
	public static void predicate(Integer i) {
		System.out.println(p1.test(i));
	}

	public static void predicateAnd(Integer i) {
		System.out.println(p1.and(p2).test(i));
	}
	
	public static void predicateOr(Integer i) {
		System.out.println(p1.or(p2).test(i));
	}
	
	public static void predicateOrWithNegate(Integer i) {
//		System.out.println(p1.or(p2).negate().test(i));
//		System.out.println(p1.and(p2).negate().test(i));
		System.out.println(Predicate.isEqual(p1).test(i));
//		System.out.println(p1.negate().negate().negate().test(i));
	}
	
	
	public static void main(String[] args) {
		predicate(10);
		predicateAnd(25);
		predicateOr(30);
		predicateOrWithNegate(25);
	}

}
