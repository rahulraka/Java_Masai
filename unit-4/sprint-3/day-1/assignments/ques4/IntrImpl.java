package com.S3D1.ques4;

import java.util.Scanner;

public class IntrImpl implements Intr{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Employee Count :");
		int count=scn.nextInt();
		if(count<2) {
			while(!(count>=2)) {
				System.out.println("Please enter a valid employee count");
				count=scn.nextInt();
			}
		}
		else {
			int[] ages=new int[count];
			boolean flag=true;
			for(int i=0;i<count;i++) {
				int age=scn.nextInt();
				System.out.println("Enter age of " + age + " Employee");
				if(age<=40 && age >=28) {
				ages[i]=age;
				}
				else {
					System.out.println("Invalid age encountered!");	
					flag=false;
					break;
				}
			}
			if(flag==true) {				
			IntrImpl i1=new IntrImpl();
			i1.calculateAverage(ages);
			scn.close();
			}
			
			
		}
		

	}

	@Override
	public void calculateAverage(int[] age) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println(" ");
		double sum=0;
		for(int a1 :age) {
			sum+=a1;
		}
		double avg=sum/age.length;
		System.out.println("The average age is :"+ avg);
		
	}

}
