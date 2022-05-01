package com.S3D2.ques2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Username :");
		String username=sc.next();
		boolean checkUser=Pattern.matches("[a-zA-Z]{3,8}", username);		
		System.out.println("Enter Your Password :");
		String password=sc.next();
		boolean checkPass=Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		System.out.println("Enter Your Mobile Number :");
		String mobile=sc.next();
		boolean checkMobile=Pattern.matches("[6789]{1}[0-9]{9}", mobile);
		System.out.println("Enter Your Email :");
		String email=sc.next();
		boolean checkEmail=Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", email);
		
			if(checkUser && checkPass && checkMobile && checkEmail) {
				Customer c1=new Customer(username, password, mobile, email);
				System.out.println("Your Username is :"+c1.getUsername());
				System.out.println("Your Password is :"+c1.getPassword());
				System.out.println("Your Mobile Number is :"+c1.getMobileNumber());
				System.out.println("Your Email is :"+c1.getEmail());		
			}
			else {
				if(!checkUser) {
					System.out.println("Invalid Username");
				}
				if(!checkPass) {
					System.out.println("Invalid Password");
				}
				if(!checkMobile) {
					System.out.println("Invalid Mobile Number");
				}
				if(!checkEmail) {
					System.out.println("Invalid Email Address");
				}
			}
		
	}

}
