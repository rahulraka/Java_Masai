package com.day5.ques3;

import java.util.Scanner;

public class AccountDetails {
	
	public static Account getAccountDetails() {
		Scanner scan=new Scanner(System.in);
		Account p1=new Account();
		System.out.println("Enter Your Account ID  :");
		int id=scan.nextInt();
		p1.setAccountId(id);
		System.out.println("Enter Account type :");
		String type=scan.next();
		p1.setAccountType(type);
		System.out.println("Enter balance :");
		int bal=scan.nextInt();
		if(bal<0) {
			while(bal<0) {
				System.out.println("Balance Should be Positive");
				System.out.println("Enter balance :");
				bal=scan.nextInt();
			}
		}
		p1.setBalance(bal);
		return p1;
	}
//	public static int checkBal(int bal) {
//		if(bal<=0) {
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Balance Should be Positive");
//			System.out.println("Enter balance :");
//			bal=scan.nextInt();
//			return 0;
//		}
//		else {		
//			return bal;
//			
//		}
//	}
	public static int getWithdrawAmount(int withdrawlAmt) {
		if(withdrawlAmt>0) {
			return withdrawlAmt;
		}
		else {
			while(withdrawlAmt>0) {
				System.out.println("Amount should be positive");				
			}
		return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account p1=getAccountDetails();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn :");
		int withdrawlAmt=scan.nextInt();
		int amt=getWithdrawAmount(withdrawlAmt);
		p1.withdraw(amt);
		
		

	}

}
