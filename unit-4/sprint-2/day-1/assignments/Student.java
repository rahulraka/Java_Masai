package com.day4;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	Student(int roll, String name, int age, int marks) {
		this.name=name;
		this.roll=roll;
		this.age=age;
		this.marks=marks;
	}
	Student(){	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {			
			this.age = age;
		}
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;			
		}
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
