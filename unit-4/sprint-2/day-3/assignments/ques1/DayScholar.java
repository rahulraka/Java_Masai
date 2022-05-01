package com.S2D3.ques1;

import java.util.Scanner;

public class DayScholar extends Student{
	double transportFee;
	
	@Override
	double payFee() {
		Scanner paying=new Scanner(System.in);
		System.out.println("Enter amount you are Paying :");
		double gotFee=paying.nextDouble();
		double remainingAmt=(this.transportFee+this.examFee)-gotFee;
		return remainingAmt;
			
		}
	
	@Override
	void displayDetails(){
		System.out.println("Student Name is :"+ this.studName);
		System.out.println("Student Id is :"+ this.studId);
		System.out.println("Student Exam Fee is :"+ this.examFee);
		System.out.println("Student Transportation Fee is :"+ this.transportFee);
		System.out.println("Student's Total amount to be paid is :"+ (this.transportFee+this.examFee));
		
		System.out.println("Your Remaining Balance to be paid is :"+ payFee());
		
			
	}

	

}
