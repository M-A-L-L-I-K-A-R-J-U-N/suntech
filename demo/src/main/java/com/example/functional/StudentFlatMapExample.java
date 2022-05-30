package com.example.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StudentFlatMapExample {

	public static List<String> printStudentActivities() {
		List<String> studentActivities = StudentDatabase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		return studentActivities;

	}

	public static List<Student> sortStudentsByName() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("print StudentActivities" + printStudentActivities());
		System.out.println(sortStudentsByName());
	}

}
