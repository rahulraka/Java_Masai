package com.evaluation1;

public class AlarmClock {
	
	void alarmClock(int day, boolean n) {
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			if(n==true) {
				System.out.println("10:00");
			}
		}
		else if(day==0 || day==6) {
			if(n==true) {
				System.out.println("off");
			}
		}
		else if(day==1 || day==2 || day==3 || day==4 || day==5) {
			if(n==false) {
				System.out.println("7:00");
			}
		}
		else if(day==0 || day==6) {
			if(n==false) {
				System.out.println("10:00");
			}
		}
		else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmClock check1=new AlarmClock();
		check1.alarmClock(5, true);
		check1.alarmClock(0, true);
		check1.alarmClock(1,false );
		check1.alarmClock(8, false);
		

	}

}
