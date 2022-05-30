package com.example.functional;

import com.example.data.StudentDatabase;

public class SortListPresentWithinTheList {

	public static void main(String[] args) {
//		List<Student> list = StudentDatabase.getAllStudents();
//		
//		for(Student s : list) {
//			s.getActivities().sort((s1,s2) -> s1.compareTo(s2));
//		}
//		System.out.println(list);
		
		StudentDatabase.getAllStudents().stream().forEach((student) -> {
			student.getActivities().sort((s1,s2) -> s1.compareTo(s2));
//			System.out.println(student);
		});
	}
}
