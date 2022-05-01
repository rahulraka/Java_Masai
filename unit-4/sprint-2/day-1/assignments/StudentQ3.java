package com.day4;

public class StudentQ3 {
	int roll;
	String name;
	String address;
	String collageName;
	
	StudentQ3(int roll, String name, String address){
		this.address=address;
		this.roll=roll;
		this.name=name;
		this.collageName="NIT";
	}
	StudentQ3(int roll, String name, String address, String collageName){
		this.address=address;
		this.roll=roll;
		this.name=name;
		this.collageName=collageName;
	}
	


	public static StudentQ3 getStudent(boolean isFromNIT) {
		if(isFromNIT) {
			StudentQ3 s1=new StudentQ3(50, "Rahul", "Molarband");
			return s1;
		}
		else {
			StudentQ3 s2=new StudentQ3(40, "Raka", "Meethapur","BVPS");
			return s2;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentQ3 res1=getStudent(true);
		StudentQ3 res2=getStudent(false);
		System.out.println(res1.name);
		System.out.println(res1.roll);
		System.out.println(res1.address);
		System.out.println(res1.collageName);
		
		
		
		System.out.println("======================");
		
		System.out.println(res2.name);
		System.out.println(res2.roll);
		System.out.println(res2.address);
		System.out.println(res2.collageName);
		

	}

}
