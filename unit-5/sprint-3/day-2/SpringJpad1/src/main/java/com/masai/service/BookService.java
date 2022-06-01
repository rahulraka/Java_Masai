package com.masai.service;


import java.util.List;

import com.masai.exceptions.BookNotFoundException;
import com.masai.exceptions.NoDataFoundException;
import com.masai.model.Book;



public interface BookService {
	
	public List<Book> bookList() throws NoDataFoundException;
	public Book addBook(Book b);
	public Book getBookById(Integer id) throws BookNotFoundException;
	public String deleteBookById(Integer id) throws BookNotFoundException;
	public Book updateBookById(Integer id, Book toUpdate) throws BookNotFoundException;
}
