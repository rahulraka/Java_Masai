package com.S2D3.qeus3;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String Bank) {
		if(Bank.equalsIgnoreCase("axis")) {
			AxisBank b1=new AxisBank();	
			return b1;
		}
		else if(Bank.equalsIgnoreCase("icici")) {
			ICICIBank b1=new ICICIBank();	
			return b1;
		}
		else {
			return null;
		}
	}
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Select Your Bank : Press '1' for AXIS BANK & Press '2' for ICICI BANK");
		String inp=scn.next();
		while(!inp.equals("1") && !inp.equals("2") ) {
			System.out.println("Select Valid Option :");
			System.out.println("Select Your Bank : Press '1' for AXIS BANK & Press '2' for ICICI BANK");
			inp=scn.next();
		}
		if(inp.equals("1")) {
			Bank b1=getBank("axis");	
			AxisBank a1=(AxisBank)b1;
			
			a1.displayDetails();
			a1.getCreditCard();
		}
		else {
			Bank b1=getBank("icici");						
			b1.displayDetails();
		}

	}

}
