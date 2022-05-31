package com.masai;

import java.util.List;

public class CityList {
	private List<String> ls;

	public void setLs(List<String> ls) {
		this.ls = ls;
	}
	
	public void show() {
		System.out.println("Inside City List Show Function");
		System.out.println(ls);
		System.out.println("Function ends here");
	}
	
	

}
