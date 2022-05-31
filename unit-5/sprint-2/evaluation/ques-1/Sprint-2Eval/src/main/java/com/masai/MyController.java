package com.masai;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	
	@GetMapping("/books")
	public List<Book> funList(){
		Book b1=new Book();
		return b1.addList();
	}
	
	@GetMapping(value="/fromid/{id}")
	public Book searchFromList(@PathVariable ("id") Integer id) {
		Book b1=new Book();
		List<Book> l1=b1.addList();
		for(Book s:l1) {
			if(s.getBook_id()==id) return s;
		}
		return null;
	}
	@PostMapping(value="/addbook")
	public String adding(@RequestBody Book b1) {
		Book b2=new Book();
		List<Book> l1=b2.addList();
		try {
				
			l1.add(b1);
			return "Book is saved i the Database";	
		}
		catch (Exception e) {
			return "Book was not added";
			// TODO: handle exception
		}
		
		
	}
	@DeleteMapping(value="/delete/{id}")
	public List<Book> deletefromid(@PathVariable ("id") int id){
		Book b2=new Book();
		List<Book> l1=b2.addList();
		l1.removeIf(s->s.getBook_id() == id);
		return l1;
	}
	
}
