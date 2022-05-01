package com.Day3;

public class CheckWeather {
	
	static void checkWeather(Boolean isSnowing, Boolean isRaining, int Temp) {
		if(isSnowing==true || isRaining==true || Temp>=50 || Temp<=10) {
			System.out.println("Lets Stay Home");
		}
		else {
			System.out.println("Lets go Out");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkWeather(true, false, 30);

	}

}
