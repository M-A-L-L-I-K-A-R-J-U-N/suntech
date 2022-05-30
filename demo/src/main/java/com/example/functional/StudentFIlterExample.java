package com.example.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StudentFIlterExample {

	public static List<Student> filterStudentByCombiningPredicate(){
		Predicate<Student> p1=s -> s.getGpa()>3;
		Predicate<Student> p2=s -> s.getGender().equals("Male");
		
//		return StudentDatabase.getAllStudents().stream().filter(p1.and(p2)).collect(Collectors.toList());
		return StudentDatabase.getAllStudents().stream().filter(p1).filter(p2).collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		filterStudentByCombiningPredicate().forEach(System.out :: println);
	}

}
