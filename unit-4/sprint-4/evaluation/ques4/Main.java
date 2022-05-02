package Eval4.ques4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> l1=new ArrayList<>();
		l1.add(new Student(123,"Rahul",500));
		l1.add(new Student(114,"Najju",100));
		l1.add(new Student(143,"Raja",200));
		l1.add(new Student(152,"Depeka",400));
		l1.add(new Student(154,"Payal",100));
		
		
		Stream<Student> s1=l1.stream();
		List<Employee> lmain= s1.map(s-> new Employee(s.getRoll(),s.getName(),s.getMarks()*1000)).collect(Collectors.toList());;
	
		System.out.println(lmain);
		
		
		Collections.sort(lmain,(t1,t2)-> t1.getSalary()<t2.getSalary()? 1:-1);
		System.out.println(lmain);
	}

}
