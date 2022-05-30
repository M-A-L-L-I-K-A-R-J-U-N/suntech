package com.example.functional;

import java.util.Arrays;
import java.util.List;

public class StreamMinAndMaxExample {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 4, 1, 34, 2, 22);
		
		System.out.println(ls.stream().reduce((a,b) -> a>b ? a : b));
	}

}
