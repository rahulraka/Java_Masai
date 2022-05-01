package com.S4D1.ques1;
import java.util.*;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerala",new Student(18,"Srinu",880));
		
		
		List<Map.Entry<String, Student>> al=new ArrayList(hm.entrySet());
		Collections.sort(al, new StudentMarksComparator());
		
		Map<String, Student> link=new LinkedHashMap<>();
		for(Map.Entry<String, Student> me:al) {
			link.put(me.getKey(), me.getValue());
		}
		for(Map.Entry<String, Student> s:link.entrySet()) {
			System.out.println(s);
			
		}
		
		
		
		
		
		
		

	}

}
