package com.Day3;

public class StudentObject {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is:"+ roll);
		System.out.println("Name is:"+ name);
		System.out.println("Marks is:"+ marks);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentObject s1= new StudentObject();
		StudentObject s2= new StudentObject();
		s1.roll=40;
		s1.name="Rahul";
		s1.marks=95;
		s2.roll=140;
		s2.name="Najmush";
		s2.marks=90;
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s1=null;
		s2=null;
		
		

	}

}
