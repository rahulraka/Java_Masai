package com.C2.Ques1;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Employee(int employeeId, String employeeName) {
		
	}
	abstract void calculateSalary();

}
