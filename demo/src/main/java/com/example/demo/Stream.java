package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee{
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
	}

	public Employee(int id,String name) {
		super();
		this.id=id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Stream {

	
	public static void main(String[] args) {
		Employee em=new Employee();
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Mallikarjun"));
		emp.add(new Employee(2,"Pramod"));
		emp.add(new Employee(3,"Lakshmeesh"));
		emp.add(new Employee(4,"Aqhib"));
		emp.add(new Employee(5,"Pranav"));
		
		Predicate<Employee> p1=p -> p.getName().equalsIgnoreCase("Mallikarjun");
		
		Consumer<Employee> cm = s -> {
		if(p1.test(em) == Boolean.TRUE) {
			emp.remove(em);
		}
		};
		
		 
		emp.forEach(cm);
		
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp);
		}
		
	}
	
	
}
