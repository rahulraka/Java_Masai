package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.BookNotFoundException;
import com.masai.exceptions.NoDataFoundException;
import com.masai.model.Book;
import com.masai.repository.BookDao;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookDao b1;
	
	

	@Override
	public List<Book> bookList() throws NoDataFoundException {
		// TODO Auto-generated method stub
		List<Book> l1=b1.findAll();
		if(l1.isEmpty()) throw new NoDataFoundException("No Books available.");
		else return l1;
	}
	
	

	@Override
	public Book addBook(Book b) {
		Book newBook=b1.save(b);
		return newBook;
	}
	
	

	@Override
	public Book getBookById(Integer id) throws BookNotFoundException {
//		Optional<Book> op=b1.findById(id);
//		Book gotBook=op.get();
//		return gotBook;
		return b1.findById(id).orElseThrow(()-> new BookNotFoundException("Book Doesn't exist in Database with Id "+id));
	}

	
	
	@Override
	public String deleteBookById(Integer id) throws BookNotFoundException {
		Book gotBook=b1.findById(id).orElseThrow(()-> new BookNotFoundException("Book Doesn't exist in Database with Id "+id));
		b1.delete(gotBook);
		return "Your Book was Deleted with Id "+id;
	}



	@Override
	public Book updateBookById(Integer id, Book toUpdate) throws BookNotFoundException {
		Book gotBook=b1.findById(id).orElseThrow(()-> new BookNotFoundException("Book Doesn't exist in Database with Id "+id));
		Book newBook=b1.save(toUpdate);
		return newBook;
	}
	
	
	

	

}
