package com.example.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction= (student,studentPredicate) -> {
		return student.stream().filter(studentPredicate).collect(Collectors.toMap(Student :: getName, Student :: getGpa));
		/*
		 * student.forEach((s) -> { if(studentPredicate.test(s)){
		 * map.put(s.getName(),s.getGpa()); }
		 * 
		 * }); return map;
		 */
	};
	
	public static void main(String[] args) {
		Predicate<Student> p1=p -> p.getGradeLevel()>=3;
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(),p1));
	}

}
