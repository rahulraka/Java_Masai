package com.S2D3.ques2;

import java.util.Scanner;

public class Main {
	
	

	public static Hosteller getHostellerDetails() {
		Scanner scn = new Scanner(System.in);
		Hosteller s1 = new Hosteller();
		System.out.println("Enter Student Id :");
		s1.setStudentId(scn.nextInt());
		System.out.println("Enter Student's Name :");
		String temp=scn.nextLine();
		s1.setName(scn.nextLine());
		System.out.println("Enter Department ID :");
		s1.setDepartmentId(scn.nextInt());
		System.out.println("Enter Gender :");
		s1.setGender(scn.next());
		System.out.println("Enter Phone Number :");
		s1.setPhone(scn.next());
		System.out.println("Enter Hostel Name :");
		String temp1=scn.nextLine();
		s1.setHostelName(scn.next());
		System.out.println("Enter Room Number :");
		s1.setRoomNumber(scn.nextInt());
		System.out.println("Modify Room Number (Y/N)");
		String optionSel = scn.next();
		while (!optionSel.equals("Y") && !optionSel.equals("y") && !optionSel.equals("N") && !optionSel.equals("n")) {
			System.out.println("Modify Room Number (Y/N)");
			optionSel = scn.next();
		}
		if (optionSel.equals("Y") || optionSel.equals("y")) {
			System.out.println("New Room Number :");
			s1.setRoomNumber(scn.nextInt());
		}
		System.out.println("Modify Phone Number (Y/N)");
		String option2Sel = scn.next();
		while (!option2Sel.equals("Y") && !option2Sel.equals("y") && !option2Sel.equals("N")
				&& !option2Sel.equals("n")) {
			System.out.println("Modify Phone Number (Y/N)");
			optionSel = scn.next();
		}
		if (option2Sel.equals("Y") || option2Sel.equals("y")) {
			System.out.println("New Phone Number :");
			s1.setPhone(scn.next());
		}
		return s1;

	}
	
	

	public static void main(String[] args) {
		
		Hosteller stu = getHostellerDetails();
		System.out.println("The Student Details :" + stu.getStudentId() + " " + stu.getName() + " " + stu.getDepartmentId()
				+ " " + stu.getGender() + " " + stu.getPhone() + " " + stu.getHostelName() + " "
				+ stu.getRoomNumber());
//		System.out.println(stu.toString());
	}

}
