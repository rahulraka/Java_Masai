package com.masai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;
import com.masai.service.BookService;

@RestController
public class Controller1 {
	@Autowired
	BookService bs;
	
	@GetMapping("/books")
	public List<Book> listOfBook(){
		List<Book> l1=bs.bookList();
		return l1;
	}
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable ("id") Integer id){
		Book l1=bs.getBookById(id);
		return l1;
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book be) {
		Book newBook=bs.addBook(be);
		return newBook;
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteById(@PathVariable ("id") Integer id) {
		return bs.deleteBookById(id);
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable ("id") Integer id, @RequestBody Book newBook) {
		Book updatedBook=bs.updateBookById(id, newBook);
		return updatedBook;
	}
	
	

}
