package com.S3D1.ques1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		Hotel h1=null;
		if(amount>=200 && amount<=1000) {
			h1=new RoadSideHotel();
			return h1;
		}
		else if(amount>1000) {
				h1=new TajHotel();
				return h1;
				}
		
	else {
		System.out.println("Please Enter Valid Amount");
	}
		return h1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Amount");
		Demo d1=new Demo();
		Hotel h1=d1.provideFood(scn.nextInt());
		if(h1!=null) {
			h1.chickenBiryani();
			h1.masalaDosa();
			if(h1 instanceof TajHotel) {
				((TajHotel) h1).welcomeDrink();
			}
			
		}
	}
}
		
		

	


