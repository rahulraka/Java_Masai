package com.S3D3.ques1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculateAge {
	
	public static int calculateAge(String dob) throws InvalidDateFormat{
		int age=0;
		try{
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(dob, dtf);
			LocalDate c1 = LocalDate.now();
			Period p=Period.between(date,c1);
			if(p.getYears()<0) {
				System.out.println("Date should not be in Future");
			}
			else{
				age= p.getYears();
			}
		}
	catch(Exception e) {
			InvalidDateFormat er=new InvalidDateFormat("Invalid Date Format");
			throw er;
			}
		
		
	return age;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob= sc.next();
		try {	
			int age=calculateAge(dob);
			if(age>0) {
				System.out.println("Your age is :" +age);				
			}
		}
		catch(InvalidDateFormat er) {
			System.out.println(er.getMessage());
			
			}

	}

}
