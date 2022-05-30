package com.example.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StudentNameWithActivities {

	public static void main(String[] args) {
		List<Student> list = StudentDatabase.getAllStudents();
		Map<String, List<String>> map = list.stream().peek((student -> {
			System.out.println(student);
		})).filter(student -> student.getGpa() < 3).filter(student -> student.getGradeLevel() > 3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

//		map.entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
		map.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
	}

}
