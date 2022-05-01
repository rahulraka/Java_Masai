package com.day4;

public class Question4 {
	void roundingOff(int n) {
		if(n<0) {
			System.out.println("error");
		}
		else if(n%2!=0) {
			System.out.println(n);
		}
		else {
			System.out.println((n)+(10-(n%10)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 check=new Question4();
		check.roundingOff(44);
		check.roundingOff(45);
		check.roundingOff(-5);

	}

}
