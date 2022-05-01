package com.day5;

import java.util.Scanner;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	

	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static int getAvailableTickets() {
		return availableTickets;
	}


	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {			
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int noofTickets) {
		if(availableTickets>0) {
			
			availableTickets-=noofTickets;
			int total=noofTickets*price;
			return total;
		}
		else {
			return -1;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket p1=new Ticket();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int tc=s1.nextInt();
		
		System.out.println("Enter the available tickets :");
		int avaTic=s1.nextInt();
		setAvailableTickets(avaTic);
		for(int i=0;i<tc;i++) {
			System.out.println("Enter the tickedId :");
			int id=s1.nextInt();
			p1.ticketId=id;
			System.out.println("enter The Price :");
			int price=s1.nextInt();
			p1.price=price;
			System.out.println("Enter the number of tickets :");
			int wantTick=s1.nextInt();
			System.out.println("Total amount :"+ p1.calculateTicketCost(wantTick));
			System.out.println("Available ticket after booking:"+ availableTickets);
		}
		

	}

}
