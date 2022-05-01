package com.S3D3.ques2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
	double employeeBonus(String joinDate) throws InvalidAge{
		double bonus=0;
		LocalDate date = LocalDate.parse(joinDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate curr = LocalDate.now();
		if(date.isAfter(curr)) {
			InvalidAge e=new InvalidAge("Date should not be in the future");
			throw e;
		}
		else {
		try {
		Period p=Period.between(date, curr);
		
		if(p.getYears()<1 && p.getYears()>=0) {
			bonus=5000;
		}
		else if(p.getYears()<2 && p.getYears()>=1) {
			bonus=8000;
		}
		else if(p.getYears()>2) {
			bonus=10000;
		}
		}
		
		catch(Exception e) {
			InvalidAge er=new InvalidAge("Please Pass the date in the correct format");
			throw er;
		}
		return bonus;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
