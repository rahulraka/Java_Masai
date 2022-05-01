package com.S2D3.ques1;

import java.util.Scanner;

public class Hosteller extends Student{
	double hostelFee;
	
	@Override
	double payFee() {
		Scanner paying=new Scanner(System.in);
		System.out.println("Enter amount you are Paying :");
		double gotFee=paying.nextDouble();
		double remainingAmt=(this.hostelFee+this.examFee)-gotFee;
		return remainingAmt;
			
		}
	
	@Override
	void displayDetails(){
		System.out.println("Student Name is :"+ this.studName);
		System.out.println("Student Id is :"+ this.studId);
		System.out.println("Student Exam Fee is :"+ this.examFee);
		System.out.println("Student Hostel Fee is :"+ this.hostelFee);
		System.out.println("Student's Total amount to be paid is :"+ (this.hostelFee+this.examFee));
		
		System.out.println("Your Remaining Balance to be paid is :"+ payFee());
		
			
	}

}
