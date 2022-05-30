package com.example.functional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class PredicateAndConsumerExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	static Predicate<Student> p3 = (s) -> s.getActivities().contains("gymnastics");
	
	static BiPredicate<Integer,Double> p4=(gradeLevel,gpa) -> gradeLevel >= 3 && gpa >= 3.9;

	static BiConsumer<String, List<String>> b1 = (name, activities) -> System.out.println(name + " : " + activities);

	static Consumer<Student> studentConsumer = (student) -> {
		if (p4.test(student.getGradeLevel(),student.getGpa())) {
//			if (p1.and(p2).and(p3).test(student.getGradeLevel(),student.getGpa())) {
			b1.accept(student.getName(), student.getActivities());
		}
	};

	public static void printNameAndActivities(List<Student> list) {
		list.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		printNameAndActivities(StudentDatabase.getAllStudents());
	}

}
