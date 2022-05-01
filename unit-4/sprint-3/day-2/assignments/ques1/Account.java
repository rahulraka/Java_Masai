package com.S3D2.ques1;

public class Account {
	double accountNumber;
	double balance;
	void deposit(double amount) {
		balance=amount;
		
	}
	double withdraw(double amount) throws InsufficientFundsException{
		double check=0;
		if(this.balance>=amount) {
			check=this.balance-amount;
			this.balance-=amount;
			return check;
		}
		else {
			InsufficientFundsException err=new InsufficientFundsException("You dont have sufficient balance");
		throw err;
		}
		
		
		
	}

	public Account(double act) {
		if(act!= 0 && act>0) {
			
			accountNumber=act;
		}
	}

}
