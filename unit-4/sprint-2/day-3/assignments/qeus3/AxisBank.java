package com.S2D3.qeus3;

public class AxisBank extends Bank{
	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+ " Axis Bank" +" "+ " & Ifsc Code is :"+ "AXIB012345" +" "+ "rate of interest is :"+"10%");
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
