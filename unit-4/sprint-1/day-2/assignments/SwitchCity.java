package com.Day1;

public class SwitchCity {
	
static void switchCity(String city){
		switch(city) {
		case "Mumbai":
		System.out.println("Financial City");
		break;
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Bangalore":
			System.out.println("Cyber City");
			break;
		case "Delhi":
			System.out.println("Capital of the country");
			break;
		default:
			System.out.println("May be Other Indian City");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCity("Bihar");
	}

}
