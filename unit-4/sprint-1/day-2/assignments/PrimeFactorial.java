package com.Day1;

public class PrimeFactorial {
	
	static void primeFactorial(int N) {
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactorial(12);

	}

}
