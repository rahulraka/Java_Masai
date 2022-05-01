package com.C2.ques2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket p1=new Ticket();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int tc=s1.nextInt();
		
		System.out.println("Enter the available tickets :");
		int avaTic=s1.nextInt();
		p1.setAvailableTickets(avaTic);
		for(int i=0;i<tc;i++) {
			System.out.println("Enter the tickedId :");
			int id=s1.nextInt();
			p1.setTicketId(id);
			System.out.println("enter The Price :");
			int price=s1.nextInt();
			p1.setPrice(price);
			System.out.println("Enter the number of tickets :");
			int wantTick=s1.nextInt();
			System.out.println("Available Tickets :"+ p1.getAvailableTickets());
			System.out.println("Total amount :"+ p1.calculateTicketCost(wantTick));
			System.out.println("Available ticket after booking:"+ p1.getAvailableTickets());
			System.out.println(" ");
			System.out.println(" ");
		}
		s1.close();
		

	}
}
