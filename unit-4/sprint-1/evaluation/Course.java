package com.evaluation1;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	void displayCourseDetails(int courseId, String courseName, int coursrFee) {
		System.out.println("CourseId id: "+ courseId + " Course Name is:"+ courseName+ " Course Fee is:" + courseFee);
	}
	static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234") {
			Course obj1=new Course();
			obj1.courseId=154;
			obj1.courseFee=1500;
			obj1.courseName="MAH";
			obj1.displayCourseDetails(obj1.courseId, obj1.courseName,  obj1.courseFee);
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		authenticate("Admin", "1234");
		authenticate("ad", "123");

	}

}
