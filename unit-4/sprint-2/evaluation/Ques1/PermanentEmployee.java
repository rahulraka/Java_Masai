package com.C2.Ques1;

public class PermanentEmployee extends Employee {
	private double basicPay;
	
	
	PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		
	}
	
	@Override
	void calculateSalary() {
		double pfAmt=this.getBasicPay()*0.12;
		this.salary=this.getBasicPay()-pfAmt;
	}
	

	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
