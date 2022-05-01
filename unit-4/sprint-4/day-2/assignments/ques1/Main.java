package com.S4D2.ques1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	public static void printList(List<Integer> list, Predicate<Integer> predicate) {
		list.forEach(i -> {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		});
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		
		while(true) {
			System.out.println("Enter a number");
			nums.add(sc.nextInt());
			System.out.println("Want to enter more numbers? (1/0)");
			if(sc.nextInt() != 1)
				break;
		}
		
		Consumer<String> sopConsumer = System.out::println; 
		
		sopConsumer.accept("Even Numbers");
		printList(nums, i -> i%2==0);
		
		
		sopConsumer.accept("================");
		
		sopConsumer.accept("Numbers Greater Than 9");
		printList(nums, i -> i>9);
		
		
		sopConsumer.accept("================");
		
		sopConsumer.accept("All Numbers");
		printList(nums, i -> true);
		
		sc.close();

	

	}
	
}
