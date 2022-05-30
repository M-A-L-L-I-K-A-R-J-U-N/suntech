package com.example.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public static List<Student> getAllStudents() {
		/**
		 * 2nd grade students
		 */
		Student student1 = new Student("Adam", 2, 3.6, "Male", Arrays.asList("swimming", "basketball", "volleyball"),12);
		Student student2 = new Student("Jenny", 2, 3.8, "Female", Arrays.asList("swimming", "gymnastics", "soccer"),13);
		/**
		 * 3rd grade students
		 */
		Student student3 = new Student("Emily", 3, 4.0, "Female", Arrays.asList("swimming", "gymnastics", "aerobics"),9);
		Student student4 = new Student("Dave", 3, 4.0, "Male", Arrays.asList("swimming", "gymnastics", "soccer"),10);
		/**
		 * 4th grade students
		 */
		Student student5 = new Student("Sophia", 4, 3.5, "Female", Arrays.asList("swimming", "dancing", "football"),18);
		Student student6 = new Student("James", 4, 3.9, "Male",
				Arrays.asList("swimming", "basketball", "baseball", "football"),5);

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return students;
	}
}
