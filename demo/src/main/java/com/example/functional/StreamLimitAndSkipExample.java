package com.example.functional;

import java.util.Optional;

import com.example.data.Student;
import com.example.data.StudentDatabase;

public class StreamLimitAndSkipExample {
	
	public static Optional<Student> findAny(){
		
		return StudentDatabase.getAllStudents().stream().filter(s -> s.getGender().equalsIgnoreCase("Male")).findAny();
		
	}

	public static void main(String[] args) {
//		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 5);
//		System.out.println(l1.stream().skip(l1.size()-3).reduce((x,y) -> x+y));
		
		Optional<Student> res=findAny();
		if(res.isPresent()) {
			System.out.println("Found the student :" + res.get());
		}else {
			System.out.println("Student not found in database");
		}
	}

}
