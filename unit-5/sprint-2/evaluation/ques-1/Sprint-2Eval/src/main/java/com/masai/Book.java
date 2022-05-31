package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private Integer book_id;
	private String name;
	private String author;
	private Double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer book_id, String name, String author, Double d) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.author = author;
		this.price = d;
	}

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Book> addList() {
//		Book b1=new Book();
		List<Book> l1 = new ArrayList();
		l1.add(new Book((Integer) 101, "Harry potter", "Nolan", 1500.00));
		l1.add(new Book((Integer) 111, "Twilight", "Christofer", 1200.00));
		l1.add(new Book((Integer) 121, "Retired", "Newland", 1600.00));
		l1.add(new Book((Integer) 131, "Sorcersers", "Uniano", 2100.00));
		l1.add(new Book((Integer) 141, "Madara Ucchia", "Nolan", 5100.00));
		return l1;
	}

}
