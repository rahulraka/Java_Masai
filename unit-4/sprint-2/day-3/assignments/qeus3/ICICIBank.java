package com.S2D3.qeus3;

public class ICICIBank extends Bank{
	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+ "ICICI Bank "+" "+ " & Ifsc Code is :"+ "ICICI012345" +" "+ "rate of interest is :"+ "12%");
	}


}
