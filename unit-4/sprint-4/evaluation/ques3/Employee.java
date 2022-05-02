package Eval4.ques3;

import java.io.Serializable;

public class Employee implements Serializable{
	private String empId;
	private String empName;
	private Address address;
	private String email;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	private transient String password;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(String empId, String empName,Address a1, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = a1;
		this.email = email;
		this.password = password;
	}
	
	
}
