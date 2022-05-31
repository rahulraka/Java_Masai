package com.masai;

import java.util.List;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	public List<Student> getStudents() {
		return students;
	}


	List<Student> students;
	
	public void beforeConstructor() {
		System.out.println("This method was called before Constructor.");
	}
	
	
	public void destroy() {
		
		System.out.println("inside destroy method.. Sab Khatam Hui Gawa");
		}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	

}
