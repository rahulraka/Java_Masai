package com.S2D3.ques1;

import java.util.Scanner;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Type of Student, for Day Scholar Press '1', For Hosteller Press '2'");
		int option=scn.nextInt();
		if(option==1) {
			DayScholar s1=new DayScholar();
			System.out.println("Enter Student Name :");
			s1.studName=scn.next();
			System.out.println("Enter Student Id :");
			s1.studId=scn.nextInt();
			System.out.println("Enter Exam Fee :");
			s1.examFee=scn.nextDouble();
			System.out.println("Enter Transport Fee :");
			s1.transportFee=scn.nextDouble();
			s1.displayDetails();
		}
		else if(option==2){
			Hosteller s2=new Hosteller();;
			System.out.println("Enter Student Name :");
			s2.studName=scn.next();
			System.out.println("Enter Student Id :");
			s2.studId=scn.nextInt();
			System.out.println("Enter Exam Fee :");
			s2.examFee=scn.nextDouble();
			System.out.println("Enter Hostel Fee :");
			s2.hostelFee=scn.nextDouble();
			s2.displayDetails();
		}
		else {
			System.out.println("Invalid Instructions");
		}
		
		
		
		
		
		
		
		

	}

}
