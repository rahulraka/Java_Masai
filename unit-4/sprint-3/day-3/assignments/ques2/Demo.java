package com.S3D3.ques2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBonus e1=new EmployeeBonus();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String joinDate=sc.next();
		try {
			System.out.println("Your collective bonus is "+e1.employeeBonus(joinDate));			
		}
		catch(InvalidAge er) {
			System.out.println(er.getMessage());
		}

	}

}
