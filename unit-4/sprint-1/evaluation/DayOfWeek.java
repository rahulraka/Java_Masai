package com.evaluation1;

public class DayOfWeek {
	static void dayOfWeek(int day, boolean holiday) {
		if((day >= 1 && day <=5) && holiday == false) {
			System.out.println("Wake up at 7:00");
		}
		else if((day >= 1 && day <=5) && holiday == true) {
			System.out.println("Sleep in!");
		}
		else if((day == 6 || day ==7) && (holiday == true || holiday == false)) {
			System.out.println("Sleep in!");
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfTheWeek = 5;
		boolean holiday = false;
		dayOfWeek(dayOfTheWeek,holiday);
		

	}

}
