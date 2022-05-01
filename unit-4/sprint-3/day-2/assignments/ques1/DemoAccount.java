package com.S3D2.ques1;

import java.util.Scanner;

public class DemoAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Account Number :");
		double acn=sc.nextDouble();
		Account a1=new Account(acn);
		System.out.println("Enter amount to Deposit :");
		double amt=sc.nextDouble();
		a1.deposit(amt);
		System.out.println("Press 1 for Check Balance");
		System.out.println("Press 2 for Withdrawl");
		int opt=sc.nextInt();
		if(opt==1) {
			System.out.println("Your Account Balance is "+a1.balance);
		}
		else {
			System.out.println("Enter Amount to withdraw ");
			double wdAmt=sc.nextDouble();
			try {
			
				System.out.println("Your remaining balance is"+a1.withdraw(wdAmt));
			}
			catch(InsufficientFundsException er){
				System.out.println(er.getMessage());
			}
		}
		sc.close();
		System.out.println("Main completed Gracefully");
		

	}

}
