package com.example.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = (student) -> {
		/* Another way to convert list to map
		 * Map<String,Double> map=new HashMap<>(); student.forEach((s) -> {
		 * map.put(s.getName(), s.getGpa()); });
		 */
		return student.stream().collect(Collectors.toMap(Student :: getName, Student :: getGpa));
	};
	public static void main(String[] args) {
		studentFunction.apply(StudentDatabase.getAllStudents()).forEach((key,value) -> System.out.println(key + " : " + value));
	}

}
