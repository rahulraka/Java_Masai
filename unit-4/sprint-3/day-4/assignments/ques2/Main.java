package com.S3D4.ques2;

import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Program, We can store your Employees recoed according to their Salary");
		System.out.println("Enter the Number of employees you wanna store");
		int inp=sc.nextInt();
		TreeSet<Employee> ts=new TreeSet<>(new EmployeeSalaryCompare());
		for(int i=0;i<inp;i++) {
			System.out.println("Enter details of your Employee, as Employee Name, Employee Id, and Salary");
			String name=sc.next();
			int id=sc.nextInt();
			double sal=sc.nextDouble();
			ts.add(new Employee(id,name,sal));
		}
		for(Employee x: ts) {			
			System.out.println(x);
		}


	}

}
