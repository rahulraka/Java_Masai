package com.Day3;

public class VowelConsonant {
	void checkVowelConsonant(char inp) {
		if(inp<'A' || inp>'z') {
			System.out.println("Invalid Character");
		}
		else if((inp == 'a') || (inp=='A')||(inp=='e')|| (inp=='E') || (inp=='i') || (inp=='I') || (inp== 'o' )||(inp=='O')|| (inp=='u') || (inp=='U')) {
			System.out.println("Entered Character is a Vowel");
		}
		else {
			System.out.println("Entered Character is a Consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonant check1=new VowelConsonant();
		check1.checkVowelConsonant('1');
		check1.checkVowelConsonant('A');
		check1.checkVowelConsonant('B');
		
		

	}

}
