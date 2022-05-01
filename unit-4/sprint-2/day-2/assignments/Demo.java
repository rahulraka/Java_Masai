package com.day5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Number of objects :");
		int numObj=s1.nextInt();
		Student[] stuArr=new Student[numObj];
		for(int i=0;i<numObj;i++) {
			
			System.out.println("Enter Name of Student :");
			String name=s1.next();
			Student stu=new Student();
			stu.setName(name);
			System.out.println("Enter roll no of Student :");
			int roll=s1.nextInt();
			stu.setRoll(roll);
			System.out.println("Enter marks of Student :");
			int marks=s1.nextInt();
			stu.setMarks(marks);
			System.out.println("Enter Student's address :");
			String address=s1.next();
			stu.setAddress(address);
			
			stuArr[i]=stu;
			
			
			
		}
		long total=0;
		for(int i=0;i<stuArr.length;i++) {
			System.out.println("Name is :"+ stuArr[i].getName());
			System.out.println("Roll No is :"+ stuArr[i].getRoll());
			System.out.println("Marks are :"+ stuArr[i].getMarks());
			System.out.println("Address is :"+ stuArr[i].getAddress());
			total+=stuArr[i].getMarks();	
		}
		System.out.println("Average of students is :"+ (total/stuArr.length));
		

	}

}
