package com.Eval3.ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose from the Option");
		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search Book by author");
		System.out.println("4. Count number of book- by book Name");
		System.out.println("5. Exit");
		System.out.println("Enter your Choice");
		int inp=sc.nextInt();
		Library l1=new Library();
		while(inp<6 && inp>0) {
			if(inp==1) {
				System.out.println("Enter the isbn No:");
				int isbn=sc.nextInt();
				System.out.println("Enter the Book Name");
				String bName=sc.next();
				System.out.println("Enter the Author Name");
				String aName=sc.next();
				Book b1=new Book(isbn,bName,aName);
				l1.addbook(b1);	
			}
			else if(inp==2) {
				ArrayList<Book> b=l1.viewAllBooks();
				for(Book r1:b) {
					System.out.println("ISBN No :"+r1.getIsbn() +" Book Name is "+r1.getBookName()+" Author Name is "+r1.getAuthor());	
				}
			}
			else if(inp==3) {
				System.out.println("Enter Author Name ");
				String n=sc.next();
				ArrayList<Book> b=l1.viewBooksByAuthor(n);
				for(Book r1:b) {
					System.out.println("ISBN No :"+r1.getIsbn() +" Book Name is "+r1.getBookName()+" Author Name is "+r1.getAuthor());	
				}
			}
			else if(inp==4) {
				System.out.println("Enter Book Name to count");
				String bn=sc.next();
				System.out.println("Count of Books "+l1.countNoOfBook(bn));
			}
			else if(inp==5) {
				System.out.println("Thank You...!!!");
				break;
			}
			
			
			System.out.println("Choose from the Option");
			System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3. Search Book by author");
			System.out.println("4. Count number of book- by book Name");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice");
			inp=sc.nextInt();
		}
		

	}

}
