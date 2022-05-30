package com.example.functional;

import java.util.Arrays;
import java.util.List;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StreamReduceExample {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		// System.out.println(ls.stream().reduce(0, (a, b) -> a + b));

		List<String> returnLargestWord = Arrays.asList("Mallikarjun", "Sharat", "Mohan");

		// System.out.println(returnLargestWord.stream().reduce((word1,word2) ->
		// word1.length()>word2.length() ? word1 : word2));
		System.out.println(returnLargestWord.stream()
				.sorted((word1, word2) -> Integer.valueOf(word2.length()).compareTo(Integer.valueOf(word1.length())))
				.findFirst());

		List<Student> list = StudentDatabase.getAllStudents();
		System.out.println(list.stream().reduce((a,b) -> a.getGpa()>b.getGpa() ? a : b));
	}

}