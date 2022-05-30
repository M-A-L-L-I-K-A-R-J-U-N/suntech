package com.example.functional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class ConsumerExample {

	static Consumer<Student> c1 = t -> {
		if (t.getGender().equals("male")) {
			System.out.println(t.getName());
		}
	};
	
//	static Consumer<Student> c2 = t2 -> System.out.println(t2.getActivities());

	public static void getStudentNameWithActivities() {
		System.out.println("getStudentNameWithActivities");
		List<Student> studentList = StudentDatabase.getAllStudents();

		studentList.forEach(c1);
		
//		BiConsumer<String, List<String>> biConsumer= (name,activities) -> System.out.println(name + " : " + activities);	
//		studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void getStudentNameWithActivitiesCondition() {
		System.out.println("getStudentNameWithActivitiesCondition");
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach((student) -> {
			if(student.getGradeLevel() >=3) {
				c1.accept(student);
			}
			});
	}
	public static void main(String[] args) {
		getStudentNameWithActivities();
//		getStudentNameWithActivitiesCondition();
	}

}
