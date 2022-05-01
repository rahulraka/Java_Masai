package com.S4D1.ques2;
import java.util.*;
public class IndianState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		hm.put("Maharashtra","Mumbai");
		hm.put("Goa","Panji");
		hm.put("Kerala","Tiruvananthapuram");
		hm.put("Chattishgarh","Agartala");
		hm.put("Telangana","Hyderabad");
		
		for(Map.Entry<String,String> me:hm.entrySet()){
			System.out.println("State is "+ me.getKey()+" and the Capital is "+me.getValue());
			}

}

}
