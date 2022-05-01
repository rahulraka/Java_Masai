package com.day5.ques3;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	

	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		if(balance>0) {
			
			this.balance = balance;
		}
		else {
			System.out.println("Balance Should be Positive");
		}
	}
	
	public boolean withdraw(int amt) {
		if(this.getBalance()>=amt) {
		int remainingBalance=this.getBalance()-amt;
		this.setBalance(remainingBalance);
		System.out.println("Balance amount after withdraw :"+ this.getBalance());
		return true;
		}
		else {
		System.out.println("Sorry!!! No enough balance");
		return false;	
		}
		
	}


	

}
