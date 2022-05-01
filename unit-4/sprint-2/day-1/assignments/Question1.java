package com.day4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setAge(20);
		s1.setMarks(100);
		s1.setName("Raka");
		s1.setRoll(40);
		System.out.println("Name is :"+ s1.getName()+ ", Age is : "+ s1.getAge()+", Marks are :"+ s1.getMarks()+ ", Roll No is: "+ s1.getRoll());
		
		
		Student s2=new Student(45,"Naj",27,120);
		
		System.out.println("Name is :"+ s2.getName()+ ", Age is : "+ s2.getAge()+", Marks are :"+ s2.getMarks()+ ", Roll No is: "+ s2.getRoll());

	}

}
