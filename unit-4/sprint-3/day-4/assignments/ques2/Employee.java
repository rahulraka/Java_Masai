package com.S3D4.ques2;


public class Employee{
	private  int empId;
	private String empName;
	private double salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return  "Employee{" +
				"Employee Id=" + empId +
				",Employee name='" + empName + '\'' +
				", Employee Salary=" + salary +
				'}';
	}
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if(o1.getSalary() > o2.getSalary())
//			return +1;
//			else if(o1.getSalary() < o2.getSalary())
//			return -1;
//			else
//			return 0;
//
//	}
	
//	@Override
//	public int compareTo(Employee emp) {
//		// TODO Auto-generated method stub
//		if(this.salary > emp.salary)
//			return +1;
//			else if(this.salary < emp.salary)
//			return -1;
//			else
//			return 0;
//	}
	

}
