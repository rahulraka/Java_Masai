package com.S4D1.ques1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMarksComparator implements Comparator<Map.Entry<String, Student>>{
@Override
public int compare(Map.Entry<String, Student>m1, Map.Entry<String, Student>m2) {
		
		Student s1=m1.getValue();
		Student s2=m2.getValue();
		
		return s1.getMarks()>s2.getMarks()? 1:-1;
		
	}

}
