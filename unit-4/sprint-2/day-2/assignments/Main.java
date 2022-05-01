package com.day5;

import java.util.Scanner;

public class Main {
	public static int getPFPercentage(int pfPer) {
		return pfPer;
	}
	static public Employee getEmployeeDetails(int employeeId, String employeeName, double salary) {
		Employee e1=new Employee();
		e1.setEmployeeId(employeeId);
		e1.setEmployeeName(employeeName);
		e1.setSalary(salary);
		
		return e1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Id :");
		int id=s1.nextInt();
		System.out.println("Enter Name :");
		String name=s1.next();
		System.out.println("Enter Salary");
		double salary=s1.nextDouble();
		System.out.println("Enter PF percentage :");
		int pfPer=s1.nextInt();
		
		
		
		Employee e1=getEmployeeDetails(id, name,salary);
		int pf=getPFPercentage(pfPer);
		e1.calculateNetSalary(pf);
		System.out.println("Id :"+e1.getEmployeeId());
		System.out.println("Name :"+ e1.getEmployeeName());
		System.out.println("Salary :"+ e1.getSalary());
		System.out.println("Net Salary :"+ e1.getNetSalary());
		
		

	}

}
