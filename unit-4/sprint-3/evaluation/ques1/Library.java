package com.Eval3.ques1;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> s1=new ArrayList<>();
	
	void addbook(Book book) {
		s1.add(book);
		System.out.println("Book is Added Successfully");
	}
	boolean isEmpty() {
		return s1.isEmpty();
	}
	ArrayList<Book> viewAllBooks(){
		return s1;
	}
	
	
	ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> r1=new ArrayList<>();
		boolean flag=true;
		for(Book s:s1) {
			if(s.getAuthor().equalsIgnoreCase(author)){
				r1.add(s);
				flag=false;
			}
		}
		if(flag) {
       System.out.println("None of the books are available of"+author);
		}
		return r1;
		
		
	}
	int countNoOfBook(String bname) {
		int count=0;
		for(Book s:s1) {
			if(s.getAuthor().equalsIgnoreCase(bname)){
				count++;
			}
			
		}
		return count;
		
		
	}

}
