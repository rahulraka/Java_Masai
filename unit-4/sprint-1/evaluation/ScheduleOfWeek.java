package com.evaluation1;

public class ScheduleOfWeek {
	
	 static String schedule;
	
	static void scheduleOfWeek(int day) {
		switch (day){
		case 1:
			schedule="Gym in the morning";
			break;
		case 2:
			schedule="Class after work.";
			break;
		case 3:
			schedule="Meetings all day.";
			break;
		case 4:
			schedule="Work from home.";
			break;
		case 5:
			schedule="Game night after work.";
			break;
		case 6:
			schedule="Free!";
			break;
		case 7:
			schedule="Free!";
			break;
			default:
				schedule="Free!";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek = 5;
		ScheduleOfWeek check=new ScheduleOfWeek();
		scheduleOfWeek(dayOfWeek);
		System.out.println(schedule);
		

	}

}
