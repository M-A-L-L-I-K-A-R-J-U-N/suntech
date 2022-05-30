package com.example.functional;

import java.util.List;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StreamMapReduceExample {

	public static void main(String[] args) {
		List<Student> list = StudentDatabase.getAllStudents();
		System.out.println("Total number of books in collection are "
				+ list.stream().filter(s -> s.getGradeLevel() >3)
				.map(Student::getNoteBook)
//				.reduce((a, b) -> a + b));
				.reduce(0, Integer :: sum)); //Avoid giving default value

	}

}
