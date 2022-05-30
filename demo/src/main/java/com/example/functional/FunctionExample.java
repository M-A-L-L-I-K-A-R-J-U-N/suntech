package com.example.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> f2 = (name) -> name.toUpperCase();
	static Function<String, String> f3 = (name) -> name.concat("Default");
	static Function<String, List<Character>> f1 = (s) -> {
		char[] ch1 = s.toCharArray();
		List<Character> ch = new ArrayList<>();
		for (int i = 0; i < ch1.length; i++) {
			ch.add(ch1[i]);
		}

		Set<Character> s1 = new TreeSet<>(ch);
		for (Character c : s1) {
			if (Collections.frequency(ch, c) > 1) {
				ch.remove(c);
			}
		}

		return ch;

	};

	public static void removeDuplicateCharacters(String input) {
		List<Character> uniqueCharactersFromString = f1.apply(input);
		uniqueCharactersFromString.forEach(System.out::print);
	}

	public static void main(String[] args) {
		removeDuplicateCharacters("Password");
		System.out.println(f2.andThen(f3).apply("Password")); //PASSWORDDefault
		System.out.println(f2.compose(f3).apply("Password")); //PASSWORDDEFAULT

	}

}
