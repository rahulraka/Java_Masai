package com.Eval3.ques4;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class CheckVoting {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		try{
		LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate c1 = LocalDate.now();
		Period p = Period.between(d1,c1);
		
		if(p.getYears() >= 18) {
			if(d1.getDayOfMonth()==c1.getDayOfMonth() && d1.getMonthValue()==c1.getMonthValue()) {
				System.out.println("Happy Birthday, You are eligible to cast your vote.");	
				}
			else {
				System.out.println("You are Eligible Cast your Vote");				
			}
			
		}
		else if(p.getYears()<=0) {
			System.out.println("Date of birth should not be in future");
		}
		else {
			System.out.println("Sorry you are not eligible to Vote");			
		}
		}
		catch (Exception e){
		System.out.println("please pass the date in the proper format");
		}
		}


}
