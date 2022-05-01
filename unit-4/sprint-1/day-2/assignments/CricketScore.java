package com.Day1;

public class CricketScore {
	
	static void totalScore(int ones, int twos, int thres, int fors, int six) {
		int total=(1*ones)+(2*twos)+(3*thres)+(4*fors)+(6*six);
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalScore(1,3,2,1,0);

	}

}
